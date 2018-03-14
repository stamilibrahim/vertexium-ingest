package org.visallo.user;

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

public class User extends org.w3.www.owl.Thing {
  public static final String IRI = "http://visallo.org/user#user";

  public User(String id) { super(id); }

  public String getIri() { return IRI; }

  public static final StringVisalloProperty AUTHORIZATIONS = new StringVisalloProperty("http://visallo.org/user#authorizations");
  public PropertyAddition<String> setAuthorizations(Object value) { return addAuthorizations("", value); }
  public PropertyAddition<String> addAuthorizations(String key, Object value) { return addStringProperty(AUTHORIZATIONS.getPropertyName(), key, value); }

  public static final DateVisalloProperty CREATE_DATE = new DateVisalloProperty("http://visallo.org/user#createDate");
  public PropertyAddition<Date> setCreateDate(Object value, SimpleDateFormat dateFormat) { return addCreateDate("", value, dateFormat); }
  public PropertyAddition<Date> addCreateDate(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(CREATE_DATE.getPropertyName(), key, value, dateFormat); }

  public static final DateVisalloProperty CURRENT_LOGIN_DATE = new DateVisalloProperty("http://visallo.org/user#currentLoginDate");
  public PropertyAddition<Date> setCurrentLoginDate(Object value, SimpleDateFormat dateFormat) { return addCurrentLoginDate("", value, dateFormat); }
  public PropertyAddition<Date> addCurrentLoginDate(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(CURRENT_LOGIN_DATE.getPropertyName(), key, value, dateFormat); }

  public static final StringVisalloProperty CURRENT_LOGIN_REMOTE_ADDR = new StringVisalloProperty("http://visallo.org/user#currentLoginRemoteAddr");
  public PropertyAddition<String> setCurrentLoginRemoteAddr(Object value) { return addCurrentLoginRemoteAddr("", value); }
  public PropertyAddition<String> addCurrentLoginRemoteAddr(String key, Object value) { return addStringProperty(CURRENT_LOGIN_REMOTE_ADDR.getPropertyName(), key, value); }

  public static final StringVisalloProperty CURRENT_WORKSPACE = new StringVisalloProperty("http://visallo.org/user#currentWorkspace");
  public PropertyAddition<String> setCurrentWorkspace(Object value) { return addCurrentWorkspace("", value); }
  public PropertyAddition<String> addCurrentWorkspace(String key, Object value) { return addStringProperty(CURRENT_WORKSPACE.getPropertyName(), key, value); }

  public static final StringVisalloProperty DISPLAY_NAME = new StringVisalloProperty("http://visallo.org/user#displayName");
  public PropertyAddition<String> setDisplayName(Object value) { return addDisplayName("", value); }
  public PropertyAddition<String> addDisplayName(String key, Object value) { return addStringProperty(DISPLAY_NAME.getPropertyName(), key, value); }

  public static final StringVisalloProperty EMAIL_ADDRESS = new StringVisalloProperty("http://visallo.org/user#emailAddress");
  public PropertyAddition<String> setEmailAddress(Object value) { return addEmailAddress("", value); }
  public PropertyAddition<String> addEmailAddress(String key, Object value) { return addStringProperty(EMAIL_ADDRESS.getPropertyName(), key, value); }

  public static final DoubleVisalloProperty LOGIN_COUNT = new DoubleVisalloProperty("http://visallo.org/user#loginCount");
  public PropertyAddition<Double> setLoginCount(Object value) { return addLoginCount("", value); }
  public PropertyAddition<Double> addLoginCount(String key, Object value) { return addDoubleProperty(LOGIN_COUNT.getPropertyName(), key, value); }

  public static final ByteArrayVisalloProperty PASSWORD_HASH = new ByteArrayVisalloProperty("http://visallo.org/user#passwordHash");
  public PropertyAddition<byte[]> setPasswordHash(Object value) { return addPasswordHash("", value); }
  public PropertyAddition<byte[]> addPasswordHash(String key, Object value) { return addByteArrayProperty(PASSWORD_HASH.getPropertyName(), key, value); }

  public static final StringVisalloProperty PASSWORD_RESET_TOKEN = new StringVisalloProperty("http://visallo.org/user#passwordResetToken");
  public PropertyAddition<String> setPasswordResetToken(Object value) { return addPasswordResetToken("", value); }
  public PropertyAddition<String> addPasswordResetToken(String key, Object value) { return addStringProperty(PASSWORD_RESET_TOKEN.getPropertyName(), key, value); }

  public static final DateVisalloProperty PASSWORD_RESET_TOKEN_EXPIRATION_DATE = new DateVisalloProperty("http://visallo.org/user#passwordResetTokenExpirationDate");
  public PropertyAddition<Date> setPasswordResetTokenExpirationDate(Object value, SimpleDateFormat dateFormat) { return addPasswordResetTokenExpirationDate("", value, dateFormat); }
  public PropertyAddition<Date> addPasswordResetTokenExpirationDate(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(PASSWORD_RESET_TOKEN_EXPIRATION_DATE.getPropertyName(), key, value, dateFormat); }

  public static final ByteArrayVisalloProperty PASSWORD_SALT = new ByteArrayVisalloProperty("http://visallo.org/user#passwordSalt");
  public PropertyAddition<byte[]> setPasswordSalt(Object value) { return addPasswordSalt("", value); }
  public PropertyAddition<byte[]> addPasswordSalt(String key, Object value) { return addByteArrayProperty(PASSWORD_SALT.getPropertyName(), key, value); }

  public static final DateVisalloProperty PREVIOUS_LOGIN_DATE = new DateVisalloProperty("http://visallo.org/user#previousLoginDate");
  public PropertyAddition<Date> setPreviousLoginDate(Object value, SimpleDateFormat dateFormat) { return addPreviousLoginDate("", value, dateFormat); }
  public PropertyAddition<Date> addPreviousLoginDate(String key, Object value, SimpleDateFormat dateFormat) { return addDateProperty(PREVIOUS_LOGIN_DATE.getPropertyName(), key, value, dateFormat); }

  public static final StringVisalloProperty PREVIOUS_LOGIN_REMOTE_ADDR = new StringVisalloProperty("http://visallo.org/user#previousLoginRemoteAddr");
  public PropertyAddition<String> setPreviousLoginRemoteAddr(Object value) { return addPreviousLoginRemoteAddr("", value); }
  public PropertyAddition<String> addPreviousLoginRemoteAddr(String key, Object value) { return addStringProperty(PREVIOUS_LOGIN_REMOTE_ADDR.getPropertyName(), key, value); }

  public static final StringVisalloProperty PRIVILEGES = new StringVisalloProperty("http://visallo.org/user#privileges");
  public PropertyAddition<String> setPrivileges(Object value) { return addPrivileges("", value); }
  public PropertyAddition<String> addPrivileges(String key, Object value) { return addStringProperty(PRIVILEGES.getPropertyName(), key, value); }

  public static final StringVisalloProperty STATUS = new StringVisalloProperty("http://visallo.org/user#status");
  public PropertyAddition<String> setStatus(Object value) { return addStatus("", value); }
  public PropertyAddition<String> addStatus(String key, Object value) { return addStringProperty(STATUS.getPropertyName(), key, value); }

  public static final StringVisalloProperty UI_PREFERENCES = new StringVisalloProperty("http://visallo.org/user#uiPreferences");
  public PropertyAddition<String> setUiPreferences(Object value) { return addUiPreferences("", value); }
  public PropertyAddition<String> addUiPreferences(String key, Object value) { return addStringProperty(UI_PREFERENCES.getPropertyName(), key, value); }

  public static final StringVisalloProperty USERNAME = new StringVisalloProperty("http://visallo.org/user#username");
  public PropertyAddition<String> setUsername(Object value) { return addUsername("", value); }
  public PropertyAddition<String> addUsername(String key, Object value) { return addStringProperty(USERNAME.getPropertyName(), key, value); }
}
