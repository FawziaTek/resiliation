/**
 * TakeNewGrhRequestIntoAccountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.grhHandling;

public class TakeNewGrhRequestIntoAccountResponse  extends com.billcom.apc.generatedSOAP.bscs.grhHandling.OperationResponse  implements java.io.Serializable {
    private java.lang.Long tickNumber;

    public TakeNewGrhRequestIntoAccountResponse() {
    }

    public TakeNewGrhRequestIntoAccountResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           java.lang.Long tickNumber) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.tickNumber = tickNumber;
    }


    /**
     * Gets the tickNumber value for this TakeNewGrhRequestIntoAccountResponse.
     * 
     * @return tickNumber
     */
    public java.lang.Long getTickNumber() {
        return tickNumber;
    }


    /**
     * Sets the tickNumber value for this TakeNewGrhRequestIntoAccountResponse.
     * 
     * @param tickNumber
     */
    public void setTickNumber(java.lang.Long tickNumber) {
        this.tickNumber = tickNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TakeNewGrhRequestIntoAccountResponse)) return false;
        TakeNewGrhRequestIntoAccountResponse other = (TakeNewGrhRequestIntoAccountResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tickNumber==null && other.getTickNumber()==null) || 
             (this.tickNumber!=null &&
              this.tickNumber.equals(other.getTickNumber())));
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
        if (getTickNumber() != null) {
            _hashCode += getTickNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TakeNewGrhRequestIntoAccountResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "TakeNewGrhRequestIntoAccountResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "tickNumber"));
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
