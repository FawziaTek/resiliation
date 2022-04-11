
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GetMontantFactureResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetMontantFactureResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://alu.services.ws.lhs.com}OperationResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="montant" type="{http://alu.services.ws.lhs.com}MoneyBean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMontantFactureResponse", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "montant"
})
public class GetMontantFactureResponse
    extends OperationResponse
{

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected MoneyBean montant;

    /**
     * Obtient la valeur de la propri�t� montant.
     * 
     * @return
     *     possible object is
     *     {@link MoneyBean }
     *     
     */
    public MoneyBean getMontant() {
        return montant;
    }

    /**
     * D�finit la valeur de la propri�t� montant.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyBean }
     *     
     */
    public void setMontant(MoneyBean value) {
        this.montant = value;
    }

}
