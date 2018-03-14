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

public class TitleFormulaEntity extends org.w3.www.owl.Thing {
  public static final String IRI = "http://visallo.org/dev#titleFormulaEntity";

  public TitleFormulaEntity(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final BooleanVisalloProperty BOOLEAN = new BooleanVisalloProperty("http://visallo.org/dev#boolean");
  public PropertyAddition<Boolean> setBoolean(Object value) { return addBoolean("", value); }
  public PropertyAddition<Boolean> addBoolean(String key, Object value) { return addBooleanProperty(BOOLEAN.getPropertyName(), key, value); }

  public static final DateVisalloProperty DATE_AND_TIME = new DateVisalloProperty("http://visallo.org/dev#dateAndTime");
  public PropertyAddition<Date> setDateAndTime(Object value, SimpleDateFormat dateFormat) { return addDateAndTime("", value, dateFormat); }
  public PropertyAddition<Date> addDateAndTime(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(DATE_AND_TIME.getPropertyName(), key, value, dateFormat); }

  public static final DateVisalloProperty DATE_ONLY = new DateVisalloProperty("http://visallo.org/dev#dateOnly");
  public PropertyAddition<Date> setDateOnly(Object value, SimpleDateFormat dateFormat) { return addDateOnly("", value, dateFormat); }
  public PropertyAddition<Date> addDateOnly(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(DATE_ONLY.getPropertyName(), key, value, dateFormat); }

  public static final StringVisalloProperty LINK = new StringVisalloProperty("http://visallo.org/dev#link");
  public PropertyAddition<String> setLink(Object value) { return addLink("", value); }
  public PropertyAddition<String> addLink(String key, Object value) { return addStringProperty(LINK.getPropertyName(), key, value); }

  public static final StringVisalloProperty TEXTAREA = new StringVisalloProperty("http://visallo.org/dev#textarea");
  public PropertyAddition<String> setTextarea(Object value) { return addTextarea("", value); }
  public PropertyAddition<String> addTextarea(String key, Object value) { return addStringProperty(TEXTAREA.getPropertyName(), key, value); }

  public static final StringVisalloProperty TITLE_FORMULA_ENTITY_PROP_A = new StringVisalloProperty("http://visallo.org/dev#titleFormulaEntityPropA");
  public PropertyAddition<String> setTitleFormulaEntityPropA(Object value) { return addTitleFormulaEntityPropA("", value); }
  public PropertyAddition<String> addTitleFormulaEntityPropA(String key, Object value) { return addStringProperty(TITLE_FORMULA_ENTITY_PROP_A.getPropertyName(), key, value); }

  public static final StringVisalloProperty TITLE_FORMULA_ENTITY_PROP_B = new StringVisalloProperty("http://visallo.org/dev#titleFormulaEntityPropB");
  public PropertyAddition<String> setTitleFormulaEntityPropB(Object value) { return addTitleFormulaEntityPropB("", value); }
  public PropertyAddition<String> addTitleFormulaEntityPropB(String key, Object value) { return addStringProperty(TITLE_FORMULA_ENTITY_PROP_B.getPropertyName(), key, value); }

  public static final StringVisalloProperty TITLE_FORMULA_ENTITY_PROP_C = new StringVisalloProperty("http://visallo.org/dev#titleFormulaEntityPropC");
  public PropertyAddition<String> setTitleFormulaEntityPropC(Object value) { return addTitleFormulaEntityPropC("", value); }
  public PropertyAddition<String> addTitleFormulaEntityPropC(String key, Object value) { return addStringProperty(TITLE_FORMULA_ENTITY_PROP_C.getPropertyName(), key, value); }

  public static final DateVisalloProperty TITLE_FORMULA_ENTITY_PROP_D = new DateVisalloProperty("http://visallo.org/dev#titleFormulaEntityPropD");
  public PropertyAddition<Date> setTitleFormulaEntityPropD(Object value, SimpleDateFormat dateFormat) { return addTitleFormulaEntityPropD("", value, dateFormat); }
  public PropertyAddition<Date> addTitleFormulaEntityPropD(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(TITLE_FORMULA_ENTITY_PROP_D.getPropertyName(), key, value, dateFormat); }
}
