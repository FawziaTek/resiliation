
package com.billcom.apc.generatedSOAP.BalanceManagerV2;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GetBalanceAndDateBeanOutputV2 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetBalanceAndDateBeanOutputV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amountMainBalance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="operationResponse" type="{http://v2.manager.ws.lucent.alcatel.com}OperationResponseV2"/&gt;
 *         &lt;element name="options" type="{http://v2.manager.ws.lucent.alcatel.com}ArrayOfOptionV2"/&gt;
 *         &lt;element name="subscriber" type="{http://v2.manager.ws.lucent.alcatel.com}SubscriberV2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBalanceAndDateBeanOutputV2", propOrder = {
    "amountMainBalance",
    "description",
    "operationResponse",
    "options",
    "subscriber"
})
public class GetBalanceAndDateBeanOutputV2 implements Serializable{

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long amountMainBalance;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected OperationResponseV2 operationResponse;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfOptionV2 options;
    @XmlElement(required = true, nillable = true)
    protected SubscriberV2 subscriber;

    /**
     * Obtient la valeur de la propri�t� amountMainBalance.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmountMainBalance() {
        return amountMainBalance;
    }

    /**
     * D�finit la valeur de la propri�t� amountMainBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmountMainBalance(Long value) {
        this.amountMainBalance = value;
    }

    /**
     * Obtient la valeur de la propri�t� description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * D�finit la valeur de la propri�t� description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propri�t� operationResponse.
     * 
     * @return
     *     possible object is
     *     {@link OperationResponseV2 }
     *     
     */
    public OperationResponseV2 getOperationResponse() {
        return operationResponse;
    }

    /**
     * D�finit la valeur de la propri�t� operationResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResponseV2 }
     *     
     */
    public void setOperationResponse(OperationResponseV2 value) {
        this.operationResponse = value;
    }

    /**
     * Obtient la valeur de la propri�t� options.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOptionV2 }
     *     
     */
    public ArrayOfOptionV2 getOptions() {
        return options;
    }

    /**
     * D�finit la valeur de la propri�t� options.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOptionV2 }
     *     
     */
    public void setOptions(ArrayOfOptionV2 value) {
        this.options = value;
    }

    /**
     * Obtient la valeur de la propri�t� subscriber.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberV2 }
     *     
     */
    public SubscriberV2 getSubscriber() {
        return subscriber;
    }

    /**
     * D�finit la valeur de la propri�t� subscriber.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberV2 }
     *     
     */
    public void setSubscriber(SubscriberV2 value) {
        this.subscriber = value;
    }

}
