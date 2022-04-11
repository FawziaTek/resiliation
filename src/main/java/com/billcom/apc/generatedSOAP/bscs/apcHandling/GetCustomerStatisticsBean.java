/**
 * GetCustomerStatisticsBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class GetCustomerStatisticsBean  implements java.io.Serializable {
    private long[] coIdList;

    private java.lang.String des;

    private int numBer;

    private long rpCode;

    private java.lang.String type;

    private java.lang.String value;

    public GetCustomerStatisticsBean() {
    }

    public GetCustomerStatisticsBean(
           long[] coIdList,
           java.lang.String des,
           int numBer,
           long rpCode,
           java.lang.String type,
           java.lang.String value) {
           this.coIdList = coIdList;
           this.des = des;
           this.numBer = numBer;
           this.rpCode = rpCode;
           this.type = type;
           this.value = value;
    }


    /**
     * Gets the coIdList value for this GetCustomerStatisticsBean.
     * 
     * @return coIdList
     */
    public long[] getCoIdList() {
        return coIdList;
    }


    /**
     * Sets the coIdList value for this GetCustomerStatisticsBean.
     * 
     * @param coIdList
     */
    public void setCoIdList(long[] coIdList) {
        this.coIdList = coIdList;
    }


    /**
     * Gets the des value for this GetCustomerStatisticsBean.
     * 
     * @return des
     */
    public java.lang.String getDes() {
        return des;
    }


    /**
     * Sets the des value for this GetCustomerStatisticsBean.
     * 
     * @param des
     */
    public void setDes(java.lang.String des) {
        this.des = des;
    }


    /**
     * Gets the numBer value for this GetCustomerStatisticsBean.
     * 
     * @return numBer
     */
    public int getNumBer() {
        return numBer;
    }


    /**
     * Sets the numBer value for this GetCustomerStatisticsBean.
     * 
     * @param numBer
     */
    public void setNumBer(int numBer) {
        this.numBer = numBer;
    }


    /**
     * Gets the rpCode value for this GetCustomerStatisticsBean.
     * 
     * @return rpCode
     */
    public long getRpCode() {
        return rpCode;
    }


    /**
     * Sets the rpCode value for this GetCustomerStatisticsBean.
     * 
     * @param rpCode
     */
    public void setRpCode(long rpCode) {
        this.rpCode = rpCode;
    }


    /**
     * Gets the type value for this GetCustomerStatisticsBean.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this GetCustomerStatisticsBean.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the value value for this GetCustomerStatisticsBean.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this GetCustomerStatisticsBean.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCustomerStatisticsBean)) return false;
        GetCustomerStatisticsBean other = (GetCustomerStatisticsBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coIdList==null && other.getCoIdList()==null) || 
             (this.coIdList!=null &&
              java.util.Arrays.equals(this.coIdList, other.getCoIdList()))) &&
            ((this.des==null && other.getDes()==null) || 
             (this.des!=null &&
              this.des.equals(other.getDes()))) &&
            this.numBer == other.getNumBer() &&
            this.rpCode == other.getRpCode() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCoIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDes() != null) {
            _hashCode += getDes().hashCode();
        }
        _hashCode += getNumBer();
        _hashCode += new Long(getRpCode()).hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCustomerStatisticsBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerStatisticsBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("des");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "des"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numBer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "numBer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
