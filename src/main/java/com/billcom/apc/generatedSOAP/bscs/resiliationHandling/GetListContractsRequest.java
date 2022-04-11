/**
 * GetListContractsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class GetListContractsRequest  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractIdentificationBean contractIdentification;

    private java.lang.Long customerId;

    private java.util.Calendar dateFinEngDebut;

    private java.util.Calendar dateFinEngFin;

    private java.lang.Boolean isTotale;

    public GetListContractsRequest() {
    }

    public GetListContractsRequest(
           com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractIdentificationBean contractIdentification,
           java.lang.Long customerId,
           java.util.Calendar dateFinEngDebut,
           java.util.Calendar dateFinEngFin,
           java.lang.Boolean isTotale) {
           this.contractIdentification = contractIdentification;
           this.customerId = customerId;
           this.dateFinEngDebut = dateFinEngDebut;
           this.dateFinEngFin = dateFinEngFin;
           this.isTotale = isTotale;
    }


    /**
     * Gets the contractIdentification value for this GetListContractsRequest.
     * 
     * @return contractIdentification
     */
    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractIdentificationBean getContractIdentification() {
        return contractIdentification;
    }


    /**
     * Sets the contractIdentification value for this GetListContractsRequest.
     * 
     * @param contractIdentification
     */
    public void setContractIdentification(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractIdentificationBean contractIdentification) {
        this.contractIdentification = contractIdentification;
    }


    /**
     * Gets the customerId value for this GetListContractsRequest.
     * 
     * @return customerId
     */
    public java.lang.Long getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this GetListContractsRequest.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.Long customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the dateFinEngDebut value for this GetListContractsRequest.
     * 
     * @return dateFinEngDebut
     */
    public java.util.Calendar getDateFinEngDebut() {
        return dateFinEngDebut;
    }


    /**
     * Sets the dateFinEngDebut value for this GetListContractsRequest.
     * 
     * @param dateFinEngDebut
     */
    public void setDateFinEngDebut(java.util.Calendar dateFinEngDebut) {
        this.dateFinEngDebut = dateFinEngDebut;
    }


    /**
     * Gets the dateFinEngFin value for this GetListContractsRequest.
     * 
     * @return dateFinEngFin
     */
    public java.util.Calendar getDateFinEngFin() {
        return dateFinEngFin;
    }


    /**
     * Sets the dateFinEngFin value for this GetListContractsRequest.
     * 
     * @param dateFinEngFin
     */
    public void setDateFinEngFin(java.util.Calendar dateFinEngFin) {
        this.dateFinEngFin = dateFinEngFin;
    }


    /**
     * Gets the isTotale value for this GetListContractsRequest.
     * 
     * @return isTotale
     */
    public java.lang.Boolean getIsTotale() {
        return isTotale;
    }


    /**
     * Sets the isTotale value for this GetListContractsRequest.
     * 
     * @param isTotale
     */
    public void setIsTotale(java.lang.Boolean isTotale) {
        this.isTotale = isTotale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetListContractsRequest)) return false;
        GetListContractsRequest other = (GetListContractsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contractIdentification==null && other.getContractIdentification()==null) || 
             (this.contractIdentification!=null &&
              this.contractIdentification.equals(other.getContractIdentification()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.dateFinEngDebut==null && other.getDateFinEngDebut()==null) || 
             (this.dateFinEngDebut!=null &&
              this.dateFinEngDebut.equals(other.getDateFinEngDebut()))) &&
            ((this.dateFinEngFin==null && other.getDateFinEngFin()==null) || 
             (this.dateFinEngFin!=null &&
              this.dateFinEngFin.equals(other.getDateFinEngFin()))) &&
            ((this.isTotale==null && other.getIsTotale()==null) || 
             (this.isTotale!=null &&
              this.isTotale.equals(other.getIsTotale())));
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
        if (getContractIdentification() != null) {
            _hashCode += getContractIdentification().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getDateFinEngDebut() != null) {
            _hashCode += getDateFinEngDebut().hashCode();
        }
        if (getDateFinEngFin() != null) {
            _hashCode += getDateFinEngFin().hashCode();
        }
        if (getIsTotale() != null) {
            _hashCode += getIsTotale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetListContractsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetListContractsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contractIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractIdentificationBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFinEngDebut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "dateFinEngDebut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFinEngFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "dateFinEngFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTotale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "isTotale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
