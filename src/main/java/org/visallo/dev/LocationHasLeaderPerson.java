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

public class LocationHasLeaderPerson extends org.visallo.tools.ontology.ingest.common.RelationshipBuilder {
  public static final String IRI = "http://visallo.org/dev#locationHasLeaderPerson";


  public LocationHasLeaderPerson(String id, org.visallo.dev.Location outVertex, org.visallo.dev.Person inVertex) {
    super(id, inVertex.getId(), inVertex.getIri(), outVertex.getId(), outVertex.getIri());
  } 

  public String getIri() { return IRI; }
}
