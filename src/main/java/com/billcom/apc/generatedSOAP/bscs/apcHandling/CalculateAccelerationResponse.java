/**
 * CalculateAccelerationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;


public class CalculateAccelerationResponse  extends com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse  implements java.io.Serializable {
    private java.lang.Double actualForfait;

    private java.lang.String dateFin;

    private java.lang.Double montant;

    private java.lang.Integer nbMois;

    private java.lang.String remise;

    private java.lang.Double targetForfait;

    public CalculateAccelerationResponse() {
    }

    public CalculateAccelerationResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           java.lang.Double actualForfait,
           java.lang.String dateFin,
           java.lang.Double montant,
           java.lang.Integer nbMois,
           java.lang.String remise,
           java.lang.Double targetForfait) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.actualForfait = actualForfait;
        this.dateFin = dateFin;
        this.montant = montant;
        this.nbMois = nbMois;
        this.remise = remise;
        this.targetForfait = targetForfait;
    }


    /**
     * Gets the actualForfait value for this CalculateAccelerationResponse.
     * 
     * @return actualForfait
     */
    public java.lang.Double getActualForfait() {
        return actualForfait;
    }


    /**
     * Sets the actualForfait value for this CalculateAccelerationResponse.
     * 
     * @param actualForfait
     */
    public void setActualForfait(java.lang.Double actualForfait) {
        this.actualForfait = actualForfait;
    }


    /**
     * Gets the dateFin value for this CalculateAccelerationResponse.
     * 
     * @return dateFin
     */
    public java.lang.String getDateFin() {
        return dateFin;
    }


    /**
     * Sets the dateFin value for this CalculateAccelerationResponse.
     * 
     * @param dateFin
     */
    public void setDateFin(java.lang.String dateFin) {
        this.dateFin = dateFin;
    }


    /**
     * Gets the montant value for this CalculateAccelerationResponse.
     * 
     * @return montant
     */
    public java.lang.Double getMontant() {
        return montant;
    }


    /**
     * Sets the montant value for this CalculateAccelerationResponse.
     * 
     * @param montant
     */
    public void setMontant(java.lang.Double montant) {
        this.montant = montant;
    }


    /**
     * Gets the nbMois value for this CalculateAccelerationResponse.
     * 
     * @return nbMois
     */
    public java.lang.Integer getNbMois() {
        return nbMois;
    }


    /**
     * Sets the nbMois value for this CalculateAccelerationResponse.
     * 
     * @param nbMois
     */
    public void setNbMois(java.lang.Integer nbMois) {
        this.nbMois = nbMois;
    }


    /**
     * Gets the remise value for this CalculateAccelerationResponse.
     * 
     * @return remise
     */
    public java.lang.String getRemise() {
        return remise;
    }


    /**
     * Sets the remise value for this CalculateAccelerationResponse.
     * 
     * @param remise
     */
    public void setRemise(java.lang.String remise) {
        this.remise = remise;
    }


    /**
     * Gets the targetForfait value for this CalculateAccelerationResponse.
     * 
     * @return targetForfait
     */
    public java.lang.Double getTargetForfait() {
        return targetForfait;
    }


    /**
     * Sets the targetForfait value for this CalculateAccelerationResponse.
     * 
     * @param targetForfait
     */
    public void setTargetForfait(java.lang.Double targetForfait) {
        this.targetForfait = targetForfait;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalculateAccelerationResponse)) return false;
        CalculateAccelerationResponse other = (CalculateAccelerationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actualForfait==null && other.getActualForfait()==null) || 
             (this.actualForfait!=null &&
              this.actualForfait.equals(other.getActualForfait()))) &&
            ((this.dateFin==null && other.getDateFin()==null) || 
             (this.dateFin!=null &&
              this.dateFin.equals(other.getDateFin()))) &&
            ((this.montant==null && other.getMontant()==null) || 
             (this.montant!=null &&
              this.montant.equals(other.getMontant()))) &&
            ((this.nbMois==null && other.getNbMois()==null) || 
             (this.nbMois!=null &&
              this.nbMois.equals(other.getNbMois()))) &&
            ((this.remise==null && other.getRemise()==null) || 
             (this.remise!=null &&
              this.remise.equals(other.getRemise()))) &&
            ((this.targetForfait==null && other.getTargetForfait()==null) || 
             (this.targetForfait!=null &&
              this.targetForfait.equals(other.getTargetForfait())));
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
        if (getActualForfait() != null) {
            _hashCode += getActualForfait().hashCode();
        }
        if (getDateFin() != null) {
            _hashCode += getDateFin().hashCode();
        }
        if (getMontant() != null) {
            _hashCode += getMontant().hashCode();
        }
        if (getNbMois() != null) {
            _hashCode += getNbMois().hashCode();
        }
        if (getRemise() != null) {
            _hashCode += getRemise().hashCode();
        }
        if (getTargetForfait() != null) {
            _hashCode += getTargetForfait().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalculateAccelerationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualForfait");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "actualForfait"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "dateFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "montant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbMois");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "nbMois"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remise");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "remise"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetForfait");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "targetForfait"));
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
