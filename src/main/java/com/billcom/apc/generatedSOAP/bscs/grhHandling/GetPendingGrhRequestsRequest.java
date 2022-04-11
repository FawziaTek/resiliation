/**
 * GetPendingGrhRequestsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.grhHandling;

public class GetPendingGrhRequestsRequest  implements java.io.Serializable {
    private java.lang.Integer commitmentIndicator;

    private com.billcom.apc.generatedSOAP.bscs.grhHandling.ContractReference contractReference;

    private java.lang.Integer paymentIndicator;

    public GetPendingGrhRequestsRequest() {
    }

    public GetPendingGrhRequestsRequest(
           java.lang.Integer commitmentIndicator,
           com.billcom.apc.generatedSOAP.bscs.grhHandling.ContractReference contractReference,
           java.lang.Integer paymentIndicator) {
           this.commitmentIndicator = commitmentIndicator;
           this.contractReference = contractReference;
           this.paymentIndicator = paymentIndicator;
    }


    /**
     * Gets the commitmentIndicator value for this GetPendingGrhRequestsRequest.
     * 
     * @return commitmentIndicator
     */
    public java.lang.Integer getCommitmentIndicator() {
        return commitmentIndicator;
    }


    /**
     * Sets the commitmentIndicator value for this GetPendingGrhRequestsRequest.
     * 
     * @param commitmentIndicator
     */
    public void setCommitmentIndicator(java.lang.Integer commitmentIndicator) {
        this.commitmentIndicator = commitmentIndicator;
    }


    /**
     * Gets the contractReference value for this GetPendingGrhRequestsRequest.
     * 
     * @return contractReference
     */
    public com.billcom.apc.generatedSOAP.bscs.grhHandling.ContractReference getContractReference() {
        return contractReference;
    }


    /**
     * Sets the contractReference value for this GetPendingGrhRequestsRequest.
     * 
     * @param contractReference
     */
    public void setContractReference(com.billcom.apc.generatedSOAP.bscs.grhHandling.ContractReference contractReference) {
        this.contractReference = contractReference;
    }


    /**
     * Gets the paymentIndicator value for this GetPendingGrhRequestsRequest.
     * 
     * @return paymentIndicator
     */
    public java.lang.Integer getPaymentIndicator() {
        return paymentIndicator;
    }


    /**
     * Sets the paymentIndicator value for this GetPendingGrhRequestsRequest.
     * 
     * @param paymentIndicator
     */
    public void setPaymentIndicator(java.lang.Integer paymentIndicator) {
        this.paymentIndicator = paymentIndicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPendingGrhRequestsRequest)) return false;
        GetPendingGrhRequestsRequest other = (GetPendingGrhRequestsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commitmentIndicator==null && other.getCommitmentIndicator()==null) || 
             (this.commitmentIndicator!=null &&
              this.commitmentIndicator.equals(other.getCommitmentIndicator()))) &&
            ((this.contractReference==null && other.getContractReference()==null) || 
             (this.contractReference!=null &&
              this.contractReference.equals(other.getContractReference()))) &&
            ((this.paymentIndicator==null && other.getPaymentIndicator()==null) || 
             (this.paymentIndicator!=null &&
              this.paymentIndicator.equals(other.getPaymentIndicator())));
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
        if (getCommitmentIndicator() != null) {
            _hashCode += getCommitmentIndicator().hashCode();
        }
        if (getContractReference() != null) {
            _hashCode += getContractReference().hashCode();
        }
        if (getPaymentIndicator() != null) {
            _hashCode += getPaymentIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPendingGrhRequestsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetPendingGrhRequestsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitmentIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "commitmentIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contractReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractReference"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "paymentIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
