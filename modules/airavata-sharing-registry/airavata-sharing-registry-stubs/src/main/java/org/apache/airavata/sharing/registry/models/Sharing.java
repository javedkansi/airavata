/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.sharing.registry.models;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-04")
public class Sharing implements org.apache.thrift.TBase<Sharing, Sharing._Fields>, java.io.Serializable, Cloneable, Comparable<Sharing> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Sharing");

  private static final org.apache.thrift.protocol.TField PERMISSION_TYPE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("permissionTypeId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ENTITY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("entityId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField GROUP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("groupId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField GROUP_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("groupType", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField SHARING_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("sharingType", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField INHERITED_PARENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("inheritedParentId", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField CREATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTime", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField UPDATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedTime", org.apache.thrift.protocol.TType.I64, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SharingStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SharingTupleSchemeFactory());
  }

  public String permissionTypeId; // optional
  public String entityId; // optional
  public String groupId; // optional
  /**
   * 
   * @see GroupType
   */
  public GroupType groupType; // optional
  /**
   * 
   * @see SharingType
   */
  public SharingType sharingType; // optional
  public String inheritedParentId; // optional
  public long createdTime; // optional
  public long updatedTime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PERMISSION_TYPE_ID((short)1, "permissionTypeId"),
    ENTITY_ID((short)2, "entityId"),
    GROUP_ID((short)3, "groupId"),
    /**
     * 
     * @see GroupType
     */
    GROUP_TYPE((short)4, "groupType"),
    /**
     * 
     * @see SharingType
     */
    SHARING_TYPE((short)5, "sharingType"),
    INHERITED_PARENT_ID((short)6, "inheritedParentId"),
    CREATED_TIME((short)7, "createdTime"),
    UPDATED_TIME((short)8, "updatedTime");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PERMISSION_TYPE_ID
          return PERMISSION_TYPE_ID;
        case 2: // ENTITY_ID
          return ENTITY_ID;
        case 3: // GROUP_ID
          return GROUP_ID;
        case 4: // GROUP_TYPE
          return GROUP_TYPE;
        case 5: // SHARING_TYPE
          return SHARING_TYPE;
        case 6: // INHERITED_PARENT_ID
          return INHERITED_PARENT_ID;
        case 7: // CREATED_TIME
          return CREATED_TIME;
        case 8: // UPDATED_TIME
          return UPDATED_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private static final int __UPDATEDTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PERMISSION_TYPE_ID,_Fields.ENTITY_ID,_Fields.GROUP_ID,_Fields.GROUP_TYPE,_Fields.SHARING_TYPE,_Fields.INHERITED_PARENT_ID,_Fields.CREATED_TIME,_Fields.UPDATED_TIME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PERMISSION_TYPE_ID, new org.apache.thrift.meta_data.FieldMetaData("permissionTypeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENTITY_ID, new org.apache.thrift.meta_data.FieldMetaData("entityId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GROUP_ID, new org.apache.thrift.meta_data.FieldMetaData("groupId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GROUP_TYPE, new org.apache.thrift.meta_data.FieldMetaData("groupType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, GroupType.class)));
    tmpMap.put(_Fields.SHARING_TYPE, new org.apache.thrift.meta_data.FieldMetaData("sharingType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SharingType.class)));
    tmpMap.put(_Fields.INHERITED_PARENT_ID, new org.apache.thrift.meta_data.FieldMetaData("inheritedParentId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("createdTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UPDATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("updatedTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Sharing.class, metaDataMap);
  }

  public Sharing() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Sharing(Sharing other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPermissionTypeId()) {
      this.permissionTypeId = other.permissionTypeId;
    }
    if (other.isSetEntityId()) {
      this.entityId = other.entityId;
    }
    if (other.isSetGroupId()) {
      this.groupId = other.groupId;
    }
    if (other.isSetGroupType()) {
      this.groupType = other.groupType;
    }
    if (other.isSetSharingType()) {
      this.sharingType = other.sharingType;
    }
    if (other.isSetInheritedParentId()) {
      this.inheritedParentId = other.inheritedParentId;
    }
    this.createdTime = other.createdTime;
    this.updatedTime = other.updatedTime;
  }

  public Sharing deepCopy() {
    return new Sharing(this);
  }

  @Override
  public void clear() {
    this.permissionTypeId = null;
    this.entityId = null;
    this.groupId = null;
    this.groupType = null;
    this.sharingType = null;
    this.inheritedParentId = null;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    setUpdatedTimeIsSet(false);
    this.updatedTime = 0;
  }

  public String getPermissionTypeId() {
    return this.permissionTypeId;
  }

  public Sharing setPermissionTypeId(String permissionTypeId) {
    this.permissionTypeId = permissionTypeId;
    return this;
  }

  public void unsetPermissionTypeId() {
    this.permissionTypeId = null;
  }

  /** Returns true if field permissionTypeId is set (has been assigned a value) and false otherwise */
  public boolean isSetPermissionTypeId() {
    return this.permissionTypeId != null;
  }

  public void setPermissionTypeIdIsSet(boolean value) {
    if (!value) {
      this.permissionTypeId = null;
    }
  }

  public String getEntityId() {
    return this.entityId;
  }

  public Sharing setEntityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  public void unsetEntityId() {
    this.entityId = null;
  }

  /** Returns true if field entityId is set (has been assigned a value) and false otherwise */
  public boolean isSetEntityId() {
    return this.entityId != null;
  }

  public void setEntityIdIsSet(boolean value) {
    if (!value) {
      this.entityId = null;
    }
  }

  public String getGroupId() {
    return this.groupId;
  }

  public Sharing setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public void unsetGroupId() {
    this.groupId = null;
  }

  /** Returns true if field groupId is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupId() {
    return this.groupId != null;
  }

  public void setGroupIdIsSet(boolean value) {
    if (!value) {
      this.groupId = null;
    }
  }

  /**
   * 
   * @see GroupType
   */
  public GroupType getGroupType() {
    return this.groupType;
  }

  /**
   * 
   * @see GroupType
   */
  public Sharing setGroupType(GroupType groupType) {
    this.groupType = groupType;
    return this;
  }

  public void unsetGroupType() {
    this.groupType = null;
  }

  /** Returns true if field groupType is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupType() {
    return this.groupType != null;
  }

  public void setGroupTypeIsSet(boolean value) {
    if (!value) {
      this.groupType = null;
    }
  }

  /**
   * 
   * @see SharingType
   */
  public SharingType getSharingType() {
    return this.sharingType;
  }

  /**
   * 
   * @see SharingType
   */
  public Sharing setSharingType(SharingType sharingType) {
    this.sharingType = sharingType;
    return this;
  }

  public void unsetSharingType() {
    this.sharingType = null;
  }

  /** Returns true if field sharingType is set (has been assigned a value) and false otherwise */
  public boolean isSetSharingType() {
    return this.sharingType != null;
  }

  public void setSharingTypeIsSet(boolean value) {
    if (!value) {
      this.sharingType = null;
    }
  }

  public String getInheritedParentId() {
    return this.inheritedParentId;
  }

  public Sharing setInheritedParentId(String inheritedParentId) {
    this.inheritedParentId = inheritedParentId;
    return this;
  }

  public void unsetInheritedParentId() {
    this.inheritedParentId = null;
  }

  /** Returns true if field inheritedParentId is set (has been assigned a value) and false otherwise */
  public boolean isSetInheritedParentId() {
    return this.inheritedParentId != null;
  }

  public void setInheritedParentIdIsSet(boolean value) {
    if (!value) {
      this.inheritedParentId = null;
    }
  }

  public long getCreatedTime() {
    return this.createdTime;
  }

  public Sharing setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    return this;
  }

  public void unsetCreatedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATEDTIME_ISSET_ID, value);
  }

  public long getUpdatedTime() {
    return this.updatedTime;
  }

  public Sharing setUpdatedTime(long updatedTime) {
    this.updatedTime = updatedTime;
    setUpdatedTimeIsSet(true);
    return this;
  }

  public void unsetUpdatedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPDATEDTIME_ISSET_ID);
  }

  /** Returns true if field updatedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __UPDATEDTIME_ISSET_ID);
  }

  public void setUpdatedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPDATEDTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PERMISSION_TYPE_ID:
      if (value == null) {
        unsetPermissionTypeId();
      } else {
        setPermissionTypeId((String)value);
      }
      break;

    case ENTITY_ID:
      if (value == null) {
        unsetEntityId();
      } else {
        setEntityId((String)value);
      }
      break;

    case GROUP_ID:
      if (value == null) {
        unsetGroupId();
      } else {
        setGroupId((String)value);
      }
      break;

    case GROUP_TYPE:
      if (value == null) {
        unsetGroupType();
      } else {
        setGroupType((GroupType)value);
      }
      break;

    case SHARING_TYPE:
      if (value == null) {
        unsetSharingType();
      } else {
        setSharingType((SharingType)value);
      }
      break;

    case INHERITED_PARENT_ID:
      if (value == null) {
        unsetInheritedParentId();
      } else {
        setInheritedParentId((String)value);
      }
      break;

    case CREATED_TIME:
      if (value == null) {
        unsetCreatedTime();
      } else {
        setCreatedTime((Long)value);
      }
      break;

    case UPDATED_TIME:
      if (value == null) {
        unsetUpdatedTime();
      } else {
        setUpdatedTime((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PERMISSION_TYPE_ID:
      return getPermissionTypeId();

    case ENTITY_ID:
      return getEntityId();

    case GROUP_ID:
      return getGroupId();

    case GROUP_TYPE:
      return getGroupType();

    case SHARING_TYPE:
      return getSharingType();

    case INHERITED_PARENT_ID:
      return getInheritedParentId();

    case CREATED_TIME:
      return getCreatedTime();

    case UPDATED_TIME:
      return getUpdatedTime();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PERMISSION_TYPE_ID:
      return isSetPermissionTypeId();
    case ENTITY_ID:
      return isSetEntityId();
    case GROUP_ID:
      return isSetGroupId();
    case GROUP_TYPE:
      return isSetGroupType();
    case SHARING_TYPE:
      return isSetSharingType();
    case INHERITED_PARENT_ID:
      return isSetInheritedParentId();
    case CREATED_TIME:
      return isSetCreatedTime();
    case UPDATED_TIME:
      return isSetUpdatedTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Sharing)
      return this.equals((Sharing)that);
    return false;
  }

  public boolean equals(Sharing that) {
    if (that == null)
      return false;

    boolean this_present_permissionTypeId = true && this.isSetPermissionTypeId();
    boolean that_present_permissionTypeId = true && that.isSetPermissionTypeId();
    if (this_present_permissionTypeId || that_present_permissionTypeId) {
      if (!(this_present_permissionTypeId && that_present_permissionTypeId))
        return false;
      if (!this.permissionTypeId.equals(that.permissionTypeId))
        return false;
    }

    boolean this_present_entityId = true && this.isSetEntityId();
    boolean that_present_entityId = true && that.isSetEntityId();
    if (this_present_entityId || that_present_entityId) {
      if (!(this_present_entityId && that_present_entityId))
        return false;
      if (!this.entityId.equals(that.entityId))
        return false;
    }

    boolean this_present_groupId = true && this.isSetGroupId();
    boolean that_present_groupId = true && that.isSetGroupId();
    if (this_present_groupId || that_present_groupId) {
      if (!(this_present_groupId && that_present_groupId))
        return false;
      if (!this.groupId.equals(that.groupId))
        return false;
    }

    boolean this_present_groupType = true && this.isSetGroupType();
    boolean that_present_groupType = true && that.isSetGroupType();
    if (this_present_groupType || that_present_groupType) {
      if (!(this_present_groupType && that_present_groupType))
        return false;
      if (!this.groupType.equals(that.groupType))
        return false;
    }

    boolean this_present_sharingType = true && this.isSetSharingType();
    boolean that_present_sharingType = true && that.isSetSharingType();
    if (this_present_sharingType || that_present_sharingType) {
      if (!(this_present_sharingType && that_present_sharingType))
        return false;
      if (!this.sharingType.equals(that.sharingType))
        return false;
    }

    boolean this_present_inheritedParentId = true && this.isSetInheritedParentId();
    boolean that_present_inheritedParentId = true && that.isSetInheritedParentId();
    if (this_present_inheritedParentId || that_present_inheritedParentId) {
      if (!(this_present_inheritedParentId && that_present_inheritedParentId))
        return false;
      if (!this.inheritedParentId.equals(that.inheritedParentId))
        return false;
    }

    boolean this_present_createdTime = true && this.isSetCreatedTime();
    boolean that_present_createdTime = true && that.isSetCreatedTime();
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_updatedTime = true && this.isSetUpdatedTime();
    boolean that_present_updatedTime = true && that.isSetUpdatedTime();
    if (this_present_updatedTime || that_present_updatedTime) {
      if (!(this_present_updatedTime && that_present_updatedTime))
        return false;
      if (this.updatedTime != that.updatedTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_permissionTypeId = true && (isSetPermissionTypeId());
    list.add(present_permissionTypeId);
    if (present_permissionTypeId)
      list.add(permissionTypeId);

    boolean present_entityId = true && (isSetEntityId());
    list.add(present_entityId);
    if (present_entityId)
      list.add(entityId);

    boolean present_groupId = true && (isSetGroupId());
    list.add(present_groupId);
    if (present_groupId)
      list.add(groupId);

    boolean present_groupType = true && (isSetGroupType());
    list.add(present_groupType);
    if (present_groupType)
      list.add(groupType.getValue());

    boolean present_sharingType = true && (isSetSharingType());
    list.add(present_sharingType);
    if (present_sharingType)
      list.add(sharingType.getValue());

    boolean present_inheritedParentId = true && (isSetInheritedParentId());
    list.add(present_inheritedParentId);
    if (present_inheritedParentId)
      list.add(inheritedParentId);

    boolean present_createdTime = true && (isSetCreatedTime());
    list.add(present_createdTime);
    if (present_createdTime)
      list.add(createdTime);

    boolean present_updatedTime = true && (isSetUpdatedTime());
    list.add(present_updatedTime);
    if (present_updatedTime)
      list.add(updatedTime);

    return list.hashCode();
  }

  @Override
  public int compareTo(Sharing other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPermissionTypeId()).compareTo(other.isSetPermissionTypeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPermissionTypeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.permissionTypeId, other.permissionTypeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntityId()).compareTo(other.isSetEntityId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntityId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entityId, other.entityId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroupId()).compareTo(other.isSetGroupId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupId, other.groupId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroupType()).compareTo(other.isSetGroupType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupType, other.groupType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSharingType()).compareTo(other.isSetSharingType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSharingType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sharingType, other.sharingType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInheritedParentId()).compareTo(other.isSetInheritedParentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInheritedParentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inheritedParentId, other.inheritedParentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreatedTime()).compareTo(other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdatedTime()).compareTo(other.isSetUpdatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedTime, other.updatedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Sharing(");
    boolean first = true;

    if (isSetPermissionTypeId()) {
      sb.append("permissionTypeId:");
      if (this.permissionTypeId == null) {
        sb.append("null");
      } else {
        sb.append(this.permissionTypeId);
      }
      first = false;
    }
    if (isSetEntityId()) {
      if (!first) sb.append(", ");
      sb.append("entityId:");
      if (this.entityId == null) {
        sb.append("null");
      } else {
        sb.append(this.entityId);
      }
      first = false;
    }
    if (isSetGroupId()) {
      if (!first) sb.append(", ");
      sb.append("groupId:");
      if (this.groupId == null) {
        sb.append("null");
      } else {
        sb.append(this.groupId);
      }
      first = false;
    }
    if (isSetGroupType()) {
      if (!first) sb.append(", ");
      sb.append("groupType:");
      if (this.groupType == null) {
        sb.append("null");
      } else {
        sb.append(this.groupType);
      }
      first = false;
    }
    if (isSetSharingType()) {
      if (!first) sb.append(", ");
      sb.append("sharingType:");
      if (this.sharingType == null) {
        sb.append("null");
      } else {
        sb.append(this.sharingType);
      }
      first = false;
    }
    if (isSetInheritedParentId()) {
      if (!first) sb.append(", ");
      sb.append("inheritedParentId:");
      if (this.inheritedParentId == null) {
        sb.append("null");
      } else {
        sb.append(this.inheritedParentId);
      }
      first = false;
    }
    if (isSetCreatedTime()) {
      if (!first) sb.append(", ");
      sb.append("createdTime:");
      sb.append(this.createdTime);
      first = false;
    }
    if (isSetUpdatedTime()) {
      if (!first) sb.append(", ");
      sb.append("updatedTime:");
      sb.append(this.updatedTime);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SharingStandardSchemeFactory implements SchemeFactory {
    public SharingStandardScheme getScheme() {
      return new SharingStandardScheme();
    }
  }

  private static class SharingStandardScheme extends StandardScheme<Sharing> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Sharing struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PERMISSION_TYPE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.permissionTypeId = iprot.readString();
              struct.setPermissionTypeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENTITY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.entityId = iprot.readString();
              struct.setEntityIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GROUP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.groupId = iprot.readString();
              struct.setGroupIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GROUP_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.groupType = org.apache.airavata.sharing.registry.models.GroupType.findByValue(iprot.readI32());
              struct.setGroupTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SHARING_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sharingType = org.apache.airavata.sharing.registry.models.SharingType.findByValue(iprot.readI32());
              struct.setSharingTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // INHERITED_PARENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.inheritedParentId = iprot.readString();
              struct.setInheritedParentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CREATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdTime = iprot.readI64();
              struct.setCreatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // UPDATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.updatedTime = iprot.readI64();
              struct.setUpdatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Sharing struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.permissionTypeId != null) {
        if (struct.isSetPermissionTypeId()) {
          oprot.writeFieldBegin(PERMISSION_TYPE_ID_FIELD_DESC);
          oprot.writeString(struct.permissionTypeId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.entityId != null) {
        if (struct.isSetEntityId()) {
          oprot.writeFieldBegin(ENTITY_ID_FIELD_DESC);
          oprot.writeString(struct.entityId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.groupId != null) {
        if (struct.isSetGroupId()) {
          oprot.writeFieldBegin(GROUP_ID_FIELD_DESC);
          oprot.writeString(struct.groupId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.groupType != null) {
        if (struct.isSetGroupType()) {
          oprot.writeFieldBegin(GROUP_TYPE_FIELD_DESC);
          oprot.writeI32(struct.groupType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.sharingType != null) {
        if (struct.isSetSharingType()) {
          oprot.writeFieldBegin(SHARING_TYPE_FIELD_DESC);
          oprot.writeI32(struct.sharingType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.inheritedParentId != null) {
        if (struct.isSetInheritedParentId()) {
          oprot.writeFieldBegin(INHERITED_PARENT_ID_FIELD_DESC);
          oprot.writeString(struct.inheritedParentId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetCreatedTime()) {
        oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
        oprot.writeI64(struct.createdTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetUpdatedTime()) {
        oprot.writeFieldBegin(UPDATED_TIME_FIELD_DESC);
        oprot.writeI64(struct.updatedTime);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SharingTupleSchemeFactory implements SchemeFactory {
    public SharingTupleScheme getScheme() {
      return new SharingTupleScheme();
    }
  }

  private static class SharingTupleScheme extends TupleScheme<Sharing> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Sharing struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPermissionTypeId()) {
        optionals.set(0);
      }
      if (struct.isSetEntityId()) {
        optionals.set(1);
      }
      if (struct.isSetGroupId()) {
        optionals.set(2);
      }
      if (struct.isSetGroupType()) {
        optionals.set(3);
      }
      if (struct.isSetSharingType()) {
        optionals.set(4);
      }
      if (struct.isSetInheritedParentId()) {
        optionals.set(5);
      }
      if (struct.isSetCreatedTime()) {
        optionals.set(6);
      }
      if (struct.isSetUpdatedTime()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetPermissionTypeId()) {
        oprot.writeString(struct.permissionTypeId);
      }
      if (struct.isSetEntityId()) {
        oprot.writeString(struct.entityId);
      }
      if (struct.isSetGroupId()) {
        oprot.writeString(struct.groupId);
      }
      if (struct.isSetGroupType()) {
        oprot.writeI32(struct.groupType.getValue());
      }
      if (struct.isSetSharingType()) {
        oprot.writeI32(struct.sharingType.getValue());
      }
      if (struct.isSetInheritedParentId()) {
        oprot.writeString(struct.inheritedParentId);
      }
      if (struct.isSetCreatedTime()) {
        oprot.writeI64(struct.createdTime);
      }
      if (struct.isSetUpdatedTime()) {
        oprot.writeI64(struct.updatedTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Sharing struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.permissionTypeId = iprot.readString();
        struct.setPermissionTypeIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.entityId = iprot.readString();
        struct.setEntityIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.groupId = iprot.readString();
        struct.setGroupIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.groupType = org.apache.airavata.sharing.registry.models.GroupType.findByValue(iprot.readI32());
        struct.setGroupTypeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.sharingType = org.apache.airavata.sharing.registry.models.SharingType.findByValue(iprot.readI32());
        struct.setSharingTypeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.inheritedParentId = iprot.readString();
        struct.setInheritedParentIdIsSet(true);
      }
      if (incoming.get(6)) {
        struct.createdTime = iprot.readI64();
        struct.setCreatedTimeIsSet(true);
      }
      if (incoming.get(7)) {
        struct.updatedTime = iprot.readI64();
        struct.setUpdatedTimeIsSet(true);
      }
    }
  }

}

