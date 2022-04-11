/**
 * GetConfigBalanceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class GetConfigBalanceResponse  extends com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.apcHandling.Balance[] balancesCible;

    private com.billcom.apc.generatedSOAP.bscs.apcHandling.Balance[] balancesSource;

    public GetConfigBalanceResponse() {
    }

    public GetConfigBalanceResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           com.billcom.apc.generatedSOAP.bscs.apcHandling.Balance[] balancesCible,
           com.billcom.apc.generatedSOAP.bscs.apcHandling.Balance[] balancesSource) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.balancesCible = balancesCible;
        this.balancesSource = balancesSource;
    }


    /**
     * Gets the balancesCible value for this GetConfigBalanceResponse.
     * 
     * @return balancesCible
     */
    public com.billcom.apc.generatedSOAP.bscs.apcHandling.Balance[] getBalancesCible() {
        return balancesCible;
    }


    /**
     * Sets the balancesCible value for this GetConfigBalanceResponse.
     * 
     * @param balancesCible
     */
    public void setBalancesCible(com.billcom.apc.generatedSOAP.bscs.apcHandling.Balance[] balancesCible) {
        this.balancesCible = balancesCible;
    }


    /**
     * Gets the balancesSource value for this GetConfigBalanceResponse.
     * 
     * @return balancesSource
     */
    public com.billcom.apc.generatedSOAP.bscs.apcHandling.Balance[] getBalancesSource() {
        return balancesSource;
    }


    /**
     * Sets the balancesSource value for this GetConfigBalanceResponse.
     * 
     * @param balancesSource
     */
    public void setBalancesSource(com.billcom.apc.generatedSOAP.bscs.apcHandling.Balance[] balancesSource) {
        this.balancesSource = balancesSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetConfigBalanceResponse)) return false;
        GetConfigBalanceResponse other = (GetConfigBalanceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.balancesCible==null && other.getBalancesCible()==null) || 
             (this.balancesCible!=null &&
              java.util.Arrays.equals(this.balancesCible, other.getBalancesCible()))) &&
            ((this.balancesSource==null && other.getBalancesSource()==null) || 
             (this.balancesSource!=null &&
              java.util.Arrays.equals(this.balancesSource, other.getBalancesSource())));
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
        if (getBalancesCible() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalancesCible());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalancesCible(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBalancesSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalancesSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalancesSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetConfigBalanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetConfigBalanceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancesCible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "balancesCible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Balance"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancesSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "balancesSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Balance"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
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
