
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ResultResiliationBean complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ResultResiliationBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contracts" type="{http://alu.services.ws.lhs.com}ArrayOfContractBean"/&gt;
 *         &lt;element name="elig" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultResiliationBean", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "contracts",
    "elig"
})
public class ResultResiliationBean {

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected ArrayOfContractBean contracts;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com")
    protected boolean elig;

    /**
     * Obtient la valeur de la propriété contracts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContractBean }
     *     
     */
    public ArrayOfContractBean getContracts() {
        return contracts;
    }

    /**
     * Définit la valeur de la propriété contracts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContractBean }
     *     
     */
    public void setContracts(ArrayOfContractBean value) {
        this.contracts = value;
    }

    /**
     * Obtient la valeur de la propriété elig.
     * 
     */
    public boolean isElig() {
        return elig;
    }

    /**
     * Définit la valeur de la propriété elig.
     * 
     */
    public void setElig(boolean value) {
        this.elig = value;
    }

}
