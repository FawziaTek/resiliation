/**
 * AddGrhRequestRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.grhHandling;

public class AddGrhRequestRequest  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhRequest grhRequest;

    public AddGrhRequestRequest() {
    }

    public AddGrhRequestRequest(
           com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhRequest grhRequest) {
           this.grhRequest = grhRequest;
    }


    /**
     * Gets the grhRequest value for this AddGrhRequestRequest.
     * 
     * @return grhRequest
     */
    public com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhRequest getGrhRequest() {
        return grhRequest;
    }


    /**
     * Sets the grhRequest value for this AddGrhRequestRequest.
     * 
     * @param grhRequest
     */
    public void setGrhRequest(com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhRequest grhRequest) {
        this.grhRequest = grhRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddGrhRequestRequest)) return false;
        AddGrhRequestRequest other = (AddGrhRequestRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grhRequest==null && other.getGrhRequest()==null) || 
             (this.grhRequest!=null &&
              this.grhRequest.equals(other.getGrhRequest())));
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
        if (getGrhRequest() != null) {
            _hashCode += getGrhRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddGrhRequestRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddGrhRequestRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grhRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "grhRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GrhRequest"));
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
