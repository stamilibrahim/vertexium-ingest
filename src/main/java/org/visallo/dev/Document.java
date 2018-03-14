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

public class Document extends org.visallo.dev.Raw {
  public static final String IRI = "http://visallo.org/dev#document";

  public Document(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty SENTIMENT = new StringVisalloProperty("http://visallo.org/dev#sentiment");
  public PropertyAddition<String> setSentiment(Object value) { return addSentiment("", value); }
  public PropertyAddition<String> addSentiment(String key, Object value) { return addStringProperty(SENTIMENT.getPropertyName(), key, value); }
}
