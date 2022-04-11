/**
 * ContractBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;


public class ContractBean  extends com.billcom.apc.generatedSOAP.bscs.apcHandling.BaseSOIBean  implements java.io.Serializable {
    private java.lang.Long coId;

    private java.lang.String coIdPub;

    private java.lang.Long csId;

    private java.lang.String csIdPub;

    private java.lang.String custName;

    private com.billcom.apc.generatedSOAP.bscs.apcHandling.Rateplan offer;

    public ContractBean() {
    }

    public ContractBean(
           java.lang.Long coId,
           java.lang.String coIdPub,
           java.lang.Long csId,
           java.lang.String csIdPub,
           java.lang.String custName,
           com.billcom.apc.generatedSOAP.bscs.apcHandling.Rateplan offer) {
        this.coId = coId;
        this.coIdPub = coIdPub;
        this.csId = csId;
        this.csIdPub = csIdPub;
        this.custName = custName;
        this.offer = offer;
    }


    /**
     * Gets the coId value for this ContractBean.
     * 
     * @return coId
     */
    public java.lang.Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this ContractBean.
     * 
     * @param coId
     */
    public void setCoId(java.lang.Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the coIdPub value for this ContractBean.
     * 
     * @return coIdPub
     */
    public java.lang.String getCoIdPub() {
        return coIdPub;
    }


    /**
     * Sets the coIdPub value for this ContractBean.
     * 
     * @param coIdPub
     */
    public void setCoIdPub(java.lang.String coIdPub) {
        this.coIdPub = coIdPub;
    }


    /**
     * Gets the csId value for this ContractBean.
     * 
     * @return csId
     */
    public java.lang.Long getCsId() {
        return csId;
    }


    /**
     * Sets the csId value for this ContractBean.
     * 
     * @param csId
     */
    public void setCsId(java.lang.Long csId) {
        this.csId = csId;
    }


    /**
     * Gets the csIdPub value for this ContractBean.
     * 
     * @return csIdPub
     */
    public java.lang.String getCsIdPub() {
        return csIdPub;
    }


    /**
     * Sets the csIdPub value for this ContractBean.
     * 
     * @param csIdPub
     */
    public void setCsIdPub(java.lang.String csIdPub) {
        this.csIdPub = csIdPub;
    }


    /**
     * Gets the custName value for this ContractBean.
     * 
     * @return custName
     */
    public java.lang.String getCustName() {
        return custName;
    }


    /**
     * Sets the custName value for this ContractBean.
     * 
     * @param custName
     */
    public void setCustName(java.lang.String custName) {
        this.custName = custName;
    }


    /**
     * Gets the offer value for this ContractBean.
     * 
     * @return offer
     */
    public com.billcom.apc.generatedSOAP.bscs.apcHandling.Rateplan getOffer() {
        return offer;
    }


    /**
     * Sets the offer value for this ContractBean.
     * 
     * @param offer
     */
    public void setOffer(com.billcom.apc.generatedSOAP.bscs.apcHandling.Rateplan offer) {
        this.offer = offer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractBean)) return false;
        ContractBean other = (ContractBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.coIdPub==null && other.getCoIdPub()==null) || 
             (this.coIdPub!=null &&
              this.coIdPub.equals(other.getCoIdPub()))) &&
            ((this.csId==null && other.getCsId()==null) || 
             (this.csId!=null &&
              this.csId.equals(other.getCsId()))) &&
            ((this.csIdPub==null && other.getCsIdPub()==null) || 
             (this.csIdPub!=null &&
              this.csIdPub.equals(other.getCsIdPub()))) &&
            ((this.custName==null && other.getCustName()==null) || 
             (this.custName!=null &&
              this.custName.equals(other.getCustName()))) &&
            ((this.offer==null && other.getOffer()==null) || 
             (this.offer!=null &&
              this.offer.equals(other.getOffer())));
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
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getCoIdPub() != null) {
            _hashCode += getCoIdPub().hashCode();
        }
        if (getCsId() != null) {
            _hashCode += getCsId().hashCode();
        }
        if (getCsIdPub() != null) {
            _hashCode += getCsIdPub().hashCode();
        }
        if (getCustName() != null) {
            _hashCode += getCustName().hashCode();
        }
        if (getOffer() != null) {
            _hashCode += getOffer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "custName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "offer"));
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
