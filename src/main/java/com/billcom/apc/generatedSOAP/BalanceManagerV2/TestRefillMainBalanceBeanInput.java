
package com.billcom.apc.generatedSOAP.BalanceManagerV2;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TestRefillMainBalanceBeanInput complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TestRefillMainBalanceBeanInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "TestRefillMainBalanceBeanInput", propOrder = {
    "subscriber",
    "tmCode"
})
public class TestRefillMainBalanceBeanInput implements Serializable{

    @XmlElement(required = true, nillable = true)
    protected SubscriberV2 subscriber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer tmCode;

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
