/**
 * CustomerOffreBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class CustomerOffreBean  implements java.io.Serializable {
    private java.lang.String des;

    private int nomberContrats;

    private java.lang.String shdes;

    private int tmcode;

    public CustomerOffreBean() {
    }

    public CustomerOffreBean(
           java.lang.String des,
           int nomberContrats,
           java.lang.String shdes,
           int tmcode) {
           this.des = des;
           this.nomberContrats = nomberContrats;
           this.shdes = shdes;
           this.tmcode = tmcode;
    }


    /**
     * Gets the des value for this CustomerOffreBean.
     * 
     * @return des
     */
    public java.lang.String getDes() {
        return des;
    }


    /**
     * Sets the des value for this CustomerOffreBean.
     * 
     * @param des
     */
    public void setDes(java.lang.String des) {
        this.des = des;
    }


    /**
     * Gets the nomberContrats value for this CustomerOffreBean.
     * 
     * @return nomberContrats
     */
    public int getNomberContrats() {
        return nomberContrats;
    }


    /**
     * Sets the nomberContrats value for this CustomerOffreBean.
     * 
     * @param nomberContrats
     */
    public void setNomberContrats(int nomberContrats) {
        this.nomberContrats = nomberContrats;
    }


    /**
     * Gets the shdes value for this CustomerOffreBean.
     * 
     * @return shdes
     */
    public java.lang.String getShdes() {
        return shdes;
    }


    /**
     * Sets the shdes value for this CustomerOffreBean.
     * 
     * @param shdes
     */
    public void setShdes(java.lang.String shdes) {
        this.shdes = shdes;
    }


    /**
     * Gets the tmcode value for this CustomerOffreBean.
     * 
     * @return tmcode
     */
    public int getTmcode() {
        return tmcode;
    }


    /**
     * Sets the tmcode value for this CustomerOffreBean.
     * 
     * @param tmcode
     */
    public void setTmcode(int tmcode) {
        this.tmcode = tmcode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerOffreBean)) return false;
        CustomerOffreBean other = (CustomerOffreBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.des==null && other.getDes()==null) || 
             (this.des!=null &&
              this.des.equals(other.getDes()))) &&
            this.nomberContrats == other.getNomberContrats() &&
            ((this.shdes==null && other.getShdes()==null) || 
             (this.shdes!=null &&
              this.shdes.equals(other.getShdes()))) &&
            this.tmcode == other.getTmcode();
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
        if (getDes() != null) {
            _hashCode += getDes().hashCode();
        }
        _hashCode += getNomberContrats();
        if (getShdes() != null) {
            _hashCode += getShdes().hashCode();
        }
        _hashCode += getTmcode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerOffreBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerOffreBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("des");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "des"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomberContrats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "nomberContrats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shdes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "shdes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "tmcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
