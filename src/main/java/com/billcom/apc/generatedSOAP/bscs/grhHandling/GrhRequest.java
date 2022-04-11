/**
 * GrhRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.grhHandling;

public class GrhRequest  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentPackageElement[] commitmentPackageElement;

    private com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentRequest commitmentRequest;

    private com.billcom.apc.generatedSOAP.bscs.grhHandling.RequestAll requestAll;

    public GrhRequest() {
    }

    public GrhRequest(
           com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentPackageElement[] commitmentPackageElement,
           com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentRequest commitmentRequest,
           com.billcom.apc.generatedSOAP.bscs.grhHandling.RequestAll requestAll) {
           this.commitmentPackageElement = commitmentPackageElement;
           this.commitmentRequest = commitmentRequest;
           this.requestAll = requestAll;
    }


    /**
     * Gets the commitmentPackageElement value for this GrhRequest.
     * 
     * @return commitmentPackageElement
     */
    public com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentPackageElement[] getCommitmentPackageElement() {
        return commitmentPackageElement;
    }


    /**
     * Sets the commitmentPackageElement value for this GrhRequest.
     * 
     * @param commitmentPackageElement
     */
    public void setCommitmentPackageElement(com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentPackageElement[] commitmentPackageElement) {
        this.commitmentPackageElement = commitmentPackageElement;
    }


    /**
     * Gets the commitmentRequest value for this GrhRequest.
     * 
     * @return commitmentRequest
     */
    public com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentRequest getCommitmentRequest() {
        return commitmentRequest;
    }


    /**
     * Sets the commitmentRequest value for this GrhRequest.
     * 
     * @param commitmentRequest
     */
    public void setCommitmentRequest(com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentRequest commitmentRequest) {
        this.commitmentRequest = commitmentRequest;
    }


    /**
     * Gets the requestAll value for this GrhRequest.
     * 
     * @return requestAll
     */
    public com.billcom.apc.generatedSOAP.bscs.grhHandling.RequestAll getRequestAll() {
        return requestAll;
    }


    /**
     * Sets the requestAll value for this GrhRequest.
     * 
     * @param requestAll
     */
    public void setRequestAll(com.billcom.apc.generatedSOAP.bscs.grhHandling.RequestAll requestAll) {
        this.requestAll = requestAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GrhRequest)) return false;
        GrhRequest other = (GrhRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commitmentPackageElement==null && other.getCommitmentPackageElement()==null) || 
             (this.commitmentPackageElement!=null &&
              java.util.Arrays.equals(this.commitmentPackageElement, other.getCommitmentPackageElement()))) &&
            ((this.commitmentRequest==null && other.getCommitmentRequest()==null) || 
             (this.commitmentRequest!=null &&
              this.commitmentRequest.equals(other.getCommitmentRequest()))) &&
            ((this.requestAll==null && other.getRequestAll()==null) || 
             (this.requestAll!=null &&
              this.requestAll.equals(other.getRequestAll())));
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
        if (getCommitmentPackageElement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommitmentPackageElement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommitmentPackageElement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommitmentRequest() != null) {
            _hashCode += getCommitmentRequest().hashCode();
        }
        if (getRequestAll() != null) {
            _hashCode += getRequestAll().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GrhRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GrhRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitmentPackageElement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "commitmentPackageElement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CommitmentPackageElement"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitmentRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "commitmentRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CommitmentRequest"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestAll");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "requestAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "RequestAll"));
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
