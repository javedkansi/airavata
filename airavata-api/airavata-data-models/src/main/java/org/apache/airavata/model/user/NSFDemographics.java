/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.user;

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
/**
 * A structure holding the NSF Demographic information.
 * 
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class NSFDemographics implements org.apache.thrift.TBase<NSFDemographics, NSFDemographics._Fields>, java.io.Serializable, Cloneable, Comparable<NSFDemographics> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NSFDemographics");

  private static final org.apache.thrift.protocol.TField GENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("gender", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField US_CITIZENSHIP_FIELD_DESC = new org.apache.thrift.protocol.TField("usCitizenship", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ETHNICITIES_FIELD_DESC = new org.apache.thrift.protocol.TField("ethnicities", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField RACES_FIELD_DESC = new org.apache.thrift.protocol.TField("races", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField DISABILITIES_FIELD_DESC = new org.apache.thrift.protocol.TField("disabilities", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NSFDemographicsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NSFDemographicsTupleSchemeFactory());
  }

  private String gender; // optional
  private USCitizenship usCitizenship; // optional
  private List<ethnicity> ethnicities; // optional
  private List<race> races; // optional
  private List<disability> disabilities; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GENDER((short)1, "gender"),
    /**
     * 
     * @see USCitizenship
     */
    US_CITIZENSHIP((short)2, "usCitizenship"),
    ETHNICITIES((short)3, "ethnicities"),
    RACES((short)4, "races"),
    DISABILITIES((short)5, "disabilities");

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
        case 1: // GENDER
          return GENDER;
        case 2: // US_CITIZENSHIP
          return US_CITIZENSHIP;
        case 3: // ETHNICITIES
          return ETHNICITIES;
        case 4: // RACES
          return RACES;
        case 5: // DISABILITIES
          return DISABILITIES;
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
  private static final _Fields optionals[] = {_Fields.GENDER,_Fields.US_CITIZENSHIP,_Fields.ETHNICITIES,_Fields.RACES,_Fields.DISABILITIES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GENDER, new org.apache.thrift.meta_data.FieldMetaData("gender", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.US_CITIZENSHIP, new org.apache.thrift.meta_data.FieldMetaData("usCitizenship", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, USCitizenship.class)));
    tmpMap.put(_Fields.ETHNICITIES, new org.apache.thrift.meta_data.FieldMetaData("ethnicities", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ethnicity.class))));
    tmpMap.put(_Fields.RACES, new org.apache.thrift.meta_data.FieldMetaData("races", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, race.class))));
    tmpMap.put(_Fields.DISABILITIES, new org.apache.thrift.meta_data.FieldMetaData("disabilities", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, disability.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NSFDemographics.class, metaDataMap);
  }

  public NSFDemographics() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NSFDemographics(NSFDemographics other) {
    if (other.isSetGender()) {
      this.gender = other.gender;
    }
    if (other.isSetUsCitizenship()) {
      this.usCitizenship = other.usCitizenship;
    }
    if (other.isSetEthnicities()) {
      List<ethnicity> __this__ethnicities = new ArrayList<ethnicity>(other.ethnicities.size());
      for (ethnicity other_element : other.ethnicities) {
        __this__ethnicities.add(other_element);
      }
      this.ethnicities = __this__ethnicities;
    }
    if (other.isSetRaces()) {
      List<race> __this__races = new ArrayList<race>(other.races.size());
      for (race other_element : other.races) {
        __this__races.add(other_element);
      }
      this.races = __this__races;
    }
    if (other.isSetDisabilities()) {
      List<disability> __this__disabilities = new ArrayList<disability>(other.disabilities.size());
      for (disability other_element : other.disabilities) {
        __this__disabilities.add(other_element);
      }
      this.disabilities = __this__disabilities;
    }
  }

  public NSFDemographics deepCopy() {
    return new NSFDemographics(this);
  }

  @Override
  public void clear() {
    this.gender = null;
    this.usCitizenship = null;
    this.ethnicities = null;
    this.races = null;
    this.disabilities = null;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void unsetGender() {
    this.gender = null;
  }

  /** Returns true if field gender is set (has been assigned a value) and false otherwise */
  public boolean isSetGender() {
    return this.gender != null;
  }

  public void setGenderIsSet(boolean value) {
    if (!value) {
      this.gender = null;
    }
  }

  /**
   * 
   * @see USCitizenship
   */
  public USCitizenship getUsCitizenship() {
    return this.usCitizenship;
  }

  /**
   * 
   * @see USCitizenship
   */
  public void setUsCitizenship(USCitizenship usCitizenship) {
    this.usCitizenship = usCitizenship;
  }

  public void unsetUsCitizenship() {
    this.usCitizenship = null;
  }

  /** Returns true if field usCitizenship is set (has been assigned a value) and false otherwise */
  public boolean isSetUsCitizenship() {
    return this.usCitizenship != null;
  }

  public void setUsCitizenshipIsSet(boolean value) {
    if (!value) {
      this.usCitizenship = null;
    }
  }

  public int getEthnicitiesSize() {
    return (this.ethnicities == null) ? 0 : this.ethnicities.size();
  }

  public java.util.Iterator<ethnicity> getEthnicitiesIterator() {
    return (this.ethnicities == null) ? null : this.ethnicities.iterator();
  }

  public void addToEthnicities(ethnicity elem) {
    if (this.ethnicities == null) {
      this.ethnicities = new ArrayList<ethnicity>();
    }
    this.ethnicities.add(elem);
  }

  public List<ethnicity> getEthnicities() {
    return this.ethnicities;
  }

  public void setEthnicities(List<ethnicity> ethnicities) {
    this.ethnicities = ethnicities;
  }

  public void unsetEthnicities() {
    this.ethnicities = null;
  }

  /** Returns true if field ethnicities is set (has been assigned a value) and false otherwise */
  public boolean isSetEthnicities() {
    return this.ethnicities != null;
  }

  public void setEthnicitiesIsSet(boolean value) {
    if (!value) {
      this.ethnicities = null;
    }
  }

  public int getRacesSize() {
    return (this.races == null) ? 0 : this.races.size();
  }

  public java.util.Iterator<race> getRacesIterator() {
    return (this.races == null) ? null : this.races.iterator();
  }

  public void addToRaces(race elem) {
    if (this.races == null) {
      this.races = new ArrayList<race>();
    }
    this.races.add(elem);
  }

  public List<race> getRaces() {
    return this.races;
  }

  public void setRaces(List<race> races) {
    this.races = races;
  }

  public void unsetRaces() {
    this.races = null;
  }

  /** Returns true if field races is set (has been assigned a value) and false otherwise */
  public boolean isSetRaces() {
    return this.races != null;
  }

  public void setRacesIsSet(boolean value) {
    if (!value) {
      this.races = null;
    }
  }

  public int getDisabilitiesSize() {
    return (this.disabilities == null) ? 0 : this.disabilities.size();
  }

  public java.util.Iterator<disability> getDisabilitiesIterator() {
    return (this.disabilities == null) ? null : this.disabilities.iterator();
  }

  public void addToDisabilities(disability elem) {
    if (this.disabilities == null) {
      this.disabilities = new ArrayList<disability>();
    }
    this.disabilities.add(elem);
  }

  public List<disability> getDisabilities() {
    return this.disabilities;
  }

  public void setDisabilities(List<disability> disabilities) {
    this.disabilities = disabilities;
  }

  public void unsetDisabilities() {
    this.disabilities = null;
  }

  /** Returns true if field disabilities is set (has been assigned a value) and false otherwise */
  public boolean isSetDisabilities() {
    return this.disabilities != null;
  }

  public void setDisabilitiesIsSet(boolean value) {
    if (!value) {
      this.disabilities = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GENDER:
      if (value == null) {
        unsetGender();
      } else {
        setGender((String)value);
      }
      break;

    case US_CITIZENSHIP:
      if (value == null) {
        unsetUsCitizenship();
      } else {
        setUsCitizenship((USCitizenship)value);
      }
      break;

    case ETHNICITIES:
      if (value == null) {
        unsetEthnicities();
      } else {
        setEthnicities((List<ethnicity>)value);
      }
      break;

    case RACES:
      if (value == null) {
        unsetRaces();
      } else {
        setRaces((List<race>)value);
      }
      break;

    case DISABILITIES:
      if (value == null) {
        unsetDisabilities();
      } else {
        setDisabilities((List<disability>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GENDER:
      return getGender();

    case US_CITIZENSHIP:
      return getUsCitizenship();

    case ETHNICITIES:
      return getEthnicities();

    case RACES:
      return getRaces();

    case DISABILITIES:
      return getDisabilities();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GENDER:
      return isSetGender();
    case US_CITIZENSHIP:
      return isSetUsCitizenship();
    case ETHNICITIES:
      return isSetEthnicities();
    case RACES:
      return isSetRaces();
    case DISABILITIES:
      return isSetDisabilities();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NSFDemographics)
      return this.equals((NSFDemographics)that);
    return false;
  }

  public boolean equals(NSFDemographics that) {
    if (that == null)
      return false;

    boolean this_present_gender = true && this.isSetGender();
    boolean that_present_gender = true && that.isSetGender();
    if (this_present_gender || that_present_gender) {
      if (!(this_present_gender && that_present_gender))
        return false;
      if (!this.gender.equals(that.gender))
        return false;
    }

    boolean this_present_usCitizenship = true && this.isSetUsCitizenship();
    boolean that_present_usCitizenship = true && that.isSetUsCitizenship();
    if (this_present_usCitizenship || that_present_usCitizenship) {
      if (!(this_present_usCitizenship && that_present_usCitizenship))
        return false;
      if (!this.usCitizenship.equals(that.usCitizenship))
        return false;
    }

    boolean this_present_ethnicities = true && this.isSetEthnicities();
    boolean that_present_ethnicities = true && that.isSetEthnicities();
    if (this_present_ethnicities || that_present_ethnicities) {
      if (!(this_present_ethnicities && that_present_ethnicities))
        return false;
      if (!this.ethnicities.equals(that.ethnicities))
        return false;
    }

    boolean this_present_races = true && this.isSetRaces();
    boolean that_present_races = true && that.isSetRaces();
    if (this_present_races || that_present_races) {
      if (!(this_present_races && that_present_races))
        return false;
      if (!this.races.equals(that.races))
        return false;
    }

    boolean this_present_disabilities = true && this.isSetDisabilities();
    boolean that_present_disabilities = true && that.isSetDisabilities();
    if (this_present_disabilities || that_present_disabilities) {
      if (!(this_present_disabilities && that_present_disabilities))
        return false;
      if (!this.disabilities.equals(that.disabilities))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_gender = true && (isSetGender());
    list.add(present_gender);
    if (present_gender)
      list.add(gender);

    boolean present_usCitizenship = true && (isSetUsCitizenship());
    list.add(present_usCitizenship);
    if (present_usCitizenship)
      list.add(usCitizenship.getValue());

    boolean present_ethnicities = true && (isSetEthnicities());
    list.add(present_ethnicities);
    if (present_ethnicities)
      list.add(ethnicities);

    boolean present_races = true && (isSetRaces());
    list.add(present_races);
    if (present_races)
      list.add(races);

    boolean present_disabilities = true && (isSetDisabilities());
    list.add(present_disabilities);
    if (present_disabilities)
      list.add(disabilities);

    return list.hashCode();
  }

  @Override
  public int compareTo(NSFDemographics other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetGender()).compareTo(other.isSetGender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gender, other.gender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsCitizenship()).compareTo(other.isSetUsCitizenship());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsCitizenship()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.usCitizenship, other.usCitizenship);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEthnicities()).compareTo(other.isSetEthnicities());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEthnicities()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ethnicities, other.ethnicities);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRaces()).compareTo(other.isSetRaces());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRaces()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.races, other.races);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisabilities()).compareTo(other.isSetDisabilities());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisabilities()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.disabilities, other.disabilities);
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
    StringBuilder sb = new StringBuilder("NSFDemographics(");
    boolean first = true;

    if (isSetGender()) {
      sb.append("gender:");
      if (this.gender == null) {
        sb.append("null");
      } else {
        sb.append(this.gender);
      }
      first = false;
    }
    if (isSetUsCitizenship()) {
      if (!first) sb.append(", ");
      sb.append("usCitizenship:");
      if (this.usCitizenship == null) {
        sb.append("null");
      } else {
        sb.append(this.usCitizenship);
      }
      first = false;
    }
    if (isSetEthnicities()) {
      if (!first) sb.append(", ");
      sb.append("ethnicities:");
      if (this.ethnicities == null) {
        sb.append("null");
      } else {
        sb.append(this.ethnicities);
      }
      first = false;
    }
    if (isSetRaces()) {
      if (!first) sb.append(", ");
      sb.append("races:");
      if (this.races == null) {
        sb.append("null");
      } else {
        sb.append(this.races);
      }
      first = false;
    }
    if (isSetDisabilities()) {
      if (!first) sb.append(", ");
      sb.append("disabilities:");
      if (this.disabilities == null) {
        sb.append("null");
      } else {
        sb.append(this.disabilities);
      }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NSFDemographicsStandardSchemeFactory implements SchemeFactory {
    public NSFDemographicsStandardScheme getScheme() {
      return new NSFDemographicsStandardScheme();
    }
  }

  private static class NSFDemographicsStandardScheme extends StandardScheme<NSFDemographics> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NSFDemographics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.gender = iprot.readString();
              struct.setGenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // US_CITIZENSHIP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.usCitizenship = org.apache.airavata.model.user.USCitizenship.findByValue(iprot.readI32());
              struct.setUsCitizenshipIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ETHNICITIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.ethnicities = new ArrayList<ethnicity>(_list0.size);
                ethnicity _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = org.apache.airavata.model.user.ethnicity.findByValue(iprot.readI32());
                  struct.ethnicities.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setEthnicitiesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RACES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.races = new ArrayList<race>(_list3.size);
                race _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = org.apache.airavata.model.user.race.findByValue(iprot.readI32());
                  struct.races.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setRacesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DISABILITIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list6 = iprot.readListBegin();
                struct.disabilities = new ArrayList<disability>(_list6.size);
                disability _elem7;
                for (int _i8 = 0; _i8 < _list6.size; ++_i8)
                {
                  _elem7 = org.apache.airavata.model.user.disability.findByValue(iprot.readI32());
                  struct.disabilities.add(_elem7);
                }
                iprot.readListEnd();
              }
              struct.setDisabilitiesIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, NSFDemographics struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.gender != null) {
        if (struct.isSetGender()) {
          oprot.writeFieldBegin(GENDER_FIELD_DESC);
          oprot.writeString(struct.gender);
          oprot.writeFieldEnd();
        }
      }
      if (struct.usCitizenship != null) {
        if (struct.isSetUsCitizenship()) {
          oprot.writeFieldBegin(US_CITIZENSHIP_FIELD_DESC);
          oprot.writeI32(struct.usCitizenship.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.ethnicities != null) {
        if (struct.isSetEthnicities()) {
          oprot.writeFieldBegin(ETHNICITIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.ethnicities.size()));
            for (ethnicity _iter9 : struct.ethnicities)
            {
              oprot.writeI32(_iter9.getValue());
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.races != null) {
        if (struct.isSetRaces()) {
          oprot.writeFieldBegin(RACES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.races.size()));
            for (race _iter10 : struct.races)
            {
              oprot.writeI32(_iter10.getValue());
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.disabilities != null) {
        if (struct.isSetDisabilities()) {
          oprot.writeFieldBegin(DISABILITIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.disabilities.size()));
            for (disability _iter11 : struct.disabilities)
            {
              oprot.writeI32(_iter11.getValue());
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NSFDemographicsTupleSchemeFactory implements SchemeFactory {
    public NSFDemographicsTupleScheme getScheme() {
      return new NSFDemographicsTupleScheme();
    }
  }

  private static class NSFDemographicsTupleScheme extends TupleScheme<NSFDemographics> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NSFDemographics struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetGender()) {
        optionals.set(0);
      }
      if (struct.isSetUsCitizenship()) {
        optionals.set(1);
      }
      if (struct.isSetEthnicities()) {
        optionals.set(2);
      }
      if (struct.isSetRaces()) {
        optionals.set(3);
      }
      if (struct.isSetDisabilities()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetGender()) {
        oprot.writeString(struct.gender);
      }
      if (struct.isSetUsCitizenship()) {
        oprot.writeI32(struct.usCitizenship.getValue());
      }
      if (struct.isSetEthnicities()) {
        {
          oprot.writeI32(struct.ethnicities.size());
          for (ethnicity _iter12 : struct.ethnicities)
          {
            oprot.writeI32(_iter12.getValue());
          }
        }
      }
      if (struct.isSetRaces()) {
        {
          oprot.writeI32(struct.races.size());
          for (race _iter13 : struct.races)
          {
            oprot.writeI32(_iter13.getValue());
          }
        }
      }
      if (struct.isSetDisabilities()) {
        {
          oprot.writeI32(struct.disabilities.size());
          for (disability _iter14 : struct.disabilities)
          {
            oprot.writeI32(_iter14.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NSFDemographics struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.gender = iprot.readString();
        struct.setGenderIsSet(true);
      }
      if (incoming.get(1)) {
        struct.usCitizenship = org.apache.airavata.model.user.USCitizenship.findByValue(iprot.readI32());
        struct.setUsCitizenshipIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list15 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.ethnicities = new ArrayList<ethnicity>(_list15.size);
          ethnicity _elem16;
          for (int _i17 = 0; _i17 < _list15.size; ++_i17)
          {
            _elem16 = org.apache.airavata.model.user.ethnicity.findByValue(iprot.readI32());
            struct.ethnicities.add(_elem16);
          }
        }
        struct.setEthnicitiesIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.races = new ArrayList<race>(_list18.size);
          race _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            _elem19 = org.apache.airavata.model.user.race.findByValue(iprot.readI32());
            struct.races.add(_elem19);
          }
        }
        struct.setRacesIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.disabilities = new ArrayList<disability>(_list21.size);
          disability _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = org.apache.airavata.model.user.disability.findByValue(iprot.readI32());
            struct.disabilities.add(_elem22);
          }
        }
        struct.setDisabilitiesIsSet(true);
      }
    }
  }

}

