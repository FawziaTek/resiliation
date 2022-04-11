/**
 * OCCRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class OCCRequest  implements java.io.Serializable {
    private java.lang.Double amount;

    private java.lang.Long coId;

    private java.lang.Long csId;

    private java.lang.String remark;

    private java.lang.Long rpCode;

    private java.lang.String snCodePub;

    private java.lang.String spCodePub;

    private com.billcom.apc.generatedSOAP.bscs.apcHandling.DateBean validFrom;

    public OCCRequest() {
    }

    public OCCRequest(
           java.lang.Double amount,
           java.lang.Long coId,
           java.lang.Long csId,
           java.lang.String remark,
           java.lang.Long rpCode,
           java.lang.String snCodePub,
           java.lang.String spCodePub,
           com.billcom.apc.generatedSOAP.bscs.apcHandling.DateBean validFrom) {
           this.amount = amount;
           this.coId = coId;
           this.csId = csId;
           this.remark = remark;
           this.rpCode = rpCode;
           this.snCodePub = snCodePub;
           this.spCodePub = spCodePub;
           this.validFrom = validFrom;
    }


    /**
     * Gets the amount value for this OCCRequest.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this OCCRequest.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the coId value for this OCCRequest.
     * 
     * @return coId
     */
    public java.lang.Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this OCCRequest.
     * 
     * @param coId
     */
    public void setCoId(java.lang.Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the csId value for this OCCRequest.
     * 
     * @return csId
     */
    public java.lang.Long getCsId() {
        return csId;
    }


    /**
     * Sets the csId value for this OCCRequest.
     * 
     * @param csId
     */
    public void setCsId(java.lang.Long csId) {
        this.csId = csId;
    }


    /**
     * Gets the remark value for this OCCRequest.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this OCCRequest.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the rpCode value for this OCCRequest.
     * 
     * @return rpCode
     */
    public java.lang.Long getRpCode() {
        return rpCode;
    }


    /**
     * Sets the rpCode value for this OCCRequest.
     * 
     * @param rpCode
     */
    public void setRpCode(java.lang.Long rpCode) {
        this.rpCode = rpCode;
    }


    /**
     * Gets the snCodePub value for this OCCRequest.
     * 
     * @return snCodePub
     */
    public java.lang.String getSnCodePub() {
        return snCodePub;
    }


    /**
     * Sets the snCodePub value for this OCCRequest.
     * 
     * @param snCodePub
     */
    public void setSnCodePub(java.lang.String snCodePub) {
        this.snCodePub = snCodePub;
    }


    /**
     * Gets the spCodePub value for this OCCRequest.
     * 
     * @return spCodePub
     */
    public java.lang.String getSpCodePub() {
        return spCodePub;
    }


    /**
     * Sets the spCodePub value for this OCCRequest.
     * 
     * @param spCodePub
     */
    public void setSpCodePub(java.lang.String spCodePub) {
        this.spCodePub = spCodePub;
    }


    /**
     * Gets the validFrom value for this OCCRequest.
     * 
     * @return validFrom
     */
    public com.billcom.apc.generatedSOAP.bscs.apcHandling.DateBean getValidFrom() {
        return validFrom;
    }


    /**
     * Sets the validFrom value for this OCCRequest.
     * 
     * @param validFrom
     */
    public void setValidFrom(com.billcom.apc.generatedSOAP.bscs.apcHandling.DateBean validFrom) {
        this.validFrom = validFrom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OCCRequest)) return false;
        OCCRequest other = (OCCRequest) obj;
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
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.csId==null && other.getCsId()==null) || 
             (this.csId!=null &&
              this.csId.equals(other.getCsId()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.rpCode==null && other.getRpCode()==null) || 
             (this.rpCode!=null &&
              this.rpCode.equals(other.getRpCode()))) &&
            ((this.snCodePub==null && other.getSnCodePub()==null) || 
             (this.snCodePub!=null &&
              this.snCodePub.equals(other.getSnCodePub()))) &&
            ((this.spCodePub==null && other.getSpCodePub()==null) || 
             (this.spCodePub!=null &&
              this.spCodePub.equals(other.getSpCodePub()))) &&
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
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getCsId() != null) {
            _hashCode += getCsId().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getRpCode() != null) {
            _hashCode += getRpCode().hashCode();
        }
        if (getSnCodePub() != null) {
            _hashCode += getSnCodePub().hashCode();
        }
        if (getSpCodePub() != null) {
            _hashCode += getSpCodePub().hashCode();
        }
        if (getValidFrom() != null) {
            _hashCode += getValidFrom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OCCRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OCCRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
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
        elemField.setFieldName("rpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snCodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "snCodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spCodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "spCodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
