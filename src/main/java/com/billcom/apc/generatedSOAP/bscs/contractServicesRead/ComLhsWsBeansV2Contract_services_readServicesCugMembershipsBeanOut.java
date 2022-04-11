/**
 * ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractServicesRead;

public class ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut  extends com.billcom.apc.generatedSOAP.bscs.contractServicesRead.BaseSOIBean  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut[] basicservicegroupassigments;

    private java.lang.Long cugId;

    private java.lang.Long cugIndex;

    private java.lang.String cugInterlockCode;

    private java.lang.String cugName;

    private java.lang.Integer cugPendingStatus;

    public ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut() {
    }

    public ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut(
           com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut[] basicservicegroupassigments,
           java.lang.Long cugId,
           java.lang.Long cugIndex,
           java.lang.String cugInterlockCode,
           java.lang.String cugName,
           java.lang.Integer cugPendingStatus) {
        this.basicservicegroupassigments = basicservicegroupassigments;
        this.cugId = cugId;
        this.cugIndex = cugIndex;
        this.cugInterlockCode = cugInterlockCode;
        this.cugName = cugName;
        this.cugPendingStatus = cugPendingStatus;
    }


    /**
     * Gets the basicservicegroupassigments value for this ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.
     * 
     * @return basicservicegroupassigments
     */
    public com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut[] getBasicservicegroupassigments() {
        return basicservicegroupassigments;
    }


    /**
     * Sets the basicservicegroupassigments value for this ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.
     * 
     * @param basicservicegroupassigments
     */
    public void setBasicservicegroupassigments(com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut[] basicservicegroupassigments) {
        this.basicservicegroupassigments = basicservicegroupassigments;
    }


    /**
     * Gets the cugId value for this ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.
     * 
     * @return cugId
     */
    public java.lang.Long getCugId() {
        return cugId;
    }


    /**
     * Sets the cugId value for this ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.
     * 
     * @param cugId
     */
    public void setCugId(java.lang.Long cugId) {
        this.cugId = cugId;
    }


    /**
     * Gets the cugIndex value for this ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.
     * 
     * @return cugIndex
     */
    public java.lang.Long getCugIndex() {
        return cugIndex;
    }


    /**
     * Sets the cugIndex value for this ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.
     * 
     * @param cugIndex
     */
    public void setCugIndex(java.lang.Long cugIndex) {
        this.cugIndex = cugIndex;
    }


    /**
     * Gets the cugInterlockCode value for this ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.
     * 
     * @return cugInterlockCode
     */
    public java.lang.String getCugInterlockCode() {
        return cugInterlockCode;
    }


    /**
     * Sets the cugInterlockCode value for this ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.
     * 
     * @param cugInterlockCode
     */
    public void setCugInterlockCode(java.lang.String cugInterlockCode) {
        this.cugInterlockCode = cugInterlockCode;
    }


    /**
     * Gets the cugName value for this ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.
     * 
     * @return cugName
     */
    public java.lang.String getCugName() {
        return cugName;
    }


    /**
     * Sets the cugName value for this ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.
     * 
     * @param cugName
     */
    public void setCugName(java.lang.String cugName) {
        this.cugName = cugName;
    }


    /**
     * Gets the cugPendingStatus value for this ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.
     * 
     * @return cugPendingStatus
     */
    public java.lang.Integer getCugPendingStatus() {
        return cugPendingStatus;
    }


    /**
     * Sets the cugPendingStatus value for this ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.
     * 
     * @param cugPendingStatus
     */
    public void setCugPendingStatus(java.lang.Integer cugPendingStatus) {
        this.cugPendingStatus = cugPendingStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut)) return false;
        ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut other = (ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basicservicegroupassigments==null && other.getBasicservicegroupassigments()==null) || 
             (this.basicservicegroupassigments!=null &&
              java.util.Arrays.equals(this.basicservicegroupassigments, other.getBasicservicegroupassigments()))) &&
            ((this.cugId==null && other.getCugId()==null) || 
             (this.cugId!=null &&
              this.cugId.equals(other.getCugId()))) &&
            ((this.cugIndex==null && other.getCugIndex()==null) || 
             (this.cugIndex!=null &&
              this.cugIndex.equals(other.getCugIndex()))) &&
            ((this.cugInterlockCode==null && other.getCugInterlockCode()==null) || 
             (this.cugInterlockCode!=null &&
              this.cugInterlockCode.equals(other.getCugInterlockCode()))) &&
            ((this.cugName==null && other.getCugName()==null) || 
             (this.cugName!=null &&
              this.cugName.equals(other.getCugName()))) &&
            ((this.cugPendingStatus==null && other.getCugPendingStatus()==null) || 
             (this.cugPendingStatus!=null &&
              this.cugPendingStatus.equals(other.getCugPendingStatus())));
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
        if (getBasicservicegroupassigments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBasicservicegroupassigments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBasicservicegroupassigments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCugId() != null) {
            _hashCode += getCugId().hashCode();
        }
        if (getCugIndex() != null) {
            _hashCode += getCugIndex().hashCode();
        }
        if (getCugInterlockCode() != null) {
            _hashCode += getCugInterlockCode().hashCode();
        }
        if (getCugName() != null) {
            _hashCode += getCugName().hashCode();
        }
        if (getCugPendingStatus() != null) {
            _hashCode += getCugPendingStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComLhsWsBeansV2Contract_services_readServicesCugMembershipsBeanOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_services_read.services.CugMembershipsBeanOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicservicegroupassigments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "basicservicegroupassigments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_services_read.services.cug_memberships.BasicservicegroupassigmentsBeanOut"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "cugId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "cugIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugInterlockCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "cugInterlockCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "cugName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugPendingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "cugPendingStatus"));
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
