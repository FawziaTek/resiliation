/**
 * ApcFafNumberHistRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class ApcFafNumberHistRequest  implements java.io.Serializable {
    private java.lang.Long coId;

    private java.lang.String numFaf;

    private java.lang.Long numberFaf;

    private java.lang.Long orderId;

    public ApcFafNumberHistRequest() {
    }

    public ApcFafNumberHistRequest(
           java.lang.Long coId,
           java.lang.String numFaf,
           java.lang.Long numberFaf,
           java.lang.Long orderId) {
           this.coId = coId;
           this.numFaf = numFaf;
           this.numberFaf = numberFaf;
           this.orderId = orderId;
    }


    /**
     * Gets the coId value for this ApcFafNumberHistRequest.
     * 
     * @return coId
     */
    public java.lang.Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this ApcFafNumberHistRequest.
     * 
     * @param coId
     */
    public void setCoId(java.lang.Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the numFaf value for this ApcFafNumberHistRequest.
     * 
     * @return numFaf
     */
    public java.lang.String getNumFaf() {
        return numFaf;
    }


    /**
     * Sets the numFaf value for this ApcFafNumberHistRequest.
     * 
     * @param numFaf
     */
    public void setNumFaf(java.lang.String numFaf) {
        this.numFaf = numFaf;
    }


    /**
     * Gets the numberFaf value for this ApcFafNumberHistRequest.
     * 
     * @return numberFaf
     */
    public java.lang.Long getNumberFaf() {
        return numberFaf;
    }


    /**
     * Sets the numberFaf value for this ApcFafNumberHistRequest.
     * 
     * @param numberFaf
     */
    public void setNumberFaf(java.lang.Long numberFaf) {
        this.numberFaf = numberFaf;
    }


    /**
     * Gets the orderId value for this ApcFafNumberHistRequest.
     * 
     * @return orderId
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this ApcFafNumberHistRequest.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApcFafNumberHistRequest)) return false;
        ApcFafNumberHistRequest other = (ApcFafNumberHistRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.numFaf==null && other.getNumFaf()==null) || 
             (this.numFaf!=null &&
              this.numFaf.equals(other.getNumFaf()))) &&
            ((this.numberFaf==null && other.getNumberFaf()==null) || 
             (this.numberFaf!=null &&
              this.numberFaf.equals(other.getNumberFaf()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId())));
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
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getNumFaf() != null) {
            _hashCode += getNumFaf().hashCode();
        }
        if (getNumberFaf() != null) {
            _hashCode += getNumberFaf().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApcFafNumberHistRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ApcFafNumberHistRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numFaf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "numFaf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberFaf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "numberFaf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "orderId"));
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
