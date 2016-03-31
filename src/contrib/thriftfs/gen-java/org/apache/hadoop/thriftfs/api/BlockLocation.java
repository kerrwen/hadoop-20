/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.api;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockLocation implements org.apache.thrift.TBase<BlockLocation, BlockLocation._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BlockLocation");

  private static final org.apache.thrift.protocol.TField HOSTS_FIELD_DESC = new org.apache.thrift.protocol.TField("hosts", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("names", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("offset", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField LENGTH_FIELD_DESC = new org.apache.thrift.protocol.TField("length", org.apache.thrift.protocol.TType.I64, (short)4);

  public List<String> hosts; // required
  public List<String> names; // required
  public long offset; // required
  public long length; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HOSTS((short)1, "hosts"),
    NAMES((short)2, "names"),
    OFFSET((short)3, "offset"),
    LENGTH((short)4, "length");

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
        case 1: // HOSTS
          return HOSTS;
        case 2: // NAMES
          return NAMES;
        case 3: // OFFSET
          return OFFSET;
        case 4: // LENGTH
          return LENGTH;
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
  private static final int __OFFSET_ISSET_ID = 0;
  private static final int __LENGTH_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HOSTS, new org.apache.thrift.meta_data.FieldMetaData("hosts", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.NAMES, new org.apache.thrift.meta_data.FieldMetaData("names", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.OFFSET, new org.apache.thrift.meta_data.FieldMetaData("offset", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LENGTH, new org.apache.thrift.meta_data.FieldMetaData("length", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BlockLocation.class, metaDataMap);
  }

  public BlockLocation() {
  }

  public BlockLocation(
    List<String> hosts,
    List<String> names,
    long offset,
    long length)
  {
    this();
    this.hosts = hosts;
    this.names = names;
    this.offset = offset;
    setOffsetIsSet(true);
    this.length = length;
    setLengthIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BlockLocation(BlockLocation other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetHosts()) {
      List<String> __this__hosts = new ArrayList<String>();
      for (String other_element : other.hosts) {
        __this__hosts.add(other_element);
      }
      this.hosts = __this__hosts;
    }
    if (other.isSetNames()) {
      List<String> __this__names = new ArrayList<String>();
      for (String other_element : other.names) {
        __this__names.add(other_element);
      }
      this.names = __this__names;
    }
    this.offset = other.offset;
    this.length = other.length;
  }

  public BlockLocation deepCopy() {
    return new BlockLocation(this);
  }

  @Override
  public void clear() {
    this.hosts = null;
    this.names = null;
    setOffsetIsSet(false);
    this.offset = 0;
    setLengthIsSet(false);
    this.length = 0;
  }

  public int getHostsSize() {
    return (this.hosts == null) ? 0 : this.hosts.size();
  }

  public java.util.Iterator<String> getHostsIterator() {
    return (this.hosts == null) ? null : this.hosts.iterator();
  }

  public void addToHosts(String elem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<String>();
    }
    this.hosts.add(elem);
  }

  public List<String> getHosts() {
    return this.hosts;
  }

  public BlockLocation setHosts(List<String> hosts) {
    this.hosts = hosts;
    return this;
  }

  public void unsetHosts() {
    this.hosts = null;
  }

  /** Returns true if field hosts is set (has been assigned a value) and false otherwise */
  public boolean isSetHosts() {
    return this.hosts != null;
  }

  public void setHostsIsSet(boolean value) {
    if (!value) {
      this.hosts = null;
    }
  }

  public int getNamesSize() {
    return (this.names == null) ? 0 : this.names.size();
  }

  public java.util.Iterator<String> getNamesIterator() {
    return (this.names == null) ? null : this.names.iterator();
  }

  public void addToNames(String elem) {
    if (this.names == null) {
      this.names = new ArrayList<String>();
    }
    this.names.add(elem);
  }

  public List<String> getNames() {
    return this.names;
  }

  public BlockLocation setNames(List<String> names) {
    this.names = names;
    return this;
  }

  public void unsetNames() {
    this.names = null;
  }

  /** Returns true if field names is set (has been assigned a value) and false otherwise */
  public boolean isSetNames() {
    return this.names != null;
  }

  public void setNamesIsSet(boolean value) {
    if (!value) {
      this.names = null;
    }
  }

  public long getOffset() {
    return this.offset;
  }

  public BlockLocation setOffset(long offset) {
    this.offset = offset;
    setOffsetIsSet(true);
    return this;
  }

  public void unsetOffset() {
    __isset_bit_vector.clear(__OFFSET_ISSET_ID);
  }

  /** Returns true if field offset is set (has been assigned a value) and false otherwise */
  public boolean isSetOffset() {
    return __isset_bit_vector.get(__OFFSET_ISSET_ID);
  }

  public void setOffsetIsSet(boolean value) {
    __isset_bit_vector.set(__OFFSET_ISSET_ID, value);
  }

  public long getLength() {
    return this.length;
  }

  public BlockLocation setLength(long length) {
    this.length = length;
    setLengthIsSet(true);
    return this;
  }

  public void unsetLength() {
    __isset_bit_vector.clear(__LENGTH_ISSET_ID);
  }

  /** Returns true if field length is set (has been assigned a value) and false otherwise */
  public boolean isSetLength() {
    return __isset_bit_vector.get(__LENGTH_ISSET_ID);
  }

  public void setLengthIsSet(boolean value) {
    __isset_bit_vector.set(__LENGTH_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HOSTS:
      if (value == null) {
        unsetHosts();
      } else {
        setHosts((List<String>)value);
      }
      break;

    case NAMES:
      if (value == null) {
        unsetNames();
      } else {
        setNames((List<String>)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((Long)value);
      }
      break;

    case LENGTH:
      if (value == null) {
        unsetLength();
      } else {
        setLength((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HOSTS:
      return getHosts();

    case NAMES:
      return getNames();

    case OFFSET:
      return Long.valueOf(getOffset());

    case LENGTH:
      return Long.valueOf(getLength());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HOSTS:
      return isSetHosts();
    case NAMES:
      return isSetNames();
    case OFFSET:
      return isSetOffset();
    case LENGTH:
      return isSetLength();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BlockLocation)
      return this.equals((BlockLocation)that);
    return false;
  }

  public boolean equals(BlockLocation that) {
    if (that == null)
      return false;

    boolean this_present_hosts = true && this.isSetHosts();
    boolean that_present_hosts = true && that.isSetHosts();
    if (this_present_hosts || that_present_hosts) {
      if (!(this_present_hosts && that_present_hosts))
        return false;
      if (!this.hosts.equals(that.hosts))
        return false;
    }

    boolean this_present_names = true && this.isSetNames();
    boolean that_present_names = true && that.isSetNames();
    if (this_present_names || that_present_names) {
      if (!(this_present_names && that_present_names))
        return false;
      if (!this.names.equals(that.names))
        return false;
    }

    boolean this_present_offset = true;
    boolean that_present_offset = true;
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (this.offset != that.offset)
        return false;
    }

    boolean this_present_length = true;
    boolean that_present_length = true;
    if (this_present_length || that_present_length) {
      if (!(this_present_length && that_present_length))
        return false;
      if (this.length != that.length)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BlockLocation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BlockLocation typedOther = (BlockLocation)other;

    lastComparison = Boolean.valueOf(isSetHosts()).compareTo(typedOther.isSetHosts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHosts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hosts, typedOther.hosts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNames()).compareTo(typedOther.isSetNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.names, typedOther.names);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOffset()).compareTo(typedOther.isSetOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.offset, typedOther.offset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLength()).compareTo(typedOther.isSetLength());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLength()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.length, typedOther.length);
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
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // HOSTS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
              this.hosts = new ArrayList<String>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                String _elem2; // required
                _elem2 = iprot.readString();
                this.hosts.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NAMES
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
              this.names = new ArrayList<String>(_list3.size);
              for (int _i4 = 0; _i4 < _list3.size; ++_i4)
              {
                String _elem5; // required
                _elem5 = iprot.readString();
                this.names.add(_elem5);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // OFFSET
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.offset = iprot.readI64();
            setOffsetIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // LENGTH
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.length = iprot.readI64();
            setLengthIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.hosts != null) {
      oprot.writeFieldBegin(HOSTS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, this.hosts.size()));
        for (String _iter6 : this.hosts)
        {
          oprot.writeString(_iter6);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.names != null) {
      oprot.writeFieldBegin(NAMES_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, this.names.size()));
        for (String _iter7 : this.names)
        {
          oprot.writeString(_iter7);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(OFFSET_FIELD_DESC);
    oprot.writeI64(this.offset);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LENGTH_FIELD_DESC);
    oprot.writeI64(this.length);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BlockLocation(");
    boolean first = true;

    sb.append("hosts:");
    if (this.hosts == null) {
      sb.append("null");
    } else {
      sb.append(this.hosts);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("names:");
    if (this.names == null) {
      sb.append("null");
    } else {
      sb.append(this.names);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("offset:");
    sb.append(this.offset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("length:");
    sb.append(this.length);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

