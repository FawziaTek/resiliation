/**
 * GetCustomerRequestDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class GetCustomerRequestDetailsResponse  extends com.billcom.apc.generatedSOAP.bscs.resiliationHandling.OperationResponse  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CustomerRequestBean[] customerRequestBean;

    public GetCustomerRequestDetailsResponse() {
    }

    public GetCustomerRequestDetailsResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CustomerRequestBean[] customerRequestBean) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.customerRequestBean = customerRequestBean;
    }


    /**
     * Gets the customerRequestBean value for this GetCustomerRequestDetailsResponse.
     * 
     * @return customerRequestBean
     */
    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CustomerRequestBean[] getCustomerRequestBean() {
        return customerRequestBean;
    }


    /**
     * Sets the customerRequestBean value for this GetCustomerRequestDetailsResponse.
     * 
     * @param customerRequestBean
     */
    public void setCustomerRequestBean(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CustomerRequestBean[] customerRequestBean) {
        this.customerRequestBean = customerRequestBean;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCustomerRequestDetailsResponse)) return false;
        GetCustomerRequestDetailsResponse other = (GetCustomerRequestDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customerRequestBean==null && other.getCustomerRequestBean()==null) || 
             (this.customerRequestBean!=null &&
              java.util.Arrays.equals(this.customerRequestBean, other.getCustomerRequestBean())));
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
        if (getCustomerRequestBean() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerRequestBean());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerRequestBean(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCustomerRequestDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerRequestDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerRequestBean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "customerRequestBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerRequestBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
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
