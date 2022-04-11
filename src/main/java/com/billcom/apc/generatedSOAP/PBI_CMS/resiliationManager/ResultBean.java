
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour resultBean complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="resultBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contracts" type="{http://manager.ws.resiliation.billcom.com/}contractResiliationBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="remarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultBean", propOrder = {
    "contracts",
    "eligible",
    "remarque"
})
public class ResultBean {

    @XmlElement(nillable = true)
    protected List<ContractResiliationBean> contracts;
    protected boolean eligible;
    protected String remarque;

    /**
     * Gets the value of the contracts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contracts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContracts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractResiliationBean }
     * 
     * 
     */
    public List<ContractResiliationBean> getContracts() {
        if (contracts == null) {
            contracts = new ArrayList<ContractResiliationBean>();
        }
        return this.contracts;
    }

    /**
     * Obtient la valeur de la propriété eligible.
     * 
     */
    public boolean isEligible() {
        return eligible;
    }

    /**
     * Définit la valeur de la propriété eligible.
     * 
     */
    public void setEligible(boolean value) {
        this.eligible = value;
    }

    /**
     * Obtient la valeur de la propriété remarque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarque() {
        return remarque;
    }

    /**
     * Définit la valeur de la propriété remarque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarque(String value) {
        this.remarque = value;
    }

}
