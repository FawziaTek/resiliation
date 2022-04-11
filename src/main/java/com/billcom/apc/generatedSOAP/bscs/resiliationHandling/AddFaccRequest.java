/**
 * AddFaccRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class AddFaccRequest  implements java.io.Serializable {
    private java.lang.String caseCrm;

    private java.lang.Long customerID;

    private java.util.Calendar dueDate;

    private java.lang.String motif;

    private java.lang.String motifClient;

    public AddFaccRequest() {
    }

    public AddFaccRequest(
           java.lang.String caseCrm,
           java.lang.Long customerID,
           java.util.Calendar dueDate,
           java.lang.String motif,
           java.lang.String motifClient) {
           this.caseCrm = caseCrm;
           this.customerID = customerID;
           this.dueDate = dueDate;
           this.motif = motif;
           this.motifClient = motifClient;
    }


    /**
     * Gets the caseCrm value for this AddFaccRequest.
     * 
     * @return caseCrm
     */
    public java.lang.String getCaseCrm() {
        return caseCrm;
    }


    /**
     * Sets the caseCrm value for this AddFaccRequest.
     * 
     * @param caseCrm
     */
    public void setCaseCrm(java.lang.String caseCrm) {
        this.caseCrm = caseCrm;
    }


    /**
     * Gets the customerID value for this AddFaccRequest.
     * 
     * @return customerID
     */
    public java.lang.Long getCustomerID() {
        return customerID;
    }


    /**
     * Sets the customerID value for this AddFaccRequest.
     * 
     * @param customerID
     */
    public void setCustomerID(java.lang.Long customerID) {
        this.customerID = customerID;
    }


    /**
     * Gets the dueDate value for this AddFaccRequest.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this AddFaccRequest.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the motif value for this AddFaccRequest.
     * 
     * @return motif
     */
    public java.lang.String getMotif() {
        return motif;
    }


    /**
     * Sets the motif value for this AddFaccRequest.
     * 
     * @param motif
     */
    public void setMotif(java.lang.String motif) {
        this.motif = motif;
    }


    /**
     * Gets the motifClient value for this AddFaccRequest.
     * 
     * @return motifClient
     */
    public java.lang.String getMotifClient() {
        return motifClient;
    }


    /**
     * Sets the motifClient value for this AddFaccRequest.
     * 
     * @param motifClient
     */
    public void setMotifClient(java.lang.String motifClient) {
        this.motifClient = motifClient;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddFaccRequest)) return false;
        AddFaccRequest other = (AddFaccRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseCrm==null && other.getCaseCrm()==null) || 
             (this.caseCrm!=null &&
              this.caseCrm.equals(other.getCaseCrm()))) &&
            ((this.customerID==null && other.getCustomerID()==null) || 
             (this.customerID!=null &&
              this.customerID.equals(other.getCustomerID()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.motif==null && other.getMotif()==null) || 
             (this.motif!=null &&
              this.motif.equals(other.getMotif()))) &&
            ((this.motifClient==null && other.getMotifClient()==null) || 
             (this.motifClient!=null &&
              this.motifClient.equals(other.getMotifClient())));
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
        if (getCaseCrm() != null) {
            _hashCode += getCaseCrm().hashCode();
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
        if (getMotifClient() != null) {
            _hashCode += getMotifClient().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddFaccRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddFaccRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCrm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "caseCrm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motifClient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "motifClient"));
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
