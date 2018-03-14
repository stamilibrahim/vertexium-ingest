package org.visallo.termMention;

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

public class TermMention extends org.w3.www.owl.Thing {
  public static final String IRI = "http://visallo.org/termMention#termMention";

  public TermMention(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty CONCEPT_TYPE = new StringVisalloProperty("http://visallo.org/termMention#conceptType");
  public PropertyAddition<String> setConceptType(Object value) { return addConceptType("", value); }
  public PropertyAddition<String> addConceptType(String key, Object value) { return addStringProperty(CONCEPT_TYPE.getPropertyName(), key, value); }

  public static final DoubleVisalloProperty END_OFFSET = new DoubleVisalloProperty("http://visallo.org/termMention#endOffset");
  public PropertyAddition<Double> setEndOffset(Object value) { return addEndOffset("", value); }
  public PropertyAddition<Double> addEndOffset(String key, Object value) { return addDoubleProperty(END_OFFSET.getPropertyName(), key, value); }

  public static final StringVisalloProperty FOR_ELEMENT_ID = new StringVisalloProperty("http://visallo.org/termMention#forElementId");
  public PropertyAddition<String> setForElementId(Object value) { return addForElementId("", value); }
  public PropertyAddition<String> addForElementId(String key, Object value) { return addStringProperty(FOR_ELEMENT_ID.getPropertyName(), key, value); }

  public static final StringVisalloProperty FOR_TYPE = new StringVisalloProperty("http://visallo.org/termMention#forType");
  public PropertyAddition<String> setForType(Object value) { return addForType("", value); }
  public PropertyAddition<String> addForType(String key, Object value) { return addStringProperty(FOR_TYPE.getPropertyName(), key, value); }

  public static final StringVisalloProperty PROCESS = new StringVisalloProperty("http://visallo.org/termMention#process");
  public PropertyAddition<String> setProcess(Object value) { return addProcess("", value); }
  public PropertyAddition<String> addProcess(String key, Object value) { return addStringProperty(PROCESS.getPropertyName(), key, value); }

  public static final StringVisalloProperty PROPERTY_KEY = new StringVisalloProperty("http://visallo.org/termMention#propertyKey");
  public PropertyAddition<String> setPropertyKey(Object value) { return addPropertyKey("", value); }
  public PropertyAddition<String> addPropertyKey(String key, Object value) { return addStringProperty(PROPERTY_KEY.getPropertyName(), key, value); }

  public static final StringVisalloProperty REF_PROPERTY_KEY = new StringVisalloProperty("http://visallo.org/termMention#ref/propertyKey");
  public PropertyAddition<String> setRefPropertyKey(Object value) { return addRefPropertyKey("", value); }
  public PropertyAddition<String> addRefPropertyKey(String key, Object value) { return addStringProperty(REF_PROPERTY_KEY.getPropertyName(), key, value); }

  public static final StringVisalloProperty REF_PROPERTY_NAME = new StringVisalloProperty("http://visallo.org/termMention#ref/propertyName");
  public PropertyAddition<String> setRefPropertyName(Object value) { return addRefPropertyName("", value); }
  public PropertyAddition<String> addRefPropertyName(String key, Object value) { return addStringProperty(REF_PROPERTY_NAME.getPropertyName(), key, value); }

  public static final StringVisalloProperty REF_PROPERTY_VISIBILITY = new StringVisalloProperty("http://visallo.org/termMention#ref/propertyVisibility");
  public PropertyAddition<String> setRefPropertyVisibility(Object value) { return addRefPropertyVisibility("", value); }
  public PropertyAddition<String> addRefPropertyVisibility(String key, Object value) { return addStringProperty(REF_PROPERTY_VISIBILITY.getPropertyName(), key, value); }

  public static final StringVisalloProperty RESOLVED_EDGE_ID = new StringVisalloProperty("http://visallo.org/termMention#resolvedEdgeId");
  public PropertyAddition<String> setResolvedEdgeId(Object value) { return addResolvedEdgeId("", value); }
  public PropertyAddition<String> addResolvedEdgeId(String key, Object value) { return addStringProperty(RESOLVED_EDGE_ID.getPropertyName(), key, value); }

  public static final StringVisalloProperty SNIPPET = new StringVisalloProperty("http://visallo.org/termMention#snippet");
  public PropertyAddition<String> setSnippet(Object value) { return addSnippet("", value); }
  public PropertyAddition<String> addSnippet(String key, Object value) { return addStringProperty(SNIPPET.getPropertyName(), key, value); }

  public static final DoubleVisalloProperty START_OFFSET = new DoubleVisalloProperty("http://visallo.org/termMention#startOffset");
  public PropertyAddition<Double> setStartOffset(Object value) { return addStartOffset("", value); }
  public PropertyAddition<Double> addStartOffset(String key, Object value) { return addDoubleProperty(START_OFFSET.getPropertyName(), key, value); }

  public static final StringVisalloProperty TITLE = new StringVisalloProperty("http://visallo.org/termMention#title");
  public PropertyAddition<String> setTitle(Object value) { return addTitle("", value); }
  public PropertyAddition<String> addTitle(String key, Object value) { return addStringProperty(TITLE.getPropertyName(), key, value); }

  public static final StringVisalloProperty VISIBILITY_JSON = new StringVisalloProperty("http://visallo.org/termMention#visibilityJson");
  public PropertyAddition<String> setVisibilityJson(Object value) { return addVisibilityJson("", value); }
  public PropertyAddition<String> addVisibilityJson(String key, Object value) { return addStringProperty(VISIBILITY_JSON.getPropertyName(), key, value); }
}
