/**
 * BeanTax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class BeanTax  implements java.io.Serializable {
    private java.lang.String descriptionTax;

    private java.lang.String montantTaxe;

    private java.lang.String valeurTaxe;

    public BeanTax() {
    }

    public BeanTax(
           java.lang.String descriptionTax,
           java.lang.String montantTaxe,
           java.lang.String valeurTaxe) {
           this.descriptionTax = descriptionTax;
           this.montantTaxe = montantTaxe;
           this.valeurTaxe = valeurTaxe;
    }


    /**
     * Gets the descriptionTax value for this BeanTax.
     * 
     * @return descriptionTax
     */
    public java.lang.String getDescriptionTax() {
        return descriptionTax;
    }


    /**
     * Sets the descriptionTax value for this BeanTax.
     * 
     * @param descriptionTax
     */
    public void setDescriptionTax(java.lang.String descriptionTax) {
        this.descriptionTax = descriptionTax;
    }


    /**
     * Gets the montantTaxe value for this BeanTax.
     * 
     * @return montantTaxe
     */
    public java.lang.String getMontantTaxe() {
        return montantTaxe;
    }


    /**
     * Sets the montantTaxe value for this BeanTax.
     * 
     * @param montantTaxe
     */
    public void setMontantTaxe(java.lang.String montantTaxe) {
        this.montantTaxe = montantTaxe;
    }


    /**
     * Gets the valeurTaxe value for this BeanTax.
     * 
     * @return valeurTaxe
     */
    public java.lang.String getValeurTaxe() {
        return valeurTaxe;
    }


    /**
     * Sets the valeurTaxe value for this BeanTax.
     * 
     * @param valeurTaxe
     */
    public void setValeurTaxe(java.lang.String valeurTaxe) {
        this.valeurTaxe = valeurTaxe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BeanTax)) return false;
        BeanTax other = (BeanTax) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descriptionTax==null && other.getDescriptionTax()==null) || 
             (this.descriptionTax!=null &&
              this.descriptionTax.equals(other.getDescriptionTax()))) &&
            ((this.montantTaxe==null && other.getMontantTaxe()==null) || 
             (this.montantTaxe!=null &&
              this.montantTaxe.equals(other.getMontantTaxe()))) &&
            ((this.valeurTaxe==null && other.getValeurTaxe()==null) || 
             (this.valeurTaxe!=null &&
              this.valeurTaxe.equals(other.getValeurTaxe())));
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
        if (getDescriptionTax() != null) {
            _hashCode += getDescriptionTax().hashCode();
        }
        if (getMontantTaxe() != null) {
            _hashCode += getMontantTaxe().hashCode();
        }
        if (getValeurTaxe() != null) {
            _hashCode += getValeurTaxe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BeanTax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BeanTax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "descriptionTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montantTaxe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "montantTaxe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valeurTaxe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "valeurTaxe"));
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
