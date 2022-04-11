/**
 * ContractServicesReadBeanIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractServicesRead;

public class ContractServicesReadBeanIn  extends com.billcom.apc.generatedSOAP.bscs.contractServicesRead.BaseSOIBean  implements java.io.Serializable {
    private java.lang.Long coId;

    private java.lang.String coIdPub;

    private java.lang.Long profileId;

    private java.lang.Long sncode;

    private java.lang.String sncodePub;

    private java.lang.Long spcode;

    private java.lang.String spcodePub;

    public ContractServicesReadBeanIn() {
    }

    public ContractServicesReadBeanIn(
           java.lang.Long coId,
           java.lang.String coIdPub,
           java.lang.Long profileId,
           java.lang.Long sncode,
           java.lang.String sncodePub,
           java.lang.Long spcode,
           java.lang.String spcodePub) {
        this.coId = coId;
        this.coIdPub = coIdPub;
        this.profileId = profileId;
        this.sncode = sncode;
        this.sncodePub = sncodePub;
        this.spcode = spcode;
        this.spcodePub = spcodePub;
    }


    /**
     * Gets the coId value for this ContractServicesReadBeanIn.
     * 
     * @return coId
     */
    public java.lang.Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this ContractServicesReadBeanIn.
     * 
     * @param coId
     */
    public void setCoId(java.lang.Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the coIdPub value for this ContractServicesReadBeanIn.
     * 
     * @return coIdPub
     */
    public java.lang.String getCoIdPub() {
        return coIdPub;
    }


    /**
     * Sets the coIdPub value for this ContractServicesReadBeanIn.
     * 
     * @param coIdPub
     */
    public void setCoIdPub(java.lang.String coIdPub) {
        this.coIdPub = coIdPub;
    }


    /**
     * Gets the profileId value for this ContractServicesReadBeanIn.
     * 
     * @return profileId
     */
    public java.lang.Long getProfileId() {
        return profileId;
    }


    /**
     * Sets the profileId value for this ContractServicesReadBeanIn.
     * 
     * @param profileId
     */
    public void setProfileId(java.lang.Long profileId) {
        this.profileId = profileId;
    }


    /**
     * Gets the sncode value for this ContractServicesReadBeanIn.
     * 
     * @return sncode
     */
    public java.lang.Long getSncode() {
        return sncode;
    }


    /**
     * Sets the sncode value for this ContractServicesReadBeanIn.
     * 
     * @param sncode
     */
    public void setSncode(java.lang.Long sncode) {
        this.sncode = sncode;
    }


    /**
     * Gets the sncodePub value for this ContractServicesReadBeanIn.
     * 
     * @return sncodePub
     */
    public java.lang.String getSncodePub() {
        return sncodePub;
    }


    /**
     * Sets the sncodePub value for this ContractServicesReadBeanIn.
     * 
     * @param sncodePub
     */
    public void setSncodePub(java.lang.String sncodePub) {
        this.sncodePub = sncodePub;
    }


    /**
     * Gets the spcode value for this ContractServicesReadBeanIn.
     * 
     * @return spcode
     */
    public java.lang.Long getSpcode() {
        return spcode;
    }


    /**
     * Sets the spcode value for this ContractServicesReadBeanIn.
     * 
     * @param spcode
     */
    public void setSpcode(java.lang.Long spcode) {
        this.spcode = spcode;
    }


    /**
     * Gets the spcodePub value for this ContractServicesReadBeanIn.
     * 
     * @return spcodePub
     */
    public java.lang.String getSpcodePub() {
        return spcodePub;
    }


    /**
     * Sets the spcodePub value for this ContractServicesReadBeanIn.
     * 
     * @param spcodePub
     */
    public void setSpcodePub(java.lang.String spcodePub) {
        this.spcodePub = spcodePub;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractServicesReadBeanIn)) return false;
        ContractServicesReadBeanIn other = (ContractServicesReadBeanIn) obj;
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
            ((this.profileId==null && other.getProfileId()==null) || 
             (this.profileId!=null &&
              this.profileId.equals(other.getProfileId()))) &&
            ((this.sncode==null && other.getSncode()==null) || 
             (this.sncode!=null &&
              this.sncode.equals(other.getSncode()))) &&
            ((this.sncodePub==null && other.getSncodePub()==null) || 
             (this.sncodePub!=null &&
              this.sncodePub.equals(other.getSncodePub()))) &&
            ((this.spcode==null && other.getSpcode()==null) || 
             (this.spcode!=null &&
              this.spcode.equals(other.getSpcode()))) &&
            ((this.spcodePub==null && other.getSpcodePub()==null) || 
             (this.spcodePub!=null &&
              this.spcodePub.equals(other.getSpcodePub())));
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
        if (getProfileId() != null) {
            _hashCode += getProfileId().hashCode();
        }
        if (getSncode() != null) {
            _hashCode += getSncode().hashCode();
        }
        if (getSncodePub() != null) {
            _hashCode += getSncodePub().hashCode();
        }
        if (getSpcode() != null) {
            _hashCode += getSpcode().hashCode();
        }
        if (getSpcodePub() != null) {
            _hashCode += getSpcodePub().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractServicesReadBeanIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractServicesReadBeanIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "coIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "profileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sncode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "sncode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sncodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "sncodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "spcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spcodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "spcodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
