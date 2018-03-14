package org.visallo.ping;

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

public class Ping extends org.w3.www.owl.Thing {
  public static final String IRI = "http://visallo.org/ping#ping";

  public Ping(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final DateVisalloProperty CREATE_DATE = new DateVisalloProperty("http://visallo.org/ping#createDate");
  public PropertyAddition<Date> setCreateDate(Object value, SimpleDateFormat dateFormat) { return addCreateDate("", value, dateFormat); }
  public PropertyAddition<Date> addCreateDate(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(CREATE_DATE.getPropertyName(), key, value, dateFormat); }

  public static final StringVisalloProperty CREATE_REMOTE_ADDR = new StringVisalloProperty("http://visallo.org/ping#createRemoteAddr");
  public PropertyAddition<String> setCreateRemoteAddr(Object value) { return addCreateRemoteAddr("", value); }
  public PropertyAddition<String> addCreateRemoteAddr(String key, Object value) { return addStringProperty(CREATE_REMOTE_ADDR.getPropertyName(), key, value); }

  public static final DateVisalloProperty GPW_DATE = new DateVisalloProperty("http://visallo.org/ping#gpwDate");
  public PropertyAddition<Date> setGpwDate(Object value, SimpleDateFormat dateFormat) { return addGpwDate("", value, dateFormat); }
  public PropertyAddition<Date> addGpwDate(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(GPW_DATE.getPropertyName(), key, value, dateFormat); }

  public static final StringVisalloProperty GPW_HOST_ADDRESS = new StringVisalloProperty("http://visallo.org/ping#gpwHostAddress");
  public PropertyAddition<String> setGpwHostAddress(Object value) { return addGpwHostAddress("", value); }
  public PropertyAddition<String> addGpwHostAddress(String key, Object value) { return addStringProperty(GPW_HOST_ADDRESS.getPropertyName(), key, value); }

  public static final StringVisalloProperty GPW_HOSTNAME = new StringVisalloProperty("http://visallo.org/ping#gpwHostname");
  public PropertyAddition<String> setGpwHostname(Object value) { return addGpwHostname("", value); }
  public PropertyAddition<String> addGpwHostname(String key, Object value) { return addStringProperty(GPW_HOSTNAME.getPropertyName(), key, value); }

  public static final IntegerVisalloProperty GPW_WAIT_TIME_MS = new IntegerVisalloProperty("http://visallo.org/ping#gpwWaitTimeMs");
  public PropertyAddition<Integer> setGpwWaitTimeMs(Object value) { return addGpwWaitTimeMs("", value); }
  public PropertyAddition<Integer> addGpwWaitTimeMs(String key, Object value) { return addIntegerProperty(GPW_WAIT_TIME_MS.getPropertyName(), key, value); }

  public static final DateVisalloProperty LRP_DATE = new DateVisalloProperty("http://visallo.org/ping#lrpDate");
  public PropertyAddition<Date> setLrpDate(Object value, SimpleDateFormat dateFormat) { return addLrpDate("", value, dateFormat); }
  public PropertyAddition<Date> addLrpDate(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(LRP_DATE.getPropertyName(), key, value, dateFormat); }

  public static final StringVisalloProperty LRP_HOST_ADDRESS = new StringVisalloProperty("http://visallo.org/ping#lrpHostAddress");
  public PropertyAddition<String> setLrpHostAddress(Object value) { return addLrpHostAddress("", value); }
  public PropertyAddition<String> addLrpHostAddress(String key, Object value) { return addStringProperty(LRP_HOST_ADDRESS.getPropertyName(), key, value); }

  public static final StringVisalloProperty LRP_HOSTNAME = new StringVisalloProperty("http://visallo.org/ping#lrpHostname");
  public PropertyAddition<String> setLrpHostname(Object value) { return addLrpHostname("", value); }
  public PropertyAddition<String> addLrpHostname(String key, Object value) { return addStringProperty(LRP_HOSTNAME.getPropertyName(), key, value); }

  public static final IntegerVisalloProperty LRP_WAIT_TIME_MS = new IntegerVisalloProperty("http://visallo.org/ping#lrpWaitTimeMs");
  public PropertyAddition<Integer> setLrpWaitTimeMs(Object value) { return addLrpWaitTimeMs("", value); }
  public PropertyAddition<Integer> addLrpWaitTimeMs(String key, Object value) { return addIntegerProperty(LRP_WAIT_TIME_MS.getPropertyName(), key, value); }

  public static final IntegerVisalloProperty RETRIEVAL_TIME_MS = new IntegerVisalloProperty("http://visallo.org/ping#retrievalTimeMs");
  public PropertyAddition<Integer> setRetrievalTimeMs(Object value) { return addRetrievalTimeMs("", value); }
  public PropertyAddition<Integer> addRetrievalTimeMs(String key, Object value) { return addIntegerProperty(RETRIEVAL_TIME_MS.getPropertyName(), key, value); }

  public static final IntegerVisalloProperty SEARCH_TIME_MS = new IntegerVisalloProperty("http://visallo.org/ping#searchTimeMs");
  public PropertyAddition<Integer> setSearchTimeMs(Object value) { return addSearchTimeMs("", value); }
  public PropertyAddition<Integer> addSearchTimeMs(String key, Object value) { return addIntegerProperty(SEARCH_TIME_MS.getPropertyName(), key, value); }
}
