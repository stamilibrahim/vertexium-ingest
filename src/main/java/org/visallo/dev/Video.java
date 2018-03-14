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

public class Video extends org.visallo.dev.Raw {
  public static final String IRI = "http://visallo.org/dev#video";

  public Video(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final DoubleVisalloProperty DURATION = new DoubleVisalloProperty("http://visallo.org/dev#duration");
  public PropertyAddition<Double> setDuration(Object value) { return addDuration("", value); }
  public PropertyAddition<Double> addDuration(String key, Object value) { return addDoubleProperty(DURATION.getPropertyName(), key, value); }

  public static final DateVisalloProperty LAST_MODIFY_DATE = new DateVisalloProperty("http://visallo.org/dev#lastModifyDate");
  public PropertyAddition<Date> setLastModifyDate(Object value, SimpleDateFormat dateFormat) { return addLastModifyDate("", value, dateFormat); }
  public PropertyAddition<Date> addLastModifyDate(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(LAST_MODIFY_DATE.getPropertyName(), key, value, dateFormat); }

  public static final DateVisalloProperty DATE_TAKEN = new DateVisalloProperty("http://visallo.org/media#dateTaken");
  public PropertyAddition<Date> setDateTaken(Object value, SimpleDateFormat dateFormat) { return addDateTaken("", value, dateFormat); }
  public PropertyAddition<Date> addDateTaken(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(DATE_TAKEN.getPropertyName(), key, value, dateFormat); }

  public static final StringVisalloProperty DEVICE_MAKE = new StringVisalloProperty("http://visallo.org/media#deviceMake");
  public PropertyAddition<String> setDeviceMake(Object value) { return addDeviceMake("", value); }
  public PropertyAddition<String> addDeviceMake(String key, Object value) { return addStringProperty(DEVICE_MAKE.getPropertyName(), key, value); }

  public static final StringVisalloProperty DEVICE_MODEL = new StringVisalloProperty("http://visallo.org/media#deviceModel");
  public PropertyAddition<String> setDeviceModel(Object value) { return addDeviceModel("", value); }
  public PropertyAddition<String> addDeviceModel(String key, Object value) { return addStringProperty(DEVICE_MODEL.getPropertyName(), key, value); }

  public static final IntegerVisalloProperty FILE_SIZE = new IntegerVisalloProperty("http://visallo.org/media#fileSize");
  public PropertyAddition<Integer> setFileSize(Object value) { return addFileSize("", value); }
  public PropertyAddition<Integer> addFileSize(String key, Object value) { return addIntegerProperty(FILE_SIZE.getPropertyName(), key, value); }

  public static final IntegerVisalloProperty HEIGHT = new IntegerVisalloProperty("http://visallo.org/media#height");
  public PropertyAddition<Integer> setHeight(Object value) { return addHeight("", value); }
  public PropertyAddition<Integer> addHeight(String key, Object value) { return addIntegerProperty(HEIGHT.getPropertyName(), key, value); }

  public static final StringVisalloProperty METADATA = new StringVisalloProperty("http://visallo.org/media#metadata");
  public PropertyAddition<String> setMetadata(Object value) { return addMetadata("", value); }
  public PropertyAddition<String> addMetadata(String key, Object value) { return addStringProperty(METADATA.getPropertyName(), key, value); }

  public static final IntegerVisalloProperty WIDTH = new IntegerVisalloProperty("http://visallo.org/media#width");
  public PropertyAddition<Integer> setWidth(Object value) { return addWidth("", value); }
  public PropertyAddition<Integer> addWidth(String key, Object value) { return addIntegerProperty(WIDTH.getPropertyName(), key, value); }
}
