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

public class Nonprofit extends org.visallo.dev.Company {
  public static final String IRI = "http://visallo.org/dev#nonprofit";

  public Nonprofit(String id) { super(id); }

  public String getIri() { return IRI; }
}
