
package com.billcom.apc.generatedSOAP.BalanceManagerV2;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GetBalanceAndDateBeanInputV2 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetBalanceAndDateBeanInputV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceProviderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subscriber" type="{http://v2.manager.ws.lucent.alcatel.com}SubscriberV2"/&gt;
 *         &lt;element name="tmCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBalanceAndDateBeanInputV2", propOrder = {
    "sender",
    "serviceProviderName",
    "subscriber",
    "tmCode"
})
public class GetBalanceAndDateBeanInputV2 implements Serializable{

    @XmlElement(required = true, nillable = true)
    protected String sender;
    @XmlElement(required = true, nillable = true)
    protected String serviceProviderName;
    @XmlElement(required = true, nillable = true)
    protected SubscriberV2 subscriber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer tmCode;

    /**
     * Obtient la valeur de la propriété sender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Définit la valeur de la propriété sender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Obtient la valeur de la propriété serviceProviderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderName() {
        return serviceProviderName;
    }

    /**
     * Définit la valeur de la propriété serviceProviderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderName(String value) {
        this.serviceProviderName = value;
    }

    /**
     * Obtient la valeur de la propriété subscriber.
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
     * Définit la valeur de la propriété subscriber.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberV2 }
     *     
     */
    public void setSubscriber(SubscriberV2 value) {
        this.subscriber = value;
    }

    /**
     * Obtient la valeur de la propriété tmCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTmCode() {
        return tmCode;
    }

    /**
     * Définit la valeur de la propriété tmCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTmCode(Integer value) {
        this.tmCode = value;
    }

}
