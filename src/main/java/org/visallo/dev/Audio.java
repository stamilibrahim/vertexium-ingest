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

public class Audio extends org.visallo.dev.Raw {
  public static final String IRI = "http://visallo.org/dev#audio";

  public Audio(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final DoubleVisalloProperty DURATION = new DoubleVisalloProperty("http://visallo.org/dev#duration");
  public PropertyAddition<Double> setDuration(Object value) { return addDuration("", value); }
  public PropertyAddition<Double> addDuration(String key, Object value) { return addDoubleProperty(DURATION.getPropertyName(), key, value); }

  public static final IntegerVisalloProperty FILE_SIZE = new IntegerVisalloProperty("http://visallo.org/media#fileSize");
  public PropertyAddition<Integer> setFileSize(Object value) { return addFileSize("", value); }
  public PropertyAddition<Integer> addFileSize(String key, Object value) { return addIntegerProperty(FILE_SIZE.getPropertyName(), key, value); }
}
