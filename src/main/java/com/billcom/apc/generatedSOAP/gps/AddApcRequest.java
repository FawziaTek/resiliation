/**
 * AddApcRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.gps;

public class AddApcRequest  extends com.billcom.apc.generatedSOAP.gps.OperationRequest  implements java.io.Serializable {
    private long customerId;

    private float montantTTC;

    private int status;

    private java.util.Calendar validationDate;

    private java.util.Calendar updateDate;

    private long processId;

    public AddApcRequest() {
    }

    public AddApcRequest(
           long customerId,
           float montantTTC,
           int status,
           java.util.Calendar validationDate,
           java.util.Calendar updateDate,
           long processId) {
        this.customerId = customerId;
        this.montantTTC = montantTTC;
        this.status = status;
        this.validationDate = validationDate;
        this.updateDate = updateDate;
        this.processId = processId;
    }


    /**
     * Gets the customerId value for this AddApcRequest.
     * 
     * @return customerId
     */
    public long getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this AddApcRequest.
     * 
     * @param customerId
     */
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the montantTTC value for this AddApcRequest.
     * 
     * @return montantTTC
     */
    public float getMontantTTC() {
        return montantTTC;
    }


    /**
     * Sets the montantTTC value for this AddApcRequest.
     * 
     * @param montantTTC
     */
    public void setMontantTTC(float montantTTC) {
        this.montantTTC = montantTTC;
    }


    /**
     * Gets the status value for this AddApcRequest.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AddApcRequest.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the validationDate value for this AddApcRequest.
     * 
     * @return validationDate
     */
    public java.util.Calendar getValidationDate() {
        return validationDate;
    }


    /**
     * Sets the validationDate value for this AddApcRequest.
     * 
     * @param validationDate
     */
    public void setValidationDate(java.util.Calendar validationDate) {
        this.validationDate = validationDate;
    }


    /**
     * Gets the updateDate value for this AddApcRequest.
     * 
     * @return updateDate
     */
    public java.util.Calendar getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this AddApcRequest.
     * 
     * @param updateDate
     */
    public void setUpdateDate(java.util.Calendar updateDate) {
        this.updateDate = updateDate;
    }


    /**
     * Gets the processId value for this AddApcRequest.
     * 
     * @return processId
     */
    public long getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this AddApcRequest.
     * 
     * @param processId
     */
    public void setProcessId(long processId) {
        this.processId = processId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddApcRequest)) return false;
        AddApcRequest other = (AddApcRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.customerId == other.getCustomerId() &&
            this.montantTTC == other.getMontantTTC() &&
            this.status == other.getStatus() &&
            ((this.validationDate==null && other.getValidationDate()==null) || 
             (this.validationDate!=null &&
              this.validationDate.equals(other.getValidationDate()))) &&
            ((this.updateDate==null && other.getUpdateDate()==null) || 
             (this.updateDate!=null &&
              this.updateDate.equals(other.getUpdateDate()))) &&
            this.processId == other.getProcessId();
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
        _hashCode += new Long(getCustomerId()).hashCode();
        _hashCode += new Float(getMontantTTC()).hashCode();
        _hashCode += getStatus();
        if (getValidationDate() != null) {
            _hashCode += getValidationDate().hashCode();
        }
        if (getUpdateDate() != null) {
            _hashCode += getUpdateDate().hashCode();
        }
        _hashCode += new Long(getProcessId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddApcRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gps.webservices", "AddApcRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gps.webservices", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montantTTC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gps.webservices", "montantTTC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gps.webservices", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gps.webservices", "validationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gps.webservices", "updateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gps.webservices", "processId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
