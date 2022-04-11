/**
 * CallDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class CallDetails  implements java.io.Serializable {
    private java.lang.Double amount;

    private java.lang.String callType;

    private java.util.Calendar date;

    private java.lang.String destNum;

    private java.lang.Double duration;

    private java.lang.Boolean isExtraSubcription;

    public CallDetails() {
    }

    public CallDetails(
           java.lang.Double amount,
           java.lang.String callType,
           java.util.Calendar date,
           java.lang.String destNum,
           java.lang.Double duration,
           java.lang.Boolean isExtraSubcription) {
           this.amount = amount;
           this.callType = callType;
           this.date = date;
           this.destNum = destNum;
           this.duration = duration;
           this.isExtraSubcription = isExtraSubcription;
    }


    /**
     * Gets the amount value for this CallDetails.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CallDetails.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the callType value for this CallDetails.
     * 
     * @return callType
     */
    public java.lang.String getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this CallDetails.
     * 
     * @param callType
     */
    public void setCallType(java.lang.String callType) {
        this.callType = callType;
    }


    /**
     * Gets the date value for this CallDetails.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this CallDetails.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the destNum value for this CallDetails.
     * 
     * @return destNum
     */
    public java.lang.String getDestNum() {
        return destNum;
    }


    /**
     * Sets the destNum value for this CallDetails.
     * 
     * @param destNum
     */
    public void setDestNum(java.lang.String destNum) {
        this.destNum = destNum;
    }


    /**
     * Gets the duration value for this CallDetails.
     * 
     * @return duration
     */
    public java.lang.Double getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this CallDetails.
     * 
     * @param duration
     */
    public void setDuration(java.lang.Double duration) {
        this.duration = duration;
    }


    /**
     * Gets the isExtraSubcription value for this CallDetails.
     * 
     * @return isExtraSubcription
     */
    public java.lang.Boolean getIsExtraSubcription() {
        return isExtraSubcription;
    }


    /**
     * Sets the isExtraSubcription value for this CallDetails.
     * 
     * @param isExtraSubcription
     */
    public void setIsExtraSubcription(java.lang.Boolean isExtraSubcription) {
        this.isExtraSubcription = isExtraSubcription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallDetails)) return false;
        CallDetails other = (CallDetails) obj;
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
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.destNum==null && other.getDestNum()==null) || 
             (this.destNum!=null &&
              this.destNum.equals(other.getDestNum()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.isExtraSubcription==null && other.getIsExtraSubcription()==null) || 
             (this.isExtraSubcription!=null &&
              this.isExtraSubcription.equals(other.getIsExtraSubcription())));
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
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDestNum() != null) {
            _hashCode += getDestNum().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getIsExtraSubcription() != null) {
            _hashCode += getIsExtraSubcription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CallDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "callType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "destNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExtraSubcription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "isExtraSubcription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
