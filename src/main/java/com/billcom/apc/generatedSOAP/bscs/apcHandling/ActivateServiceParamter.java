/**
 * ActivateServiceParamter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class ActivateServiceParamter  implements java.io.Serializable {
    private java.lang.Long coId;

    private java.lang.String coIdPub;

    private com.billcom.apc.generatedSOAP.bscs.apcHandling.Service[] services;

    public ActivateServiceParamter() {
    }

    public ActivateServiceParamter(
           java.lang.Long coId,
           java.lang.String coIdPub,
           com.billcom.apc.generatedSOAP.bscs.apcHandling.Service[] services) {
           this.coId = coId;
           this.coIdPub = coIdPub;
           this.services = services;
    }


    /**
     * Gets the coId value for this ActivateServiceParamter.
     * 
     * @return coId
     */
    public java.lang.Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this ActivateServiceParamter.
     * 
     * @param coId
     */
    public void setCoId(java.lang.Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the coIdPub value for this ActivateServiceParamter.
     * 
     * @return coIdPub
     */
    public java.lang.String getCoIdPub() {
        return coIdPub;
    }


    /**
     * Sets the coIdPub value for this ActivateServiceParamter.
     * 
     * @param coIdPub
     */
    public void setCoIdPub(java.lang.String coIdPub) {
        this.coIdPub = coIdPub;
    }


    /**
     * Gets the services value for this ActivateServiceParamter.
     * 
     * @return services
     */
    public com.billcom.apc.generatedSOAP.bscs.apcHandling.Service[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this ActivateServiceParamter.
     * 
     * @param services
     */
    public void setServices(com.billcom.apc.generatedSOAP.bscs.apcHandling.Service[] services) {
        this.services = services;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivateServiceParamter)) return false;
        ActivateServiceParamter other = (ActivateServiceParamter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.coIdPub==null && other.getCoIdPub()==null) || 
             (this.coIdPub!=null &&
              this.coIdPub.equals(other.getCoIdPub()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices())));
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
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getCoIdPub() != null) {
            _hashCode += getCoIdPub().hashCode();
        }
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
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
        new org.apache.axis.description.TypeDesc(ActivateServiceParamter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ActivateServiceParamter"));
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
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service"));
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
