
package com.billcom.apc.generatedSOAP.PBI_CMS.APCManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour verifyEligebilityResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="verifyEligebilityResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="response" type="{http://manager.ws.apc.billcom.com/}operationResponseAPC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyEligebilityResponse", propOrder = {
    "eligible",
    "response"
})
public class VerifyEligebilityResponse {

    protected boolean eligible;
    protected OperationResponseAPC response;

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
     * Obtient la valeur de la propriété response.
     * 
     * @return
     *     possible object is
     *     {@link OperationResponseAPC }
     *     
     */
    public OperationResponseAPC getResponse() {
        return response;
    }

    /**
     * Définit la valeur de la propriété response.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResponseAPC }
     *     
     */
    public void setResponse(OperationResponseAPC value) {
        this.response = value;
    }

}
