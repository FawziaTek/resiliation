/**
 * GetCalculatedFaccTotaleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class GetCalculatedFaccTotaleResponse  extends com.billcom.apc.generatedSOAP.bscs.resiliationHandling.OperationResponse  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.resiliationHandling.FraisAcc[] bean;

    private java.lang.Double montantTotal;

    private java.lang.Double montantTotalTax;

    public GetCalculatedFaccTotaleResponse() {
    }

    public GetCalculatedFaccTotaleResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           com.billcom.apc.generatedSOAP.bscs.resiliationHandling.FraisAcc[] bean,
           java.lang.Double montantTotal,
           java.lang.Double montantTotalTax) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.bean = bean;
        this.montantTotal = montantTotal;
        this.montantTotalTax = montantTotalTax;
    }


    /**
     * Gets the bean value for this GetCalculatedFaccTotaleResponse.
     * 
     * @return bean
     */
    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.FraisAcc[] getBean() {
        return bean;
    }


    /**
     * Sets the bean value for this GetCalculatedFaccTotaleResponse.
     * 
     * @param bean
     */
    public void setBean(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.FraisAcc[] bean) {
        this.bean = bean;
    }


    /**
     * Gets the montantTotal value for this GetCalculatedFaccTotaleResponse.
     * 
     * @return montantTotal
     */
    public java.lang.Double getMontantTotal() {
        return montantTotal;
    }


    /**
     * Sets the montantTotal value for this GetCalculatedFaccTotaleResponse.
     * 
     * @param montantTotal
     */
    public void setMontantTotal(java.lang.Double montantTotal) {
        this.montantTotal = montantTotal;
    }


    /**
     * Gets the montantTotalTax value for this GetCalculatedFaccTotaleResponse.
     * 
     * @return montantTotalTax
     */
    public java.lang.Double getMontantTotalTax() {
        return montantTotalTax;
    }


    /**
     * Sets the montantTotalTax value for this GetCalculatedFaccTotaleResponse.
     * 
     * @param montantTotalTax
     */
    public void setMontantTotalTax(java.lang.Double montantTotalTax) {
        this.montantTotalTax = montantTotalTax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCalculatedFaccTotaleResponse)) return false;
        GetCalculatedFaccTotaleResponse other = (GetCalculatedFaccTotaleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bean==null && other.getBean()==null) || 
             (this.bean!=null &&
              java.util.Arrays.equals(this.bean, other.getBean()))) &&
            ((this.montantTotal==null && other.getMontantTotal()==null) || 
             (this.montantTotal!=null &&
              this.montantTotal.equals(other.getMontantTotal()))) &&
            ((this.montantTotalTax==null && other.getMontantTotalTax()==null) || 
             (this.montantTotalTax!=null &&
              this.montantTotalTax.equals(other.getMontantTotalTax())));
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
        if (getBean() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBean());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBean(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMontantTotal() != null) {
            _hashCode += getMontantTotal().hashCode();
        }
        if (getMontantTotalTax() != null) {
            _hashCode += getMontantTotalTax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCalculatedFaccTotaleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCalculatedFaccTotaleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "bean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "FraisAcc"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montantTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "montantTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montantTotalTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "montantTotalTax"));
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
