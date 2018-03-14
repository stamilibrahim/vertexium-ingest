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

public class Event extends org.w3.www.owl.Thing {
  public static final String IRI = "http://visallo.org/dev#event";

  public Event(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty GEO_LOCATION_AND_DATE = new StringVisalloProperty("http://visallo.org/dev#geoLocationAndDate");
  public PropertyAddition<String> setGeoLocationAndDate(Object value) { return addGeoLocationAndDate("", value); }
  public PropertyAddition<String> addGeoLocationAndDate(String key, Object value) { return addStringProperty(GEO_LOCATION_AND_DATE.getPropertyName(), key, value); }
}
