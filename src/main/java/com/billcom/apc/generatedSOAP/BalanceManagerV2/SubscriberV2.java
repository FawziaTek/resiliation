
package com.billcom.apc.generatedSOAP.BalanceManagerV2;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SubscriberV2 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SubscriberV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="internationNumberPhone" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberV2", propOrder = {
    "internationNumberPhone"
})
public class SubscriberV2 implements Serializable {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long internationNumberPhone;

    /**
     * Obtient la valeur de la propriété internationNumberPhone.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInternationNumberPhone() {
        return internationNumberPhone;
    }

    /**
     * Définit la valeur de la propriété internationNumberPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInternationNumberPhone(Long value) {
        this.internationNumberPhone = value;
    }

}
