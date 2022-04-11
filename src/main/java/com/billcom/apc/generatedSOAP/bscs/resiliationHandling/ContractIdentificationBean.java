/**
 * ContractIdentificationBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class ContractIdentificationBean  implements java.io.Serializable {
    private java.lang.String contractCode;

    private java.lang.Long msisdn;

    private java.lang.String statusContract;

    private java.lang.Long tmcode;

    public ContractIdentificationBean() {
    }

    public ContractIdentificationBean(
           java.lang.String contractCode,
           java.lang.Long msisdn,
           java.lang.String statusContract,
           java.lang.Long tmcode) {
           this.contractCode = contractCode;
           this.msisdn = msisdn;
           this.statusContract = statusContract;
           this.tmcode = tmcode;
    }


    /**
     * Gets the contractCode value for this ContractIdentificationBean.
     * 
     * @return contractCode
     */
    public java.lang.String getContractCode() {
        return contractCode;
    }


    /**
     * Sets the contractCode value for this ContractIdentificationBean.
     * 
     * @param contractCode
     */
    public void setContractCode(java.lang.String contractCode) {
        this.contractCode = contractCode;
    }


    /**
     * Gets the msisdn value for this ContractIdentificationBean.
     * 
     * @return msisdn
     */
    public java.lang.Long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ContractIdentificationBean.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.Long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the statusContract value for this ContractIdentificationBean.
     * 
     * @return statusContract
     */
    public java.lang.String getStatusContract() {
        return statusContract;
    }


    /**
     * Sets the statusContract value for this ContractIdentificationBean.
     * 
     * @param statusContract
     */
    public void setStatusContract(java.lang.String statusContract) {
        this.statusContract = statusContract;
    }


    /**
     * Gets the tmcode value for this ContractIdentificationBean.
     * 
     * @return tmcode
     */
    public java.lang.Long getTmcode() {
        return tmcode;
    }


    /**
     * Sets the tmcode value for this ContractIdentificationBean.
     * 
     * @param tmcode
     */
    public void setTmcode(java.lang.Long tmcode) {
        this.tmcode = tmcode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractIdentificationBean)) return false;
        ContractIdentificationBean other = (ContractIdentificationBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contractCode==null && other.getContractCode()==null) || 
             (this.contractCode!=null &&
              this.contractCode.equals(other.getContractCode()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.statusContract==null && other.getStatusContract()==null) || 
             (this.statusContract!=null &&
              this.statusContract.equals(other.getStatusContract()))) &&
            ((this.tmcode==null && other.getTmcode()==null) || 
             (this.tmcode!=null &&
              this.tmcode.equals(other.getTmcode())));
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
        if (getContractCode() != null) {
            _hashCode += getContractCode().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getStatusContract() != null) {
            _hashCode += getStatusContract().hashCode();
        }
        if (getTmcode() != null) {
            _hashCode += getTmcode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractIdentificationBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractIdentificationBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contractCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusContract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "statusContract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "tmcode"));
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
