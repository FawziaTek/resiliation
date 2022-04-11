/**
 * OrderResiliationHumainTasksResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.ws;

public class OrderResiliationHumainTasksResponse  implements java.io.Serializable {
    private com.billcom.ws.ResiliationHumainTaskBean[] beans;

    private com.billcom.ws.ResiliationOperationResponse response;

    public OrderResiliationHumainTasksResponse() {
    }

    public OrderResiliationHumainTasksResponse(
           com.billcom.ws.ResiliationHumainTaskBean[] beans,
           com.billcom.ws.ResiliationOperationResponse response) {
           this.beans = beans;
           this.response = response;
    }


    /**
     * Gets the beans value for this OrderResiliationHumainTasksResponse.
     * 
     * @return beans
     */
    public com.billcom.ws.ResiliationHumainTaskBean[] getBeans() {
        return beans;
    }


    /**
     * Sets the beans value for this OrderResiliationHumainTasksResponse.
     * 
     * @param beans
     */
    public void setBeans(com.billcom.ws.ResiliationHumainTaskBean[] beans) {
        this.beans = beans;
    }

    public com.billcom.ws.ResiliationHumainTaskBean getBeans(int i) {
        return this.beans[i];
    }

    public void setBeans(int i, com.billcom.ws.ResiliationHumainTaskBean _value) {
        this.beans[i] = _value;
    }


    /**
     * Gets the response value for this OrderResiliationHumainTasksResponse.
     * 
     * @return response
     */
    public com.billcom.ws.ResiliationOperationResponse getResponse() {
        return response;
    }


    /**
     * Sets the response value for this OrderResiliationHumainTasksResponse.
     * 
     * @param response
     */
    public void setResponse(com.billcom.ws.ResiliationOperationResponse response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderResiliationHumainTasksResponse)) return false;
        OrderResiliationHumainTasksResponse other = (OrderResiliationHumainTasksResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.beans==null && other.getBeans()==null) || 
             (this.beans!=null &&
              java.util.Arrays.equals(this.beans, other.getBeans()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
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
        if (getBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderResiliationHumainTasksResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.billcom.com/", "orderResiliationHumainTasksResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.billcom.com/", "resiliationHumainTaskBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.billcom.com/", "resiliationOperationResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
