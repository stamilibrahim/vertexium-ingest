package org.w3.www.owl;

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

public class Thing extends org.visallo.Root {
  public static final String IRI = "http://www.w3.org/2002/07/owl#Thing";

  public Thing(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final ByteArrayVisalloProperty AUDIO_MP_3 = new ByteArrayVisalloProperty("http://visallo.org#audio-mp3");
  public PropertyAddition<byte[]> setAudioMp3(Object value) { return addAudioMp3("", value); }
  public PropertyAddition<byte[]> addAudioMp3(String key, Object value) { return addByteArrayProperty(AUDIO_MP_3.getPropertyName(), key, value); }

  public static final ByteArrayVisalloProperty AUDIO_MP_4 = new ByteArrayVisalloProperty("http://visallo.org#audio-mp4");
  public PropertyAddition<byte[]> setAudioMp4(Object value) { return addAudioMp4("", value); }
  public PropertyAddition<byte[]> addAudioMp4(String key, Object value) { return addByteArrayProperty(AUDIO_MP_4.getPropertyName(), key, value); }

  public static final ByteArrayVisalloProperty AUDIO_OGG = new ByteArrayVisalloProperty("http://visallo.org#audio-ogg");
  public PropertyAddition<byte[]> setAudioOgg(Object value) { return addAudioOgg("", value); }
  public PropertyAddition<byte[]> addAudioOgg(String key, Object value) { return addByteArrayProperty(AUDIO_OGG.getPropertyName(), key, value); }

  public static final ByteArrayVisalloProperty CACHED_IMAGE = new ByteArrayVisalloProperty("http://visallo.org#cached-image");
  public PropertyAddition<byte[]> setCachedImage(Object value) { return addCachedImage("", value); }
  public PropertyAddition<byte[]> addCachedImage(String key, Object value) { return addByteArrayProperty(CACHED_IMAGE.getPropertyName(), key, value); }

  public static final StringVisalloProperty CONCEPT_TYPE = new StringVisalloProperty("http://visallo.org#conceptType");
  public PropertyAddition<String> setConceptType(Object value) { return addConceptType("", value); }
  public PropertyAddition<String> addConceptType(String key, Object value) { return addStringProperty(CONCEPT_TYPE.getPropertyName(), key, value); }

  public static final DoubleVisalloProperty CONFIDENCE = new DoubleVisalloProperty("http://visallo.org#confidence");
  public PropertyAddition<Double> setConfidence(Object value) { return addConfidence("", value); }
  public PropertyAddition<Double> addConfidence(String key, Object value) { return addDoubleProperty(CONFIDENCE.getPropertyName(), key, value); }

  public static final StringVisalloProperty CONTENT_HASH = new StringVisalloProperty("http://visallo.org#contentHash");
  public PropertyAddition<String> setContentHash(Object value) { return addContentHash("", value); }
  public PropertyAddition<String> addContentHash(String key, Object value) { return addStringProperty(CONTENT_HASH.getPropertyName(), key, value); }

  public static final StringVisalloProperty DATA_TYPE = new StringVisalloProperty("http://visallo.org#dataType");
  public PropertyAddition<String> setDataType(Object value) { return addDataType("", value); }
  public PropertyAddition<String> addDataType(String key, Object value) { return addStringProperty(DATA_TYPE.getPropertyName(), key, value); }

  public static final StringVisalloProperty DETECTED_OBJECT = new StringVisalloProperty("http://visallo.org#detectedObject");
  public PropertyAddition<String> setDetectedObject(Object value) { return addDetectedObject("", value); }
  public PropertyAddition<String> addDetectedObject(String key, Object value) { return addStringProperty(DETECTED_OBJECT.getPropertyName(), key, value); }

  public static final StringVisalloProperty ENTITY_IMAGE_URL = new StringVisalloProperty("http://visallo.org#entityImageUrl");
  public PropertyAddition<String> setEntityImageUrl(Object value) { return addEntityImageUrl("", value); }
  public PropertyAddition<String> addEntityImageUrl(String key, Object value) { return addStringProperty(ENTITY_IMAGE_URL.getPropertyName(), key, value); }

  public static final StringVisalloProperty ENTITY_IMAGE_VERTEX_ID = new StringVisalloProperty("http://visallo.org#entityImageVertexId");
  public PropertyAddition<String> setEntityImageVertexId(Object value) { return addEntityImageVertexId("", value); }
  public PropertyAddition<String> addEntityImageVertexId(String key, Object value) { return addStringProperty(ENTITY_IMAGE_VERTEX_ID.getPropertyName(), key, value); }

  public static final StringVisalloProperty FILE_NAME = new StringVisalloProperty("http://visallo.org#fileName");
  public PropertyAddition<String> setFileName(Object value) { return addFileName("", value); }
  public PropertyAddition<String> addFileName(String key, Object value) { return addStringProperty(FILE_NAME.getPropertyName(), key, value); }

  public static final StringVisalloProperty GRAPH_PROPERTY_WORKER_BLACK_LIST = new StringVisalloProperty("http://visallo.org#graphPropertyWorkerBlackList");
  public PropertyAddition<String> setGraphPropertyWorkerBlackList(Object value) { return addGraphPropertyWorkerBlackList("", value); }
  public PropertyAddition<String> addGraphPropertyWorkerBlackList(String key, Object value) { return addStringProperty(GRAPH_PROPERTY_WORKER_BLACK_LIST.getPropertyName(), key, value); }

  public static final StringVisalloProperty GRAPH_PROPERTY_WORKER_WHITE_LIST = new StringVisalloProperty("http://visallo.org#graphPropertyWorkerWhiteList");
  public PropertyAddition<String> setGraphPropertyWorkerWhiteList(Object value) { return addGraphPropertyWorkerWhiteList("", value); }
  public PropertyAddition<String> addGraphPropertyWorkerWhiteList(String key, Object value) { return addStringProperty(GRAPH_PROPERTY_WORKER_WHITE_LIST.getPropertyName(), key, value); }

  public static final StringVisalloProperty MAPPING_JSON = new StringVisalloProperty("http://visallo.org#mappingJson");
  public PropertyAddition<String> setMappingJson(Object value) { return addMappingJson("", value); }
  public PropertyAddition<String> addMappingJson(String key, Object value) { return addStringProperty(MAPPING_JSON.getPropertyName(), key, value); }

  public static final StringVisalloProperty METADATA_JSON = new StringVisalloProperty("http://visallo.org#metadataJson");
  public PropertyAddition<String> setMetadataJson(Object value) { return addMetadataJson("", value); }
  public PropertyAddition<String> addMetadataJson(String key, Object value) { return addStringProperty(METADATA_JSON.getPropertyName(), key, value); }

  public static final StringVisalloProperty MIME_TYPE = new StringVisalloProperty("http://visallo.org#mimeType");
  public PropertyAddition<String> setMimeType(Object value) { return addMimeType("", value); }
  public PropertyAddition<String> addMimeType(String key, Object value) { return addStringProperty(MIME_TYPE.getPropertyName(), key, value); }

  public static final StringVisalloProperty MODIFIED_BY = new StringVisalloProperty("http://visallo.org#modifiedBy");
  public PropertyAddition<String> setModifiedBy(Object value) { return addModifiedBy("", value); }
  public PropertyAddition<String> addModifiedBy(String key, Object value) { return addStringProperty(MODIFIED_BY.getPropertyName(), key, value); }

  public static final DateVisalloProperty MODIFIED_DATE = new DateVisalloProperty("http://visallo.org#modifiedDate");
  public PropertyAddition<Date> setModifiedDate(Object value, SimpleDateFormat dateFormat) { return addModifiedDate("", value, dateFormat); }
  public PropertyAddition<Date> addModifiedDate(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(MODIFIED_DATE.getPropertyName(), key, value, dateFormat); }

  public static final StringVisalloProperty ONTOLOGY_TITLE = new StringVisalloProperty("http://visallo.org#ontologyTitle");
  public PropertyAddition<String> setOntologyTitle(Object value) { return addOntologyTitle("", value); }
  public PropertyAddition<String> addOntologyTitle(String key, Object value) { return addStringProperty(ONTOLOGY_TITLE.getPropertyName(), key, value); }

  public static final StringVisalloProperty PROCESS = new StringVisalloProperty("http://visallo.org#process");
  public PropertyAddition<String> setProcess(Object value) { return addProcess("", value); }
  public PropertyAddition<String> addProcess(String key, Object value) { return addStringProperty(PROCESS.getPropertyName(), key, value); }

  public static final ByteArrayVisalloProperty RAW = new ByteArrayVisalloProperty("http://visallo.org#raw");
  public PropertyAddition<byte[]> setRaw(Object value) { return addRaw("", value); }
  public PropertyAddition<byte[]> addRaw(String key, Object value) { return addByteArrayProperty(RAW.getPropertyName(), key, value); }

  public static final ByteArrayVisalloProperty RAW_POSTER_FRAME = new ByteArrayVisalloProperty("http://visallo.org#rawPosterFrame");
  public PropertyAddition<byte[]> setRawPosterFrame(Object value) { return addRawPosterFrame("", value); }
  public PropertyAddition<byte[]> addRawPosterFrame(String key, Object value) { return addByteArrayProperty(RAW_POSTER_FRAME.getPropertyName(), key, value); }

  public static final StringVisalloProperty ROW_KEY = new StringVisalloProperty("http://visallo.org#rowKey");
  public PropertyAddition<String> setRowKey(Object value) { return addRowKey("", value); }
  public PropertyAddition<String> addRowKey(String key, Object value) { return addStringProperty(ROW_KEY.getPropertyName(), key, value); }

  public static final StringVisalloProperty SOURCE = new StringVisalloProperty("http://visallo.org#source");
  public PropertyAddition<String> setSource(Object value) { return addSource("", value); }
  public PropertyAddition<String> addSource(String key, Object value) { return addStringProperty(SOURCE.getPropertyName(), key, value); }

  public static final StringVisalloProperty SOURCE_URL = new StringVisalloProperty("http://visallo.org#sourceUrl");
  public PropertyAddition<String> setSourceUrl(Object value) { return addSourceUrl("", value); }
  public PropertyAddition<String> addSourceUrl(String key, Object value) { return addStringProperty(SOURCE_URL.getPropertyName(), key, value); }

  public static final StringVisalloProperty TEXT = new StringVisalloProperty("http://visallo.org#text");
  public PropertyAddition<String> setText(Object value) { return addText("", value); }
  public PropertyAddition<String> addText(String key, Object value) { return addStringProperty(TEXT.getPropertyName(), key, value); }

  public static final StringVisalloProperty TITLE = new StringVisalloProperty("http://visallo.org#title");
  public PropertyAddition<String> setTitle(Object value) { return addTitle("", value); }
  public PropertyAddition<String> addTitle(String key, Object value) { return addStringProperty(TITLE.getPropertyName(), key, value); }

  public static final ByteArrayVisalloProperty VIDEO_MP_4 = new ByteArrayVisalloProperty("http://visallo.org#video-mp4");
  public PropertyAddition<byte[]> setVideoMp4(Object value) { return addVideoMp4("", value); }
  public PropertyAddition<byte[]> addVideoMp4(String key, Object value) { return addByteArrayProperty(VIDEO_MP_4.getPropertyName(), key, value); }

  public static final ByteArrayVisalloProperty VIDEO_WEBM = new ByteArrayVisalloProperty("http://visallo.org#video-webm");
  public PropertyAddition<byte[]> setVideoWebm(Object value) { return addVideoWebm("", value); }
  public PropertyAddition<byte[]> addVideoWebm(String key, Object value) { return addByteArrayProperty(VIDEO_WEBM.getPropertyName(), key, value); }

  public static final ByteArrayVisalloProperty VIDEO_FRAME = new ByteArrayVisalloProperty("http://visallo.org#videoFrame");
  public PropertyAddition<byte[]> setVideoFrame(Object value) { return addVideoFrame("", value); }
  public PropertyAddition<byte[]> addVideoFrame(String key, Object value) { return addByteArrayProperty(VIDEO_FRAME.getPropertyName(), key, value); }

  public static final ByteArrayVisalloProperty VIDEO_PREVIEW_IMAGE = new ByteArrayVisalloProperty("http://visallo.org#videoPreviewImage");
  public PropertyAddition<byte[]> setVideoPreviewImage(Object value) { return addVideoPreviewImage("", value); }
  public PropertyAddition<byte[]> addVideoPreviewImage(String key, Object value) { return addByteArrayProperty(VIDEO_PREVIEW_IMAGE.getPropertyName(), key, value); }

  public static final StringVisalloProperty VISIBILITY_JSON = new StringVisalloProperty("http://visallo.org#visibilityJson");
  public PropertyAddition<String> setVisibilityJson(Object value) { return addVisibilityJson("", value); }
  public PropertyAddition<String> addVisibilityJson(String key, Object value) { return addStringProperty(VISIBILITY_JSON.getPropertyName(), key, value); }

  public static final StringVisalloProperty VISIBILITY_SOURCE = new StringVisalloProperty("http://visallo.org#visibilitySource");
  public PropertyAddition<String> setVisibilitySource(Object value) { return addVisibilitySource("", value); }
  public PropertyAddition<String> addVisibilitySource(String key, Object value) { return addStringProperty(VISIBILITY_SOURCE.getPropertyName(), key, value); }

  public static final StringVisalloProperty ENTRY = new StringVisalloProperty("http://visallo.org/comment#entry");
  public PropertyAddition<String> setEntry(Object value) { return addEntry("", value); }
  public PropertyAddition<String> addEntry(String key, Object value) { return addStringProperty(ENTRY.getPropertyName(), key, value); }

  public static final StringVisalloProperty TO_ENTITY_GRAPH_LAYOUT_JSON = new StringVisalloProperty("http://visallo.org/workspace#toEntity/graphLayoutJson");
  public PropertyAddition<String> setToEntityGraphLayoutJson(Object value) { return addToEntityGraphLayoutJson("", value); }
  public PropertyAddition<String> addToEntityGraphLayoutJson(String key, Object value) { return addStringProperty(TO_ENTITY_GRAPH_LAYOUT_JSON.getPropertyName(), key, value); }

  public static final IntegerVisalloProperty TO_ENTITY_GRAPH_POSITION_X = new IntegerVisalloProperty("http://visallo.org/workspace#toEntity/graphPositionX");
  public PropertyAddition<Integer> setToEntityGraphPositionX(Object value) { return addToEntityGraphPositionX("", value); }
  public PropertyAddition<Integer> addToEntityGraphPositionX(String key, Object value) { return addIntegerProperty(TO_ENTITY_GRAPH_POSITION_X.getPropertyName(), key, value); }

  public static final IntegerVisalloProperty TO_ENTITY_GRAPH_POSITION_Y = new IntegerVisalloProperty("http://visallo.org/workspace#toEntity/graphPositionY");
  public PropertyAddition<Integer> setToEntityGraphPositionY(Object value) { return addToEntityGraphPositionY("", value); }
  public PropertyAddition<Integer> addToEntityGraphPositionY(String key, Object value) { return addIntegerProperty(TO_ENTITY_GRAPH_POSITION_Y.getPropertyName(), key, value); }

  public static final BooleanVisalloProperty TO_ENTITY_VISIBLE = new BooleanVisalloProperty("http://visallo.org/workspace#toEntity/visible");
  public PropertyAddition<Boolean> setToEntityVisible(Object value) { return addToEntityVisible("", value); }
  public PropertyAddition<Boolean> addToEntityVisible(String key, Object value) { return addBooleanProperty(TO_ENTITY_VISIBLE.getPropertyName(), key, value); }

  public static final StringVisalloProperty TO_USER_ACCESS = new StringVisalloProperty("http://visallo.org/workspace#toUser/access");
  public PropertyAddition<String> setToUserAccess(Object value) { return addToUserAccess("", value); }
  public PropertyAddition<String> addToUserAccess(String key, Object value) { return addStringProperty(TO_USER_ACCESS.getPropertyName(), key, value); }

  public static final BooleanVisalloProperty TO_USER_CREATOR = new BooleanVisalloProperty("http://visallo.org/workspace#toUser/creator");
  public PropertyAddition<Boolean> setToUserCreator(Object value) { return addToUserCreator("", value); }
  public PropertyAddition<Boolean> addToUserCreator(String key, Object value) { return addBooleanProperty(TO_USER_CREATOR.getPropertyName(), key, value); }
}
