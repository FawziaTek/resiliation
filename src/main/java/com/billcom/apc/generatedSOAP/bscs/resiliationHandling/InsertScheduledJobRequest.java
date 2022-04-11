/**
 * InsertScheduledJobRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class InsertScheduledJobRequest  implements java.io.Serializable {
    private java.lang.Long coId;

    private java.lang.Long csId;

    private java.util.Calendar dateExecution;

    private java.lang.Long jobTypeId;

    private java.lang.String remarque;

    public InsertScheduledJobRequest() {
    }

    public InsertScheduledJobRequest(
           java.lang.Long coId,
           java.lang.Long csId,
           java.util.Calendar dateExecution,
           java.lang.Long jobTypeId,
           java.lang.String remarque) {
           this.coId = coId;
           this.csId = csId;
           this.dateExecution = dateExecution;
           this.jobTypeId = jobTypeId;
           this.remarque = remarque;
    }


    /**
     * Gets the coId value for this InsertScheduledJobRequest.
     * 
     * @return coId
     */
    public java.lang.Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this InsertScheduledJobRequest.
     * 
     * @param coId
     */
    public void setCoId(java.lang.Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the csId value for this InsertScheduledJobRequest.
     * 
     * @return csId
     */
    public java.lang.Long getCsId() {
        return csId;
    }


    /**
     * Sets the csId value for this InsertScheduledJobRequest.
     * 
     * @param csId
     */
    public void setCsId(java.lang.Long csId) {
        this.csId = csId;
    }


    /**
     * Gets the dateExecution value for this InsertScheduledJobRequest.
     * 
     * @return dateExecution
     */
    public java.util.Calendar getDateExecution() {
        return dateExecution;
    }


    /**
     * Sets the dateExecution value for this InsertScheduledJobRequest.
     * 
     * @param dateExecution
     */
    public void setDateExecution(java.util.Calendar dateExecution) {
        this.dateExecution = dateExecution;
    }


    /**
     * Gets the jobTypeId value for this InsertScheduledJobRequest.
     * 
     * @return jobTypeId
     */
    public java.lang.Long getJobTypeId() {
        return jobTypeId;
    }


    /**
     * Sets the jobTypeId value for this InsertScheduledJobRequest.
     * 
     * @param jobTypeId
     */
    public void setJobTypeId(java.lang.Long jobTypeId) {
        this.jobTypeId = jobTypeId;
    }


    /**
     * Gets the remarque value for this InsertScheduledJobRequest.
     * 
     * @return remarque
     */
    public java.lang.String getRemarque() {
        return remarque;
    }


    /**
     * Sets the remarque value for this InsertScheduledJobRequest.
     * 
     * @param remarque
     */
    public void setRemarque(java.lang.String remarque) {
        this.remarque = remarque;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertScheduledJobRequest)) return false;
        InsertScheduledJobRequest other = (InsertScheduledJobRequest) obj;
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
            ((this.csId==null && other.getCsId()==null) || 
             (this.csId!=null &&
              this.csId.equals(other.getCsId()))) &&
            ((this.dateExecution==null && other.getDateExecution()==null) || 
             (this.dateExecution!=null &&
              this.dateExecution.equals(other.getDateExecution()))) &&
            ((this.jobTypeId==null && other.getJobTypeId()==null) || 
             (this.jobTypeId!=null &&
              this.jobTypeId.equals(other.getJobTypeId()))) &&
            ((this.remarque==null && other.getRemarque()==null) || 
             (this.remarque!=null &&
              this.remarque.equals(other.getRemarque())));
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
        if (getCsId() != null) {
            _hashCode += getCsId().hashCode();
        }
        if (getDateExecution() != null) {
            _hashCode += getDateExecution().hashCode();
        }
        if (getJobTypeId() != null) {
            _hashCode += getJobTypeId().hashCode();
        }
        if (getRemarque() != null) {
            _hashCode += getRemarque().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertScheduledJobRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InsertScheduledJobRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateExecution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "dateExecution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "jobTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarque");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "remarque"));
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
