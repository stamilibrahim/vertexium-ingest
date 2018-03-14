import org.apache.accumulo.core.data.Mutation;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.*;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.visallo.core.util.VisalloLogger;
import org.visallo.core.util.VisalloLoggerFactory;

import java.io.IOException;


/**
 * Created by ibrahim on 1/31/17.
 */
public class Blueray extends Configured implements Tool {
    private static final VisalloLogger LOGGER = VisalloLoggerFactory.getLogger(Blueray.class);

    public int run(String[] args) throws Exception {
        // check if arguments are given correctly
        if (args.length < 2){
            System.out.println("Please give input and output parameters properly\n");
            return -1;
        }

        // create new job configurations
        JobConf conf = new JobConf(Blueray.class);

        // set input and output paths
        FileInputFormat.setInputPaths(conf, new Path(args[0]));
        FileOutputFormat.setOutputPath(conf, new Path(args[1]));

        // set mapper and reducer classes
        conf.setMapperClass(BluerayMapper.class);
        // conf.setReducerClass(WordReducer.class);

        // set the output classes for the mapper
        // key class
        conf.setMapOutputKeyClass(Text.class);
        // value class
        conf.setMapOutputValueClass(Mutation.class);

        // set final output classes
        // key class
        conf.setOutputKeyClass(Text.class);
        // value class
        conf.setOutputValueClass(Mutation.class);

        JobClient.runJob(conf);

        return 0;
    }

    public static void main(String args[]) throws Exception {
        int exitCode = ToolRunner.run(new Blueray(), args);
        System.exit(exitCode);
    }
}