/**
 * CheckRateplanResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class CheckRateplanResponse  extends com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.contractHandling.Reference[] incompatibleServices;

    private java.lang.Boolean isCompatible;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.Reference[] missingServices;

    public CheckRateplanResponse() {
    }

    public CheckRateplanResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.Reference[] incompatibleServices,
           java.lang.Boolean isCompatible,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.Reference[] missingServices) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.incompatibleServices = incompatibleServices;
        this.isCompatible = isCompatible;
        this.missingServices = missingServices;
    }


    /**
     * Gets the incompatibleServices value for this CheckRateplanResponse.
     * 
     * @return incompatibleServices
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.Reference[] getIncompatibleServices() {
        return incompatibleServices;
    }


    /**
     * Sets the incompatibleServices value for this CheckRateplanResponse.
     * 
     * @param incompatibleServices
     */
    public void setIncompatibleServices(com.billcom.apc.generatedSOAP.bscs.contractHandling.Reference[] incompatibleServices) {
        this.incompatibleServices = incompatibleServices;
    }


    /**
     * Gets the isCompatible value for this CheckRateplanResponse.
     * 
     * @return isCompatible
     */
    public java.lang.Boolean getIsCompatible() {
        return isCompatible;
    }


    /**
     * Sets the isCompatible value for this CheckRateplanResponse.
     * 
     * @param isCompatible
     */
    public void setIsCompatible(java.lang.Boolean isCompatible) {
        this.isCompatible = isCompatible;
    }


    /**
     * Gets the missingServices value for this CheckRateplanResponse.
     * 
     * @return missingServices
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.Reference[] getMissingServices() {
        return missingServices;
    }


    /**
     * Sets the missingServices value for this CheckRateplanResponse.
     * 
     * @param missingServices
     */
    public void setMissingServices(com.billcom.apc.generatedSOAP.bscs.contractHandling.Reference[] missingServices) {
        this.missingServices = missingServices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckRateplanResponse)) return false;
        CheckRateplanResponse other = (CheckRateplanResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.incompatibleServices==null && other.getIncompatibleServices()==null) || 
             (this.incompatibleServices!=null &&
              java.util.Arrays.equals(this.incompatibleServices, other.getIncompatibleServices()))) &&
            ((this.isCompatible==null && other.getIsCompatible()==null) || 
             (this.isCompatible!=null &&
              this.isCompatible.equals(other.getIsCompatible()))) &&
            ((this.missingServices==null && other.getMissingServices()==null) || 
             (this.missingServices!=null &&
              java.util.Arrays.equals(this.missingServices, other.getMissingServices())));
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
        if (getIncompatibleServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncompatibleServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncompatibleServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsCompatible() != null) {
            _hashCode += getIsCompatible().hashCode();
        }
        if (getMissingServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMissingServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMissingServices(), i);
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
        new org.apache.axis.description.TypeDesc(CheckRateplanResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incompatibleServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "incompatibleServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Reference"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCompatible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "isCompatible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missingServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "missingServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Reference"));
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
