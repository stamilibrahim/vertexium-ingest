package org.visallo.workspace;

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

public class DashboardItem extends org.w3.www.owl.Thing {
  public static final String IRI = "http://visallo.org/workspace#dashboardItem";

  public DashboardItem(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty CONFIGURATION = new StringVisalloProperty("http://visallo.org/workspace#configuration");
  public PropertyAddition<String> setConfiguration(Object value) { return addConfiguration("", value); }
  public PropertyAddition<String> addConfiguration(String key, Object value) { return addStringProperty(CONFIGURATION.getPropertyName(), key, value); }

  public static final StringVisalloProperty EXTENSION_ID = new StringVisalloProperty("http://visallo.org/workspace#extensionId");
  public PropertyAddition<String> setExtensionId(Object value) { return addExtensionId("", value); }
  public PropertyAddition<String> addExtensionId(String key, Object value) { return addStringProperty(EXTENSION_ID.getPropertyName(), key, value); }
}
