/**
 * ContractServiceParametersReadBeanIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead;

public class ContractServiceParametersReadBeanIn  extends com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.BaseSOIBean  implements java.io.Serializable {
    private java.lang.Long coId;

    private java.lang.String coIdPub;

    private java.lang.Long extServiceId;

    private java.lang.String extServiceIdPub;

    private java.lang.Long profileId;

    private java.lang.Long sncode;

    private java.lang.String sncodePub;

    private java.lang.Long spcode;

    private java.lang.String spcodePub;

    public ContractServiceParametersReadBeanIn() {
    }

    public ContractServiceParametersReadBeanIn(
           java.lang.Long coId,
           java.lang.String coIdPub,
           java.lang.Long extServiceId,
           java.lang.String extServiceIdPub,
           java.lang.Long profileId,
           java.lang.Long sncode,
           java.lang.String sncodePub,
           java.lang.Long spcode,
           java.lang.String spcodePub) {
        this.coId = coId;
        this.coIdPub = coIdPub;
        this.extServiceId = extServiceId;
        this.extServiceIdPub = extServiceIdPub;
        this.profileId = profileId;
        this.sncode = sncode;
        this.sncodePub = sncodePub;
        this.spcode = spcode;
        this.spcodePub = spcodePub;
    }


    /**
     * Gets the coId value for this ContractServiceParametersReadBeanIn.
     * 
     * @return coId
     */
    public java.lang.Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this ContractServiceParametersReadBeanIn.
     * 
     * @param coId
     */
    public void setCoId(java.lang.Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the coIdPub value for this ContractServiceParametersReadBeanIn.
     * 
     * @return coIdPub
     */
    public java.lang.String getCoIdPub() {
        return coIdPub;
    }


    /**
     * Sets the coIdPub value for this ContractServiceParametersReadBeanIn.
     * 
     * @param coIdPub
     */
    public void setCoIdPub(java.lang.String coIdPub) {
        this.coIdPub = coIdPub;
    }


    /**
     * Gets the extServiceId value for this ContractServiceParametersReadBeanIn.
     * 
     * @return extServiceId
     */
    public java.lang.Long getExtServiceId() {
        return extServiceId;
    }


    /**
     * Sets the extServiceId value for this ContractServiceParametersReadBeanIn.
     * 
     * @param extServiceId
     */
    public void setExtServiceId(java.lang.Long extServiceId) {
        this.extServiceId = extServiceId;
    }


    /**
     * Gets the extServiceIdPub value for this ContractServiceParametersReadBeanIn.
     * 
     * @return extServiceIdPub
     */
    public java.lang.String getExtServiceIdPub() {
        return extServiceIdPub;
    }


    /**
     * Sets the extServiceIdPub value for this ContractServiceParametersReadBeanIn.
     * 
     * @param extServiceIdPub
     */
    public void setExtServiceIdPub(java.lang.String extServiceIdPub) {
        this.extServiceIdPub = extServiceIdPub;
    }


    /**
     * Gets the profileId value for this ContractServiceParametersReadBeanIn.
     * 
     * @return profileId
     */
    public java.lang.Long getProfileId() {
        return profileId;
    }


    /**
     * Sets the profileId value for this ContractServiceParametersReadBeanIn.
     * 
     * @param profileId
     */
    public void setProfileId(java.lang.Long profileId) {
        this.profileId = profileId;
    }


    /**
     * Gets the sncode value for this ContractServiceParametersReadBeanIn.
     * 
     * @return sncode
     */
    public java.lang.Long getSncode() {
        return sncode;
    }


    /**
     * Sets the sncode value for this ContractServiceParametersReadBeanIn.
     * 
     * @param sncode
     */
    public void setSncode(java.lang.Long sncode) {
        this.sncode = sncode;
    }


    /**
     * Gets the sncodePub value for this ContractServiceParametersReadBeanIn.
     * 
     * @return sncodePub
     */
    public java.lang.String getSncodePub() {
        return sncodePub;
    }


    /**
     * Sets the sncodePub value for this ContractServiceParametersReadBeanIn.
     * 
     * @param sncodePub
     */
    public void setSncodePub(java.lang.String sncodePub) {
        this.sncodePub = sncodePub;
    }


    /**
     * Gets the spcode value for this ContractServiceParametersReadBeanIn.
     * 
     * @return spcode
     */
    public java.lang.Long getSpcode() {
        return spcode;
    }


    /**
     * Sets the spcode value for this ContractServiceParametersReadBeanIn.
     * 
     * @param spcode
     */
    public void setSpcode(java.lang.Long spcode) {
        this.spcode = spcode;
    }


    /**
     * Gets the spcodePub value for this ContractServiceParametersReadBeanIn.
     * 
     * @return spcodePub
     */
    public java.lang.String getSpcodePub() {
        return spcodePub;
    }


    /**
     * Sets the spcodePub value for this ContractServiceParametersReadBeanIn.
     * 
     * @param spcodePub
     */
    public void setSpcodePub(java.lang.String spcodePub) {
        this.spcodePub = spcodePub;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractServiceParametersReadBeanIn)) return false;
        ContractServiceParametersReadBeanIn other = (ContractServiceParametersReadBeanIn) obj;
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
            ((this.extServiceId==null && other.getExtServiceId()==null) || 
             (this.extServiceId!=null &&
              this.extServiceId.equals(other.getExtServiceId()))) &&
            ((this.extServiceIdPub==null && other.getExtServiceIdPub()==null) || 
             (this.extServiceIdPub!=null &&
              this.extServiceIdPub.equals(other.getExtServiceIdPub()))) &&
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
        if (getExtServiceId() != null) {
            _hashCode += getExtServiceId().hashCode();
        }
        if (getExtServiceIdPub() != null) {
            _hashCode += getExtServiceIdPub().hashCode();
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
        new org.apache.axis.description.TypeDesc(ContractServiceParametersReadBeanIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractServiceParametersReadBeanIn"));
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
        elemField.setFieldName("extServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "extServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extServiceIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "extServiceIdPub"));
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
