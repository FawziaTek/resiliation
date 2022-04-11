/**
 * MultValuesBeanOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class MultValuesBeanOut  extends com.billcom.apc.generatedSOAP.bscs.resiliationHandling.BaseSOIBean  implements java.io.Serializable {
    private java.lang.String value;

    private java.lang.String valueDes;

    private java.lang.String valuePub;

    public MultValuesBeanOut() {
    }

    public MultValuesBeanOut(
           java.lang.String value,
           java.lang.String valueDes,
           java.lang.String valuePub) {
        this.value = value;
        this.valueDes = valueDes;
        this.valuePub = valuePub;
    }


    /**
     * Gets the value value for this MultValuesBeanOut.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this MultValuesBeanOut.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the valueDes value for this MultValuesBeanOut.
     * 
     * @return valueDes
     */
    public java.lang.String getValueDes() {
        return valueDes;
    }


    /**
     * Sets the valueDes value for this MultValuesBeanOut.
     * 
     * @param valueDes
     */
    public void setValueDes(java.lang.String valueDes) {
        this.valueDes = valueDes;
    }


    /**
     * Gets the valuePub value for this MultValuesBeanOut.
     * 
     * @return valuePub
     */
    public java.lang.String getValuePub() {
        return valuePub;
    }


    /**
     * Sets the valuePub value for this MultValuesBeanOut.
     * 
     * @param valuePub
     */
    public void setValuePub(java.lang.String valuePub) {
        this.valuePub = valuePub;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultValuesBeanOut)) return false;
        MultValuesBeanOut other = (MultValuesBeanOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.valueDes==null && other.getValueDes()==null) || 
             (this.valueDes!=null &&
              this.valueDes.equals(other.getValueDes()))) &&
            ((this.valuePub==null && other.getValuePub()==null) || 
             (this.valuePub!=null &&
              this.valuePub.equals(other.getValuePub())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getValueDes() != null) {
            _hashCode += getValueDes().hashCode();
        }
        if (getValuePub() != null) {
            _hashCode += getValuePub().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MultValuesBeanOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://num_params.contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "MultValuesBeanOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://num_params.contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://num_params.contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "valueDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://num_params.contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "valuePub"));
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
