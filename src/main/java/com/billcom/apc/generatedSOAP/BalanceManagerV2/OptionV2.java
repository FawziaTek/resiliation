
package com.billcom.apc.generatedSOAP.BalanceManagerV2;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OptionV2 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OptionV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="balances" type="{http://v2.manager.ws.lucent.alcatel.com}ArrayOfBalanceV2"/&gt;
 *         &lt;element name="optionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionV2", propOrder = {
    "balances",
    "optionName"
})
public class OptionV2 implements Serializable {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfBalanceV2 balances;
    @XmlElement(required = true, nillable = true)
    protected String optionName;

    /**
     * Obtient la valeur de la propriété balances.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBalanceV2 }
     *     
     */
    public ArrayOfBalanceV2 getBalances() {
        return balances;
    }

    /**
     * Définit la valeur de la propriété balances.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBalanceV2 }
     *     
     */
    public void setBalances(ArrayOfBalanceV2 value) {
        this.balances = value;
    }

    /**
     * Obtient la valeur de la propriété optionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * Définit la valeur de la propriété optionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionName(String value) {
        this.optionName = value;
    }

}
