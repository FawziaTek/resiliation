/**
 * ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractServicesRead;

public class ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut  extends com.billcom.apc.generatedSOAP.bscs.contractServicesRead.BaseSOIBean  implements java.io.Serializable {
    private java.lang.Long cospPortNp;

    private java.lang.String cospPortNpPub;

    private java.lang.String cospPortnum;

    private java.lang.Integer cospStatus;

    public ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut() {
    }

    public ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut(
           java.lang.Long cospPortNp,
           java.lang.String cospPortNpPub,
           java.lang.String cospPortnum,
           java.lang.Integer cospStatus) {
        this.cospPortNp = cospPortNp;
        this.cospPortNpPub = cospPortNpPub;
        this.cospPortnum = cospPortnum;
        this.cospStatus = cospStatus;
    }


    /**
     * Gets the cospPortNp value for this ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut.
     * 
     * @return cospPortNp
     */
    public java.lang.Long getCospPortNp() {
        return cospPortNp;
    }


    /**
     * Sets the cospPortNp value for this ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut.
     * 
     * @param cospPortNp
     */
    public void setCospPortNp(java.lang.Long cospPortNp) {
        this.cospPortNp = cospPortNp;
    }


    /**
     * Gets the cospPortNpPub value for this ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut.
     * 
     * @return cospPortNpPub
     */
    public java.lang.String getCospPortNpPub() {
        return cospPortNpPub;
    }


    /**
     * Sets the cospPortNpPub value for this ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut.
     * 
     * @param cospPortNpPub
     */
    public void setCospPortNpPub(java.lang.String cospPortNpPub) {
        this.cospPortNpPub = cospPortNpPub;
    }


    /**
     * Gets the cospPortnum value for this ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut.
     * 
     * @return cospPortnum
     */
    public java.lang.String getCospPortnum() {
        return cospPortnum;
    }


    /**
     * Sets the cospPortnum value for this ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut.
     * 
     * @param cospPortnum
     */
    public void setCospPortnum(java.lang.String cospPortnum) {
        this.cospPortnum = cospPortnum;
    }


    /**
     * Gets the cospStatus value for this ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut.
     * 
     * @return cospStatus
     */
    public java.lang.Integer getCospStatus() {
        return cospStatus;
    }


    /**
     * Sets the cospStatus value for this ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut.
     * 
     * @param cospStatus
     */
    public void setCospStatus(java.lang.Integer cospStatus) {
        this.cospStatus = cospStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut)) return false;
        ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut other = (ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cospPortNp==null && other.getCospPortNp()==null) || 
             (this.cospPortNp!=null &&
              this.cospPortNp.equals(other.getCospPortNp()))) &&
            ((this.cospPortNpPub==null && other.getCospPortNpPub()==null) || 
             (this.cospPortNpPub!=null &&
              this.cospPortNpPub.equals(other.getCospPortNpPub()))) &&
            ((this.cospPortnum==null && other.getCospPortnum()==null) || 
             (this.cospPortnum!=null &&
              this.cospPortnum.equals(other.getCospPortnum()))) &&
            ((this.cospStatus==null && other.getCospStatus()==null) || 
             (this.cospStatus!=null &&
              this.cospStatus.equals(other.getCospStatus())));
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
        if (getCospPortNp() != null) {
            _hashCode += getCospPortNp().hashCode();
        }
        if (getCospPortNpPub() != null) {
            _hashCode += getCospPortNpPub().hashCode();
        }
        if (getCospPortnum() != null) {
            _hashCode += getCospPortnum().hashCode();
        }
        if (getCospStatus() != null) {
            _hashCode += getCospStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComLhsWsBeansV2Contract_services_readServicesPortsBeanOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_services_read.services.PortsBeanOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cospPortNp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "cospPortNp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cospPortNpPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "cospPortNpPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cospPortnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "cospPortnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cospStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "cospStatus"));
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
