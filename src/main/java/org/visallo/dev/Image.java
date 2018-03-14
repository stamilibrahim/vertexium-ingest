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

public class Image extends org.visallo.dev.Raw {
  public static final String IRI = "http://visallo.org/dev#image";

  public Image(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty GEO_LOCATION_AND_DATE = new StringVisalloProperty("http://visallo.org/dev#geoLocationAndDate");
  public PropertyAddition<String> setGeoLocationAndDate(Object value) { return addGeoLocationAndDate("", value); }
  public PropertyAddition<String> addGeoLocationAndDate(String key, Object value) { return addStringProperty(GEO_LOCATION_AND_DATE.getPropertyName(), key, value); }

  public static final DateVisalloProperty LAST_MODIFY_DATE = new DateVisalloProperty("http://visallo.org/dev#lastModifyDate");
  public PropertyAddition<Date> setLastModifyDate(Object value, SimpleDateFormat dateFormat) { return addLastModifyDate("", value, dateFormat); }
  public PropertyAddition<Date> addLastModifyDate(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(LAST_MODIFY_DATE.getPropertyName(), key, value, dateFormat); }

  public static final IntegerVisalloProperty CLOCKWISE_ROTATION = new IntegerVisalloProperty("http://visallo.org/media#clockwiseRotation");
  public PropertyAddition<Integer> setClockwiseRotation(Object value) { return addClockwiseRotation("", value); }
  public PropertyAddition<Integer> addClockwiseRotation(String key, Object value) { return addIntegerProperty(CLOCKWISE_ROTATION.getPropertyName(), key, value); }

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

  public static final DoubleVisalloProperty IMAGE_HEADING = new DoubleVisalloProperty("http://visallo.org/media#imageHeading");
  public PropertyAddition<Double> setImageHeading(Object value) { return addImageHeading("", value); }
  public PropertyAddition<Double> addImageHeading(String key, Object value) { return addDoubleProperty(IMAGE_HEADING.getPropertyName(), key, value); }

  public static final StringVisalloProperty METADATA = new StringVisalloProperty("http://visallo.org/media#metadata");
  public PropertyAddition<String> setMetadata(Object value) { return addMetadata("", value); }
  public PropertyAddition<String> addMetadata(String key, Object value) { return addStringProperty(METADATA.getPropertyName(), key, value); }

  public static final IntegerVisalloProperty WIDTH = new IntegerVisalloProperty("http://visallo.org/media#width");
  public PropertyAddition<Integer> setWidth(Object value) { return addWidth("", value); }
  public PropertyAddition<Integer> addWidth(String key, Object value) { return addIntegerProperty(WIDTH.getPropertyName(), key, value); }

  public static final BooleanVisalloProperty Y_AXIS_FLIPPED = new BooleanVisalloProperty("http://visallo.org/media#yAxisFlipped");
  public PropertyAddition<Boolean> setYAxisFlipped(Object value) { return addYAxisFlipped("", value); }
  public PropertyAddition<Boolean> addYAxisFlipped(String key, Object value) { return addBooleanProperty(Y_AXIS_FLIPPED.getPropertyName(), key, value); }
}
