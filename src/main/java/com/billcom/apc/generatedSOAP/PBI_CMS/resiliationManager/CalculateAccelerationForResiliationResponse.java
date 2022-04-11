
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CalculateAccelerationForResiliationResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CalculateAccelerationForResiliationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://alu.services.ws.lhs.com}OperationResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bean" type="{http://alu.services.ws.lhs.com}ArrayOfFraisAcc"/&gt;
 *         &lt;element name="montantTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateAccelerationForResiliationResponse", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "bean",
    "montantTotal"
})
public class CalculateAccelerationForResiliationResponse
    extends OperationResponse
{

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected ArrayOfFraisAcc bean;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Double.class, nillable = true)
    protected Double montantTotal;

    /**
     * Obtient la valeur de la propriété bean.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFraisAcc }
     *     
     */
    public ArrayOfFraisAcc getBean() {
        return bean;
    }

    /**
     * Définit la valeur de la propriété bean.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFraisAcc }
     *     
     */
    public void setBean(ArrayOfFraisAcc value) {
        this.bean = value;
    }

    /**
     * Obtient la valeur de la propriété montantTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontantTotal() {
        return montantTotal;
    }

    /**
     * Définit la valeur de la propriété montantTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontantTotal(Double value) {
        this.montantTotal = value;
    }

}
