/**
 * GetCustomerOfferAndStatistiqueResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class GetCustomerOfferAndStatistiqueResponse  extends com.billcom.apc.generatedSOAP.bscs.resiliationHandling.OperationResponse  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CustomerOffreBean[] customerOffreBean;

    private int nombreContratsTotal;

    public GetCustomerOfferAndStatistiqueResponse() {
    }

    public GetCustomerOfferAndStatistiqueResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CustomerOffreBean[] customerOffreBean,
           int nombreContratsTotal) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.customerOffreBean = customerOffreBean;
        this.nombreContratsTotal = nombreContratsTotal;
    }


    /**
     * Gets the customerOffreBean value for this GetCustomerOfferAndStatistiqueResponse.
     * 
     * @return customerOffreBean
     */
    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CustomerOffreBean[] getCustomerOffreBean() {
        return customerOffreBean;
    }


    /**
     * Sets the customerOffreBean value for this GetCustomerOfferAndStatistiqueResponse.
     * 
     * @param customerOffreBean
     */
    public void setCustomerOffreBean(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CustomerOffreBean[] customerOffreBean) {
        this.customerOffreBean = customerOffreBean;
    }


    /**
     * Gets the nombreContratsTotal value for this GetCustomerOfferAndStatistiqueResponse.
     * 
     * @return nombreContratsTotal
     */
    public int getNombreContratsTotal() {
        return nombreContratsTotal;
    }


    /**
     * Sets the nombreContratsTotal value for this GetCustomerOfferAndStatistiqueResponse.
     * 
     * @param nombreContratsTotal
     */
    public void setNombreContratsTotal(int nombreContratsTotal) {
        this.nombreContratsTotal = nombreContratsTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCustomerOfferAndStatistiqueResponse)) return false;
        GetCustomerOfferAndStatistiqueResponse other = (GetCustomerOfferAndStatistiqueResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customerOffreBean==null && other.getCustomerOffreBean()==null) || 
             (this.customerOffreBean!=null &&
              java.util.Arrays.equals(this.customerOffreBean, other.getCustomerOffreBean()))) &&
            this.nombreContratsTotal == other.getNombreContratsTotal();
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
        if (getCustomerOffreBean() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerOffreBean());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerOffreBean(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getNombreContratsTotal();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCustomerOfferAndStatistiqueResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerOfferAndStatistiqueResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerOffreBean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "customerOffreBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerOffreBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreContratsTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "nombreContratsTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
