package org.visallo.longRunningProcess;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;
import org.vertexium.type.GeoPoint;
import org.visallo.core.model.properties.types.*;
import org.visallo.tools.ontology.ingest.common.EntityBuilder;
import org.visallo.tools.ontology.ingest.common.ConceptBuilder;
import org.visallo.tools.ontology.ingest.common.RelationshipBuilder;
import org.visallo.tools.ontology.ingest.common.PropertyAddition;

public class LongRunningProcess extends org.w3.www.owl.Thing {
  public static final String IRI = "http://visallo.org/longRunningProcess#longRunningProcess";

  public LongRunningProcess(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty QUEUE_ITEM_JSON = new StringVisalloProperty("http://visallo.org/longRunningProcess#queueItemJson");
  public PropertyAddition<String> setQueueItemJson(Object value) { return addQueueItemJson("", value); }
  public PropertyAddition<String> addQueueItemJson(String key, Object value) { return addStringProperty(QUEUE_ITEM_JSON.getPropertyName(), key, value); }
}
