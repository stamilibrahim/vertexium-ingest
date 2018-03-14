import org.apache.accumulo.core.client.AccumuloException;
import org.apache.accumulo.core.client.AccumuloSecurityException;
import org.apache.accumulo.core.data.Mutation;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;
import org.vertexium.*;
import org.vertexium.accumulo.AccumuloGraph;
import org.vertexium.accumulo.AccumuloGraphConfiguration;
import org.visallo.core.model.properties.VisalloProperties;
import org.visallo.core.util.VisalloLogger;
import org.visallo.core.util.VisalloLoggerFactory;
import org.visallo.dev.Called;
import org.visallo.dev.PhoneNumber;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ibrahim on 3/10/17.
 */
public class BluerayMapper extends MapReduceBase implements
        org.apache.hadoop.mapred.Mapper <LongWritable, Text, Text, Mutation> {

    /*
    This class does the actual ingestion.
    It class the BluerayMapper class and stores the result of the mapping into a BluerayCallEvent object
    The data items of the call data record are then ingested with the right relationships being mapped.
     */

    private static final VisalloLogger LOGGER = VisalloLoggerFactory.getLogger(BluerayMapper.class);
    private static final String MULTI_VALUE_KEY = BluerayMapper.class.getName();

    private BluerayParser parser;
    private AccumuloGraph graph;
    private Visibility visibility;
    private BluerayCounters counter;

    public BluerayMapper() throws AccumuloException, URISyntaxException, AccumuloSecurityException,
            InterruptedException, IOException {

        this.counter = new BluerayCounters();
        this.parser = new BluerayParser();
        this.visibility = Visibility.EMPTY;

        // specify Accumulo config, more options than shown are available
        Map mapConfig = new HashMap();

        // configuration values - key <-> value pairs in map
        mapConfig.put(AccumuloGraphConfiguration.ACCUMULO_INSTANCE_NAME, "visallo");
        mapConfig.put(AccumuloGraphConfiguration.ACCUMULO_USERNAME, "root");
        mapConfig.put(AccumuloGraphConfiguration.ACCUMULO_PASSWORD, "password");
        mapConfig.put(AccumuloGraphConfiguration.ZOOKEEPER_SERVERS, "localhost");
        mapConfig.put(AccumuloGraphConfiguration.TABLE_NAME_PREFIX, "visallo_vertexium");

        // create new configuration obj from mapConfig
        AccumuloGraphConfiguration graphConfig = new AccumuloGraphConfiguration(mapConfig);

        this.graph = AccumuloGraph.create(graphConfig);

    }

    public void map(LongWritable filePosition, Text line, OutputCollector<Text, Mutation> output, Reporter r) throws
            IOException {
        try {
            safeMap(line);
        } catch (Exception ex) {
            LOGGER.error("failed mapping " + filePosition, ex);
        }
    }

    //parse line and store it in a BluerayCallEvent obj
    private void safeMap(Text line) throws InterruptedException, AccumuloSecurityException, IOException,
            AccumuloException, URISyntaxException, ParseException, IllegalAccessException, InvocationTargetException {
        BluerayCallEvent event = this.parser.parseLine(line.toString());
        ingest(event.getCaller_msisdn(), event.getCallee_msisdn(), event.generateEventId());
        this.graph.flush();
    }


    private int ingest (String caller_msisdn, String callee_msisdn, String eventid) throws AccumuloException,
            URISyntaxException, AccumuloSecurityException, InterruptedException, IOException {

        Date now = new Date();
        String modifiedByValue = "INSTAGRAM:@thatguyibrahim";
        VertexBuilder vb;

        //ingest caller number
        this.counter.PNONENUMBERS_ATTEMPTED += 1;
        vb = this.graph.prepareVertex("BLUERAY_PHONE_NUMBER_" + caller_msisdn, visibility);
        VisalloProperties.CONCEPT_TYPE.setProperty(vb, PhoneNumber.IRI, visibility);
        VisalloProperties.TITLE.addPropertyValue(vb, MULTI_VALUE_KEY, caller_msisdn, visibility);
        VisalloProperties.MODIFIED_DATE.setProperty(vb, now, visibility);
        VisalloProperties.MODIFIED_BY.setProperty(vb, modifiedByValue, visibility);
        Vertex callerVertex = vb.save(this.graph.createAuthorizations());
        this.graph.flush();
        this.counter.PHONENUMBERS_PROCESSED += 1;

        //ingest callee number
        this.counter.PNONENUMBERS_ATTEMPTED += 1;
        vb = this.graph.prepareVertex("BLUERAY_PHONE_NUMBER_" + callee_msisdn, visibility);
        VisalloProperties.CONCEPT_TYPE.setProperty(vb, PhoneNumber.IRI, visibility);
        VisalloProperties.TITLE.addPropertyValue(vb, MULTI_VALUE_KEY, callee_msisdn, visibility);
        VisalloProperties.MODIFIED_DATE.setProperty(vb, now, visibility);
        VisalloProperties.MODIFIED_BY.setProperty(vb, modifiedByValue, visibility);
        Vertex calleeVertex = vb.save(this.graph.createAuthorizations());
        this.graph.flush();
        this.counter.PHONENUMBERS_PROCESSED += 1;

        // add edge linking phone number to event
        this.counter.EDGES_ATTEMPTED += 1;
        EdgeBuilder edge = this.graph.prepareEdge("BLUERAY_CALLEDGE_" + eventid,
                callerVertex, calleeVertex, Called.IRI, visibility);
        edge.save(this.graph.createAuthorizations());
        this.graph.flush();
        this.counter.EDGES_PROCESSED += 1;
        return 0;

    }
}
