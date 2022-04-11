/**
 * ResultResiliationBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class ResultResiliationBean  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractBean[] contracts;

    private boolean elig;

    public ResultResiliationBean() {
    }

    public ResultResiliationBean(
           com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractBean[] contracts,
           boolean elig) {
           this.contracts = contracts;
           this.elig = elig;
    }


    /**
     * Gets the contracts value for this ResultResiliationBean.
     * 
     * @return contracts
     */
    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractBean[] getContracts() {
        return contracts;
    }


    /**
     * Sets the contracts value for this ResultResiliationBean.
     * 
     * @param contracts
     */
    public void setContracts(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractBean[] contracts) {
        this.contracts = contracts;
    }


    /**
     * Gets the elig value for this ResultResiliationBean.
     * 
     * @return elig
     */
    public boolean isElig() {
        return elig;
    }


    /**
     * Sets the elig value for this ResultResiliationBean.
     * 
     * @param elig
     */
    public void setElig(boolean elig) {
        this.elig = elig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultResiliationBean)) return false;
        ResultResiliationBean other = (ResultResiliationBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contracts==null && other.getContracts()==null) || 
             (this.contracts!=null &&
              java.util.Arrays.equals(this.contracts, other.getContracts()))) &&
            this.elig == other.isElig();
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
        if (getContracts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContracts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContracts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isElig() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultResiliationBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ResultResiliationBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contracts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contracts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "elig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
