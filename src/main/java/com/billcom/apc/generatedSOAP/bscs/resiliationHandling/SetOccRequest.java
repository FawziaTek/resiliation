/**
 * SetOccRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class SetOccRequest  implements java.io.Serializable {
    private java.lang.Double amount;

    private com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractOccBean[] coIdList;

    private java.lang.Long csId;

    private java.lang.String remark;

    private java.lang.Long snCode;

    private java.lang.Long spCode;

    private com.billcom.apc.generatedSOAP.bscs.resiliationHandling.DateBean validFrom;

    public SetOccRequest() {
    }

    public SetOccRequest(
           java.lang.Double amount,
           com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractOccBean[] coIdList,
           java.lang.Long csId,
           java.lang.String remark,
           java.lang.Long snCode,
           java.lang.Long spCode,
           com.billcom.apc.generatedSOAP.bscs.resiliationHandling.DateBean validFrom) {
           this.amount = amount;
           this.coIdList = coIdList;
           this.csId = csId;
           this.remark = remark;
           this.snCode = snCode;
           this.spCode = spCode;
           this.validFrom = validFrom;
    }


    /**
     * Gets the amount value for this SetOccRequest.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SetOccRequest.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the coIdList value for this SetOccRequest.
     * 
     * @return coIdList
     */
    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractOccBean[] getCoIdList() {
        return coIdList;
    }


    /**
     * Sets the coIdList value for this SetOccRequest.
     * 
     * @param coIdList
     */
    public void setCoIdList(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractOccBean[] coIdList) {
        this.coIdList = coIdList;
    }


    /**
     * Gets the csId value for this SetOccRequest.
     * 
     * @return csId
     */
    public java.lang.Long getCsId() {
        return csId;
    }


    /**
     * Sets the csId value for this SetOccRequest.
     * 
     * @param csId
     */
    public void setCsId(java.lang.Long csId) {
        this.csId = csId;
    }


    /**
     * Gets the remark value for this SetOccRequest.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this SetOccRequest.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the snCode value for this SetOccRequest.
     * 
     * @return snCode
     */
    public java.lang.Long getSnCode() {
        return snCode;
    }


    /**
     * Sets the snCode value for this SetOccRequest.
     * 
     * @param snCode
     */
    public void setSnCode(java.lang.Long snCode) {
        this.snCode = snCode;
    }


    /**
     * Gets the spCode value for this SetOccRequest.
     * 
     * @return spCode
     */
    public java.lang.Long getSpCode() {
        return spCode;
    }


    /**
     * Sets the spCode value for this SetOccRequest.
     * 
     * @param spCode
     */
    public void setSpCode(java.lang.Long spCode) {
        this.spCode = spCode;
    }


    /**
     * Gets the validFrom value for this SetOccRequest.
     * 
     * @return validFrom
     */
    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.DateBean getValidFrom() {
        return validFrom;
    }


    /**
     * Sets the validFrom value for this SetOccRequest.
     * 
     * @param validFrom
     */
    public void setValidFrom(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.DateBean validFrom) {
        this.validFrom = validFrom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetOccRequest)) return false;
        SetOccRequest other = (SetOccRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.coIdList==null && other.getCoIdList()==null) || 
             (this.coIdList!=null &&
              java.util.Arrays.equals(this.coIdList, other.getCoIdList()))) &&
            ((this.csId==null && other.getCsId()==null) || 
             (this.csId!=null &&
              this.csId.equals(other.getCsId()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.snCode==null && other.getSnCode()==null) || 
             (this.snCode!=null &&
              this.snCode.equals(other.getSnCode()))) &&
            ((this.spCode==null && other.getSpCode()==null) || 
             (this.spCode!=null &&
              this.spCode.equals(other.getSpCode()))) &&
            ((this.validFrom==null && other.getValidFrom()==null) || 
             (this.validFrom!=null &&
              this.validFrom.equals(other.getValidFrom())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCoIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCsId() != null) {
            _hashCode += getCsId().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getSnCode() != null) {
            _hashCode += getSnCode().hashCode();
        }
        if (getSpCode() != null) {
            _hashCode += getSpCode().hashCode();
        }
        if (getValidFrom() != null) {
            _hashCode += getValidFrom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetOccRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "SetOccRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractOccBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "snCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "spCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "validFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean"));
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
