/**
 * DetInvoicesByInvResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class DetInvoicesByInvResponse  extends com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse  implements java.io.Serializable {
    private java.lang.Integer countTotalFactureDetaillee;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.FactureDetaillee[] factureDetaillees;

    public DetInvoicesByInvResponse() {
    }

    public DetInvoicesByInvResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           java.lang.Integer countTotalFactureDetaillee,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.FactureDetaillee[] factureDetaillees) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.countTotalFactureDetaillee = countTotalFactureDetaillee;
        this.factureDetaillees = factureDetaillees;
    }


    /**
     * Gets the countTotalFactureDetaillee value for this DetInvoicesByInvResponse.
     * 
     * @return countTotalFactureDetaillee
     */
    public java.lang.Integer getCountTotalFactureDetaillee() {
        return countTotalFactureDetaillee;
    }


    /**
     * Sets the countTotalFactureDetaillee value for this DetInvoicesByInvResponse.
     * 
     * @param countTotalFactureDetaillee
     */
    public void setCountTotalFactureDetaillee(java.lang.Integer countTotalFactureDetaillee) {
        this.countTotalFactureDetaillee = countTotalFactureDetaillee;
    }


    /**
     * Gets the factureDetaillees value for this DetInvoicesByInvResponse.
     * 
     * @return factureDetaillees
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.FactureDetaillee[] getFactureDetaillees() {
        return factureDetaillees;
    }


    /**
     * Sets the factureDetaillees value for this DetInvoicesByInvResponse.
     * 
     * @param factureDetaillees
     */
    public void setFactureDetaillees(com.billcom.apc.generatedSOAP.bscs.contractHandling.FactureDetaillee[] factureDetaillees) {
        this.factureDetaillees = factureDetaillees;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetInvoicesByInvResponse)) return false;
        DetInvoicesByInvResponse other = (DetInvoicesByInvResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.countTotalFactureDetaillee==null && other.getCountTotalFactureDetaillee()==null) || 
             (this.countTotalFactureDetaillee!=null &&
              this.countTotalFactureDetaillee.equals(other.getCountTotalFactureDetaillee()))) &&
            ((this.factureDetaillees==null && other.getFactureDetaillees()==null) || 
             (this.factureDetaillees!=null &&
              java.util.Arrays.equals(this.factureDetaillees, other.getFactureDetaillees())));
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
        if (getCountTotalFactureDetaillee() != null) {
            _hashCode += getCountTotalFactureDetaillee().hashCode();
        }
        if (getFactureDetaillees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFactureDetaillees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFactureDetaillees(), i);
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
        new org.apache.axis.description.TypeDesc(DetInvoicesByInvResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetInvoicesByInvResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countTotalFactureDetaillee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "countTotalFactureDetaillee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factureDetaillees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "factureDetaillees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "FactureDetaillee"));
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
