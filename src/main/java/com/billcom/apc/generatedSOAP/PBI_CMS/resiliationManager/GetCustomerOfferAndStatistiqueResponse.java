
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GetCustomerOfferAndStatistiqueResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerOfferAndStatistiqueResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://alu.services.ws.lhs.com}OperationResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerOffreBean" type="{http://alu.services.ws.lhs.com}ArrayOfCustomerOffreBean"/&gt;
 *         &lt;element name="nombreContratsTotal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerOfferAndStatistiqueResponse", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "customerOffreBean",
    "nombreContratsTotal"
})
public class GetCustomerOfferAndStatistiqueResponse
    extends OperationResponse
{

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected ArrayOfCustomerOffreBean customerOffreBean;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com")
    protected int nombreContratsTotal;

    /**
     * Obtient la valeur de la propriété customerOffreBean.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomerOffreBean }
     *     
     */
    public ArrayOfCustomerOffreBean getCustomerOffreBean() {
        return customerOffreBean;
    }

    /**
     * Définit la valeur de la propriété customerOffreBean.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomerOffreBean }
     *     
     */
    public void setCustomerOffreBean(ArrayOfCustomerOffreBean value) {
        this.customerOffreBean = value;
    }

    /**
     * Obtient la valeur de la propriété nombreContratsTotal.
     * 
     */
    public int getNombreContratsTotal() {
        return nombreContratsTotal;
    }

    /**
     * Définit la valeur de la propriété nombreContratsTotal.
     * 
     */
    public void setNombreContratsTotal(int value) {
        this.nombreContratsTotal = value;
    }

}
