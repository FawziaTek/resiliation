
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour setContractOrderIdRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="setContractOrderIdRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractOrderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="task" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setContractOrderIdRequest", propOrder = {
    "coId",
    "contractOrderId",
    "task"
})
public class SetContractOrderIdRequest {

    protected String coId;
    protected Integer contractOrderId;
    protected String task;

    /**
     * Obtient la valeur de la propriété coId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoId() {
        return coId;
    }

    /**
     * Définit la valeur de la propriété coId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoId(String value) {
        this.coId = value;
    }

    /**
     * Obtient la valeur de la propriété contractOrderId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractOrderId() {
        return contractOrderId;
    }

    /**
     * Définit la valeur de la propriété contractOrderId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractOrderId(Integer value) {
        this.contractOrderId = value;
    }

    /**
     * Obtient la valeur de la propriété task.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTask() {
        return task;
    }

    /**
     * Définit la valeur de la propriété task.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTask(String value) {
        this.task = value;
    }

}
