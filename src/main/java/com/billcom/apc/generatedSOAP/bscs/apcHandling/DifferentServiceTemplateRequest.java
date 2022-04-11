/**
 * DifferentServiceTemplateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class DifferentServiceTemplateRequest  implements java.io.Serializable {
    private java.lang.Long coIdCible;

    private java.lang.Long coIdSource;

    public DifferentServiceTemplateRequest() {
    }

    public DifferentServiceTemplateRequest(
           java.lang.Long coIdCible,
           java.lang.Long coIdSource) {
           this.coIdCible = coIdCible;
           this.coIdSource = coIdSource;
    }


    /**
     * Gets the coIdCible value for this DifferentServiceTemplateRequest.
     * 
     * @return coIdCible
     */
    public java.lang.Long getCoIdCible() {
        return coIdCible;
    }


    /**
     * Sets the coIdCible value for this DifferentServiceTemplateRequest.
     * 
     * @param coIdCible
     */
    public void setCoIdCible(java.lang.Long coIdCible) {
        this.coIdCible = coIdCible;
    }


    /**
     * Gets the coIdSource value for this DifferentServiceTemplateRequest.
     * 
     * @return coIdSource
     */
    public java.lang.Long getCoIdSource() {
        return coIdSource;
    }


    /**
     * Sets the coIdSource value for this DifferentServiceTemplateRequest.
     * 
     * @param coIdSource
     */
    public void setCoIdSource(java.lang.Long coIdSource) {
        this.coIdSource = coIdSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DifferentServiceTemplateRequest)) return false;
        DifferentServiceTemplateRequest other = (DifferentServiceTemplateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coIdCible==null && other.getCoIdCible()==null) || 
             (this.coIdCible!=null &&
              this.coIdCible.equals(other.getCoIdCible()))) &&
            ((this.coIdSource==null && other.getCoIdSource()==null) || 
             (this.coIdSource!=null &&
              this.coIdSource.equals(other.getCoIdSource())));
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
        if (getCoIdCible() != null) {
            _hashCode += getCoIdCible().hashCode();
        }
        if (getCoIdSource() != null) {
            _hashCode += getCoIdSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DifferentServiceTemplateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DifferentServiceTemplateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coIdCible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coIdCible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coIdSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coIdSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
