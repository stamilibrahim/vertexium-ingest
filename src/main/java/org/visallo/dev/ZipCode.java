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

public class ZipCode extends org.visallo.dev.Location {
  public static final String IRI = "http://visallo.org/dev#zipCode";

  public ZipCode(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty CITY_PROP = new StringVisalloProperty("http://visallo.org/dev#cityProp");
  public PropertyAddition<String> setCityProp(Object value) { return addCityProp("", value); }
  public PropertyAddition<String> addCityProp(String key, Object value) { return addStringProperty(CITY_PROP.getPropertyName(), key, value); }

  public static final StringVisalloProperty STATE_PROP = new StringVisalloProperty("http://visallo.org/dev#stateProp");
  public PropertyAddition<String> setStateProp(Object value) { return addStateProp("", value); }
  public PropertyAddition<String> addStateProp(String key, Object value) { return addStringProperty(STATE_PROP.getPropertyName(), key, value); }

  public static final StringVisalloProperty ZIP_CODE_PROP = new StringVisalloProperty("http://visallo.org/dev#zipCodeProp");
  public PropertyAddition<String> setZipCodeProp(Object value) { return addZipCodeProp("", value); }
  public PropertyAddition<String> addZipCodeProp(String key, Object value) { return addStringProperty(ZIP_CODE_PROP.getPropertyName(), key, value); }
}
