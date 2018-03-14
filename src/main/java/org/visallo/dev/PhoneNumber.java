package org.visallo.dev;

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

public class PhoneNumber extends org.visallo.dev.ContactInformation {
  public static final String IRI = "http://visallo.org/dev#phoneNumber";

  public PhoneNumber(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty BASE_STATION = new StringVisalloProperty("http://visallo.org/dev#baseStation");
  public PropertyAddition<String> setBaseStation(Object value) { return addBaseStation("", value); }
  public PropertyAddition<String> addBaseStation(String key, Object value) { return addStringProperty(BASE_STATION.getPropertyName(), key, value); }

  public static final StringVisalloProperty END_LOCATION = new StringVisalloProperty("http://visallo.org/dev#endLocation");
  public PropertyAddition<String> setEndLocation(Object value) { return addEndLocation("", value); }
  public PropertyAddition<String> addEndLocation(String key, Object value) { return addStringProperty(END_LOCATION.getPropertyName(), key, value); }

  public static final StringVisalloProperty IMEI = new StringVisalloProperty("http://visallo.org/dev#imei");
  public PropertyAddition<String> setImei(Object value) { return addImei("", value); }
  public PropertyAddition<String> addImei(String key, Object value) { return addStringProperty(IMEI.getPropertyName(), key, value); }

  public static final StringVisalloProperty IMSI = new StringVisalloProperty("http://visallo.org/dev#imsi");
  public PropertyAddition<String> setImsi(Object value) { return addImsi("", value); }
  public PropertyAddition<String> addImsi(String key, Object value) { return addStringProperty(IMSI.getPropertyName(), key, value); }

  public static final StringVisalloProperty LATITUDE = new StringVisalloProperty("http://visallo.org/dev#latitude");
  public PropertyAddition<String> setLatitude(Object value) { return addLatitude("", value); }
  public PropertyAddition<String> addLatitude(String key, Object value) { return addStringProperty(LATITUDE.getPropertyName(), key, value); }

  public static final StringVisalloProperty LONGITUDE = new StringVisalloProperty("http://visallo.org/dev#longitude");
  public PropertyAddition<String> setLongitude(Object value) { return addLongitude("", value); }
  public PropertyAddition<String> addLongitude(String key, Object value) { return addStringProperty(LONGITUDE.getPropertyName(), key, value); }

  public static final StringVisalloProperty MSISDN = new StringVisalloProperty("http://visallo.org/dev#msisdn");
  public PropertyAddition<String> setMsisdn(Object value) { return addMsisdn("", value); }
  public PropertyAddition<String> addMsisdn(String key, Object value) { return addStringProperty(MSISDN.getPropertyName(), key, value); }

  public static final StringVisalloProperty OPERATOR_NAME = new StringVisalloProperty("http://visallo.org/dev#operatorName");
  public PropertyAddition<String> setOperatorName(Object value) { return addOperatorName("", value); }
  public PropertyAddition<String> addOperatorName(String key, Object value) { return addStringProperty(OPERATOR_NAME.getPropertyName(), key, value); }
}
