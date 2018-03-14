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

public class Raw extends org.w3.www.owl.Thing {
  public static final String IRI = "http://visallo.org/dev#raw";

  public Raw(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty ARTIFACT_TITLE = new StringVisalloProperty("http://visallo.org/dev#artifactTitle");
  public PropertyAddition<String> setArtifactTitle(Object value) { return addArtifactTitle("", value); }
  public PropertyAddition<String> addArtifactTitle(String key, Object value) { return addStringProperty(ARTIFACT_TITLE.getPropertyName(), key, value); }

  public static final DateVisalloProperty PUBLISHED_DATE = new DateVisalloProperty("http://visallo.org/dev#publishedDate");
  public PropertyAddition<Date> setPublishedDate(Object value, SimpleDateFormat dateFormat) { return addPublishedDate("", value, dateFormat); }
  public PropertyAddition<Date> addPublishedDate(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(PUBLISHED_DATE.getPropertyName(), key, value, dateFormat); }
}
