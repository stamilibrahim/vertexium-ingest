package org.visallo.search;

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

public class SavedSearch extends org.w3.www.owl.Thing {
  public static final String IRI = "http://visallo.org/search#savedSearch";

  public SavedSearch(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty NAME = new StringVisalloProperty("http://visallo.org/search#name");
  public PropertyAddition<String> setName(Object value) { return addName("", value); }
  public PropertyAddition<String> addName(String key, Object value) { return addStringProperty(NAME.getPropertyName(), key, value); }

  public static final StringVisalloProperty PARAMETERS = new StringVisalloProperty("http://visallo.org/search#parameters");
  public PropertyAddition<String> setParameters(Object value) { return addParameters("", value); }
  public PropertyAddition<String> addParameters(String key, Object value) { return addStringProperty(PARAMETERS.getPropertyName(), key, value); }

  public static final StringVisalloProperty URL = new StringVisalloProperty("http://visallo.org/search#url");
  public PropertyAddition<String> setUrl(Object value) { return addUrl("", value); }
  public PropertyAddition<String> addUrl(String key, Object value) { return addStringProperty(URL.getPropertyName(), key, value); }
}
