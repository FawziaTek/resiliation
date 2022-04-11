
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateResiliationOrderRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateResiliationOrderRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resiliation" type="{http://manager.ws.resiliation.billcom.com/}resiliationBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateResiliationOrderRequest", propOrder = {
    "resiliation"
})
public class UpdateResiliationOrderRequest {

    protected ResiliationBean resiliation;

    /**
     * Obtient la valeur de la propriété resiliation.
     * 
     * @return
     *     possible object is
     *     {@link ResiliationBean }
     *     
     */
    public ResiliationBean getResiliation() {
        return resiliation;
    }

    /**
     * Définit la valeur de la propriété resiliation.
     * 
     * @param value
     *     allowed object is
     *     {@link ResiliationBean }
     *     
     */
    public void setResiliation(ResiliationBean value) {
        this.resiliation = value;
    }

}
