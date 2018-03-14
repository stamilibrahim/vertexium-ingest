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

public class Organization extends org.w3.www.owl.Thing {
  public static final String IRI = "http://visallo.org/dev#organization";

  public Organization(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty ABBREVIATION = new StringVisalloProperty("http://visallo.org/dev#abbreviation");
  public PropertyAddition<String> setAbbreviation(Object value) { return addAbbreviation("", value); }
  public PropertyAddition<String> addAbbreviation(String key, Object value) { return addStringProperty(ABBREVIATION.getPropertyName(), key, value); }

  public static final DateVisalloProperty FORMATION_DATE = new DateVisalloProperty("http://visallo.org/dev#formationDate");
  public PropertyAddition<Date> setFormationDate(Object value, SimpleDateFormat dateFormat) { return addFormationDate("", value, dateFormat); }
  public PropertyAddition<Date> addFormationDate(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(FORMATION_DATE.getPropertyName(), key, value, dateFormat); }
}
