/**
 * GetOffreResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class GetOffreResponse  extends com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.apcHandling.Rateplan offerSource;

    public GetOffreResponse() {
    }

    public GetOffreResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           com.billcom.apc.generatedSOAP.bscs.apcHandling.Rateplan offerSource) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.offerSource = offerSource;
    }


    /**
     * Gets the offerSource value for this GetOffreResponse.
     * 
     * @return offerSource
     */
    public com.billcom.apc.generatedSOAP.bscs.apcHandling.Rateplan getOfferSource() {
        return offerSource;
    }


    /**
     * Sets the offerSource value for this GetOffreResponse.
     * 
     * @param offerSource
     */
    public void setOfferSource(com.billcom.apc.generatedSOAP.bscs.apcHandling.Rateplan offerSource) {
        this.offerSource = offerSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOffreResponse)) return false;
        GetOffreResponse other = (GetOffreResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.offerSource==null && other.getOfferSource()==null) || 
             (this.offerSource!=null &&
              this.offerSource.equals(other.getOfferSource())));
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
        if (getOfferSource() != null) {
            _hashCode += getOfferSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOffreResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOffreResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "offerSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Rateplan"));
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
