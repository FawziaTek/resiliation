/**
 * CustomerRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class CustomerRequestBean  implements java.io.Serializable {
    private java.lang.String caseCrm;

    private java.lang.String customerCode;

    private java.util.Calendar duDate;

    private java.lang.String erroreMessage;

    private java.lang.String motif;

    private java.lang.String motifClient;

    private int requestId;

    private java.lang.String status;

    private double totaleAmountToPaid;

    private java.lang.Double totaleAmountToPaidTax;

    public CustomerRequestBean() {
    }

    public CustomerRequestBean(
           java.lang.String caseCrm,
           java.lang.String customerCode,
           java.util.Calendar duDate,
           java.lang.String erroreMessage,
           java.lang.String motif,
           java.lang.String motifClient,
           int requestId,
           java.lang.String status,
           double totaleAmountToPaid,
           java.lang.Double totaleAmountToPaidTax) {
           this.caseCrm = caseCrm;
           this.customerCode = customerCode;
           this.duDate = duDate;
           this.erroreMessage = erroreMessage;
           this.motif = motif;
           this.motifClient = motifClient;
           this.requestId = requestId;
           this.status = status;
           this.totaleAmountToPaid = totaleAmountToPaid;
           this.totaleAmountToPaidTax = totaleAmountToPaidTax;
    }


    /**
     * Gets the caseCrm value for this CustomerRequestBean.
     * 
     * @return caseCrm
     */
    public java.lang.String getCaseCrm() {
        return caseCrm;
    }


    /**
     * Sets the caseCrm value for this CustomerRequestBean.
     * 
     * @param caseCrm
     */
    public void setCaseCrm(java.lang.String caseCrm) {
        this.caseCrm = caseCrm;
    }


    /**
     * Gets the customerCode value for this CustomerRequestBean.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this CustomerRequestBean.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the duDate value for this CustomerRequestBean.
     * 
     * @return duDate
     */
    public java.util.Calendar getDuDate() {
        return duDate;
    }


    /**
     * Sets the duDate value for this CustomerRequestBean.
     * 
     * @param duDate
     */
    public void setDuDate(java.util.Calendar duDate) {
        this.duDate = duDate;
    }


    /**
     * Gets the erroreMessage value for this CustomerRequestBean.
     * 
     * @return erroreMessage
     */
    public java.lang.String getErroreMessage() {
        return erroreMessage;
    }


    /**
     * Sets the erroreMessage value for this CustomerRequestBean.
     * 
     * @param erroreMessage
     */
    public void setErroreMessage(java.lang.String erroreMessage) {
        this.erroreMessage = erroreMessage;
    }


    /**
     * Gets the motif value for this CustomerRequestBean.
     * 
     * @return motif
     */
    public java.lang.String getMotif() {
        return motif;
    }


    /**
     * Sets the motif value for this CustomerRequestBean.
     * 
     * @param motif
     */
    public void setMotif(java.lang.String motif) {
        this.motif = motif;
    }


    /**
     * Gets the motifClient value for this CustomerRequestBean.
     * 
     * @return motifClient
     */
    public java.lang.String getMotifClient() {
        return motifClient;
    }


    /**
     * Sets the motifClient value for this CustomerRequestBean.
     * 
     * @param motifClient
     */
    public void setMotifClient(java.lang.String motifClient) {
        this.motifClient = motifClient;
    }


    /**
     * Gets the requestId value for this CustomerRequestBean.
     * 
     * @return requestId
     */
    public int getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this CustomerRequestBean.
     * 
     * @param requestId
     */
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the status value for this CustomerRequestBean.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CustomerRequestBean.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the totaleAmountToPaid value for this CustomerRequestBean.
     * 
     * @return totaleAmountToPaid
     */
    public double getTotaleAmountToPaid() {
        return totaleAmountToPaid;
    }


    /**
     * Sets the totaleAmountToPaid value for this CustomerRequestBean.
     * 
     * @param totaleAmountToPaid
     */
    public void setTotaleAmountToPaid(double totaleAmountToPaid) {
        this.totaleAmountToPaid = totaleAmountToPaid;
    }


    /**
     * Gets the totaleAmountToPaidTax value for this CustomerRequestBean.
     * 
     * @return totaleAmountToPaidTax
     */
    public java.lang.Double getTotaleAmountToPaidTax() {
        return totaleAmountToPaidTax;
    }


    /**
     * Sets the totaleAmountToPaidTax value for this CustomerRequestBean.
     * 
     * @param totaleAmountToPaidTax
     */
    public void setTotaleAmountToPaidTax(java.lang.Double totaleAmountToPaidTax) {
        this.totaleAmountToPaidTax = totaleAmountToPaidTax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerRequestBean)) return false;
        CustomerRequestBean other = (CustomerRequestBean) obj;
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
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode()))) &&
            ((this.duDate==null && other.getDuDate()==null) || 
             (this.duDate!=null &&
              this.duDate.equals(other.getDuDate()))) &&
            ((this.erroreMessage==null && other.getErroreMessage()==null) || 
             (this.erroreMessage!=null &&
              this.erroreMessage.equals(other.getErroreMessage()))) &&
            ((this.motif==null && other.getMotif()==null) || 
             (this.motif!=null &&
              this.motif.equals(other.getMotif()))) &&
            ((this.motifClient==null && other.getMotifClient()==null) || 
             (this.motifClient!=null &&
              this.motifClient.equals(other.getMotifClient()))) &&
            this.requestId == other.getRequestId() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.totaleAmountToPaid == other.getTotaleAmountToPaid() &&
            ((this.totaleAmountToPaidTax==null && other.getTotaleAmountToPaidTax()==null) || 
             (this.totaleAmountToPaidTax!=null &&
              this.totaleAmountToPaidTax.equals(other.getTotaleAmountToPaidTax())));
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
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getDuDate() != null) {
            _hashCode += getDuDate().hashCode();
        }
        if (getErroreMessage() != null) {
            _hashCode += getErroreMessage().hashCode();
        }
        if (getMotif() != null) {
            _hashCode += getMotif().hashCode();
        }
        if (getMotifClient() != null) {
            _hashCode += getMotifClient().hashCode();
        }
        _hashCode += getRequestId();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += new Double(getTotaleAmountToPaid()).hashCode();
        if (getTotaleAmountToPaidTax() != null) {
            _hashCode += getTotaleAmountToPaidTax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCrm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "caseCrm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "customerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "duDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erroreMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "erroreMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleAmountToPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "totaleAmountToPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleAmountToPaidTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "totaleAmountToPaidTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
