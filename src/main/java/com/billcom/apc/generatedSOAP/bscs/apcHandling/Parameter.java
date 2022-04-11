/**
 * Parameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class Parameter  extends com.billcom.apc.generatedSOAP.bscs.apcHandling.BaseSOIBean  implements java.io.Serializable {
    private java.lang.String prmDes;

    private java.lang.Long prmId;

    private java.lang.String prmType;

    private java.lang.String value;

    private java.lang.String valueDes;

    public Parameter() {
    }

    public Parameter(
           java.lang.String prmDes,
           java.lang.Long prmId,
           java.lang.String prmType,
           java.lang.String value,
           java.lang.String valueDes) {
        this.prmDes = prmDes;
        this.prmId = prmId;
        this.prmType = prmType;
        this.value = value;
        this.valueDes = valueDes;
    }


    /**
     * Gets the prmDes value for this Parameter.
     * 
     * @return prmDes
     */
    public java.lang.String getPrmDes() {
        return prmDes;
    }


    /**
     * Sets the prmDes value for this Parameter.
     * 
     * @param prmDes
     */
    public void setPrmDes(java.lang.String prmDes) {
        this.prmDes = prmDes;
    }


    /**
     * Gets the prmId value for this Parameter.
     * 
     * @return prmId
     */
    public java.lang.Long getPrmId() {
        return prmId;
    }


    /**
     * Sets the prmId value for this Parameter.
     * 
     * @param prmId
     */
    public void setPrmId(java.lang.Long prmId) {
        this.prmId = prmId;
    }


    /**
     * Gets the prmType value for this Parameter.
     * 
     * @return prmType
     */
    public java.lang.String getPrmType() {
        return prmType;
    }


    /**
     * Sets the prmType value for this Parameter.
     * 
     * @param prmType
     */
    public void setPrmType(java.lang.String prmType) {
        this.prmType = prmType;
    }


    /**
     * Gets the value value for this Parameter.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Parameter.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the valueDes value for this Parameter.
     * 
     * @return valueDes
     */
    public java.lang.String getValueDes() {
        return valueDes;
    }


    /**
     * Sets the valueDes value for this Parameter.
     * 
     * @param valueDes
     */
    public void setValueDes(java.lang.String valueDes) {
        this.valueDes = valueDes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Parameter)) return false;
        Parameter other = (Parameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.prmDes==null && other.getPrmDes()==null) || 
             (this.prmDes!=null &&
              this.prmDes.equals(other.getPrmDes()))) &&
            ((this.prmId==null && other.getPrmId()==null) || 
             (this.prmId!=null &&
              this.prmId.equals(other.getPrmId()))) &&
            ((this.prmType==null && other.getPrmType()==null) || 
             (this.prmType!=null &&
              this.prmType.equals(other.getPrmType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.valueDes==null && other.getValueDes()==null) || 
             (this.valueDes!=null &&
              this.valueDes.equals(other.getValueDes())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPrmDes() != null) {
            _hashCode += getPrmDes().hashCode();
        }
        if (getPrmId() != null) {
            _hashCode += getPrmId().hashCode();
        }
        if (getPrmType() != null) {
            _hashCode += getPrmType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getValueDes() != null) {
            _hashCode += getValueDes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Parameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Parameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prmDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "prmDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prmId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "prmId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prmType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "prmType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "valueDes"));
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
