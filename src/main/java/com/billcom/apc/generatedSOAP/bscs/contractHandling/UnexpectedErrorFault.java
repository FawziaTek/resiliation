/**
 * UnexpectedErrorFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;


public class UnexpectedErrorFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.lang.String faultcode;

    private java.lang.String faultstring;

    public UnexpectedErrorFault() {
    }

    public UnexpectedErrorFault(
           java.lang.String faultcode,
           java.lang.String faultstring) {
        this.faultcode = faultcode;
        this.faultstring = faultstring;
    }


    /**
     * Gets the faultcode value for this UnexpectedErrorFault.
     * 
     * @return faultcode
     */
    public java.lang.String getFaultcode() {
        return faultcode;
    }


    /**
     * Sets the faultcode value for this UnexpectedErrorFault.
     * 
     * @param faultcode
     */
    public void setFaultcode(java.lang.String faultcode) {
        this.faultcode = faultcode;
    }


    /**
     * Gets the faultstring value for this UnexpectedErrorFault.
     * 
     * @return faultstring
     */
    public java.lang.String getFaultstring() {
        return faultstring;
    }


    /**
     * Sets the faultstring value for this UnexpectedErrorFault.
     * 
     * @param faultstring
     */
    public void setFaultstring(java.lang.String faultstring) {
        this.faultstring = faultstring;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnexpectedErrorFault)) return false;
        UnexpectedErrorFault other = (UnexpectedErrorFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faultcode==null && other.getFaultcode()==null) || 
             (this.faultcode!=null &&
              this.faultcode.equals(other.getFaultcode()))) &&
            ((this.faultstring==null && other.getFaultstring()==null) || 
             (this.faultstring!=null &&
              this.faultstring.equals(other.getFaultstring())));
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
        if (getFaultcode() != null) {
            _hashCode += getFaultcode().hashCode();
        }
        if (getFaultstring() != null) {
            _hashCode += getFaultstring().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnexpectedErrorFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "faultcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultstring");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "faultstring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
