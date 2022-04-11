
package com.billcom.apc.generatedSOAP.BalanceManagerV2;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RefillMainBalanceBeanInputV2 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RefillMainBalanceBeanInputV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="scratchCard" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "RefillMainBalanceBeanInputV2", propOrder = {
    "amount",
    "scratchCard",
    "subscriber"
})
public class RefillMainBalanceBeanInputV2 implements Serializable{

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long amount;
    @XmlElement(required = true, nillable = true)
    protected String scratchCard;
    @XmlElement(required = true, nillable = true)
    protected SubscriberV2 subscriber;

    /**
     * Obtient la valeur de la propriété amount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Définit la valeur de la propriété amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Obtient la valeur de la propriété scratchCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScratchCard() {
        return scratchCard;
    }

    /**
     * Définit la valeur de la propriété scratchCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScratchCard(String value) {
        this.scratchCard = value;
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

}
