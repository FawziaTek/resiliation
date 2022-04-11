/**
 * CalculateAccelerationForResiliationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class CalculateAccelerationForResiliationRequest  implements java.io.Serializable {
    private long[] coIdList;

    private java.lang.Long customerID;

    private java.util.Calendar dueDate;

    private java.lang.String motif;

    public CalculateAccelerationForResiliationRequest() {
    }

    public CalculateAccelerationForResiliationRequest(
           long[] coIdList,
           java.lang.Long customerID,
           java.util.Calendar dueDate,
           java.lang.String motif) {
           this.coIdList = coIdList;
           this.customerID = customerID;
           this.dueDate = dueDate;
           this.motif = motif;
    }


    /**
     * Gets the coIdList value for this CalculateAccelerationForResiliationRequest.
     * 
     * @return coIdList
     */
    public long[] getCoIdList() {
        return coIdList;
    }


    /**
     * Sets the coIdList value for this CalculateAccelerationForResiliationRequest.
     * 
     * @param coIdList
     */
    public void setCoIdList(long[] coIdList) {
        this.coIdList = coIdList;
    }


    /**
     * Gets the customerID value for this CalculateAccelerationForResiliationRequest.
     * 
     * @return customerID
     */
    public java.lang.Long getCustomerID() {
        return customerID;
    }


    /**
     * Sets the customerID value for this CalculateAccelerationForResiliationRequest.
     * 
     * @param customerID
     */
    public void setCustomerID(java.lang.Long customerID) {
        this.customerID = customerID;
    }


    /**
     * Gets the dueDate value for this CalculateAccelerationForResiliationRequest.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this CalculateAccelerationForResiliationRequest.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the motif value for this CalculateAccelerationForResiliationRequest.
     * 
     * @return motif
     */
    public java.lang.String getMotif() {
        return motif;
    }


    /**
     * Sets the motif value for this CalculateAccelerationForResiliationRequest.
     * 
     * @param motif
     */
    public void setMotif(java.lang.String motif) {
        this.motif = motif;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalculateAccelerationForResiliationRequest)) return false;
        CalculateAccelerationForResiliationRequest other = (CalculateAccelerationForResiliationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coIdList==null && other.getCoIdList()==null) || 
             (this.coIdList!=null &&
              java.util.Arrays.equals(this.coIdList, other.getCoIdList()))) &&
            ((this.customerID==null && other.getCustomerID()==null) || 
             (this.customerID!=null &&
              this.customerID.equals(other.getCustomerID()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.motif==null && other.getMotif()==null) || 
             (this.motif!=null &&
              this.motif.equals(other.getMotif())));
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
        if (getCoIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerID() != null) {
            _hashCode += getCustomerID().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getMotif() != null) {
            _hashCode += getMotif().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalculateAccelerationForResiliationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationForResiliationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "customerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motif");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "motif"));
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
