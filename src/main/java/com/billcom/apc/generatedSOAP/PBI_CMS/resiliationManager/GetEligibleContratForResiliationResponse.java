
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getEligibleContratForResiliationResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getEligibleContratForResiliationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://manager.ws.resiliation.billcom.com/}getEligibleContratResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEligibleContratForResiliationResponse", propOrder = {
    "_return"
})
public class GetEligibleContratForResiliationResponse {

    @XmlElement(name = "return")
    protected GetEligibleContratResponse _return;

    /**
     * Obtient la valeur de la propri�t� return.
     * 
     * @return
     *     possible object is
     *     {@link GetEligibleContratResponse }
     *     
     */
    public GetEligibleContratResponse getReturn() {
        return _return;
    }

    /**
     * D�finit la valeur de la propri�t� return.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEligibleContratResponse }
     *     
     */
    public void setReturn(GetEligibleContratResponse value) {
        this._return = value;
    }

}
