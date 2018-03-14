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

public class Workspace extends org.w3.www.owl.Thing {
  public static final String IRI = "http://visallo.org/workspace#workspace";

  public Workspace(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty WORKSPACE_TITLE = new StringVisalloProperty("http://visallo.org/workspace#workspace/title");
  public PropertyAddition<String> setWorkspaceTitle(Object value) { return addWorkspaceTitle("", value); }
  public PropertyAddition<String> addWorkspaceTitle(String key, Object value) { return addStringProperty(WORKSPACE_TITLE.getPropertyName(), key, value); }
}
