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

public class Person extends org.w3.www.owl.Thing {
  public static final String IRI = "http://visallo.org/dev#person";

  public Person(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty ADDRESS_PROP = new StringVisalloProperty("http://visallo.org/dev#addressProp");
  public PropertyAddition<String> setAddressProp(Object value) { return addAddressProp("", value); }
  public PropertyAddition<String> addAddressProp(String key, Object value) { return addStringProperty(ADDRESS_PROP.getPropertyName(), key, value); }

  public static final StringVisalloProperty ALIAS = new StringVisalloProperty("http://visallo.org/dev#alias");
  public PropertyAddition<String> setAlias(Object value) { return addAlias("", value); }
  public PropertyAddition<String> addAlias(String key, Object value) { return addStringProperty(ALIAS.getPropertyName(), key, value); }

  public static final DateVisalloProperty BIRTH_DATE = new DateVisalloProperty("http://visallo.org/dev#birthDate");
  public PropertyAddition<Date> setBirthDate(Object value, SimpleDateFormat dateFormat) { return addBirthDate("", value, dateFormat); }
  public PropertyAddition<Date> addBirthDate(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(BIRTH_DATE.getPropertyName(), key, value, dateFormat); }

  public static final StringVisalloProperty BIRTH_DATE_ERROR = new StringVisalloProperty("http://visallo.org/dev#birthDateError");
  public PropertyAddition<String> setBirthDateError(Object value) { return addBirthDateError("", value); }
  public PropertyAddition<String> addBirthDateError(String key, Object value) { return addStringProperty(BIRTH_DATE_ERROR.getPropertyName(), key, value); }

  public static final StringVisalloProperty CITY_PROP = new StringVisalloProperty("http://visallo.org/dev#cityProp");
  public PropertyAddition<String> setCityProp(Object value) { return addCityProp("", value); }
  public PropertyAddition<String> addCityProp(String key, Object value) { return addStringProperty(CITY_PROP.getPropertyName(), key, value); }

  public static final StringVisalloProperty EYECOLOR = new StringVisalloProperty("http://visallo.org/dev#eyecolor");
  public PropertyAddition<String> setEyecolor(Object value) { return addEyecolor("", value); }
  public PropertyAddition<String> addEyecolor(String key, Object value) { return addStringProperty(EYECOLOR.getPropertyName(), key, value); }

  public static final StringVisalloProperty FIRST_NAME = new StringVisalloProperty("http://visallo.org/dev#firstName");
  public PropertyAddition<String> setFirstName(Object value) { return addFirstName("", value); }
  public PropertyAddition<String> addFirstName(String key, Object value) { return addStringProperty(FIRST_NAME.getPropertyName(), key, value); }

  public static final StringVisalloProperty GENDER = new StringVisalloProperty("http://visallo.org/dev#gender");
  public PropertyAddition<String> setGender(Object value) { return addGender("", value); }
  public PropertyAddition<String> addGender(String key, Object value) { return addStringProperty(GENDER.getPropertyName(), key, value); }

  public static final StringVisalloProperty HAIRCOLOR = new StringVisalloProperty("http://visallo.org/dev#haircolor");
  public PropertyAddition<String> setHaircolor(Object value) { return addHaircolor("", value); }
  public PropertyAddition<String> addHaircolor(String key, Object value) { return addStringProperty(HAIRCOLOR.getPropertyName(), key, value); }

  public static final StringVisalloProperty LAST_NAME = new StringVisalloProperty("http://visallo.org/dev#lastName");
  public PropertyAddition<String> setLastName(Object value) { return addLastName("", value); }
  public PropertyAddition<String> addLastName(String key, Object value) { return addStringProperty(LAST_NAME.getPropertyName(), key, value); }

  public static final StringVisalloProperty MIDDLE_NAME = new StringVisalloProperty("http://visallo.org/dev#middleName");
  public PropertyAddition<String> setMiddleName(Object value) { return addMiddleName("", value); }
  public PropertyAddition<String> addMiddleName(String key, Object value) { return addStringProperty(MIDDLE_NAME.getPropertyName(), key, value); }

  public static final StringVisalloProperty NAME = new StringVisalloProperty("http://visallo.org/dev#name");
  public PropertyAddition<String> setName(Object value) { return addName("", value); }
  public PropertyAddition<String> addName(String key, Object value) { return addStringProperty(NAME.getPropertyName(), key, value); }

  public static final StringVisalloProperty NAME_ERROR = new StringVisalloProperty("http://visallo.org/dev#nameError");
  public PropertyAddition<String> setNameError(Object value) { return addNameError("", value); }
  public PropertyAddition<String> addNameError(String key, Object value) { return addStringProperty(NAME_ERROR.getPropertyName(), key, value); }

  public static final StringVisalloProperty NATIONALITY = new StringVisalloProperty("http://visallo.org/dev#nationality");
  public PropertyAddition<String> setNationality(Object value) { return addNationality("", value); }
  public PropertyAddition<String> addNationality(String key, Object value) { return addStringProperty(NATIONALITY.getPropertyName(), key, value); }

  public static final StringVisalloProperty STATE_PROP = new StringVisalloProperty("http://visallo.org/dev#stateProp");
  public PropertyAddition<String> setStateProp(Object value) { return addStateProp("", value); }
  public PropertyAddition<String> addStateProp(String key, Object value) { return addStringProperty(STATE_PROP.getPropertyName(), key, value); }

  public static final StringVisalloProperty STREET_1 = new StringVisalloProperty("http://visallo.org/dev#street1");
  public PropertyAddition<String> setStreet1(Object value) { return addStreet1("", value); }
  public PropertyAddition<String> addStreet1(String key, Object value) { return addStringProperty(STREET_1.getPropertyName(), key, value); }

  public static final StringVisalloProperty STREET_2 = new StringVisalloProperty("http://visallo.org/dev#street2");
  public PropertyAddition<String> setStreet2(Object value) { return addStreet2("", value); }
  public PropertyAddition<String> addStreet2(String key, Object value) { return addStringProperty(STREET_2.getPropertyName(), key, value); }

  public static final StringVisalloProperty ZIP_CODE_PROP = new StringVisalloProperty("http://visallo.org/dev#zipCodeProp");
  public PropertyAddition<String> setZipCodeProp(Object value) { return addZipCodeProp("", value); }
  public PropertyAddition<String> addZipCodeProp(String key, Object value) { return addStringProperty(ZIP_CODE_PROP.getPropertyName(), key, value); }
}
