
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour percistResiliationOrderResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="percistResiliationOrderResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="finished" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="response" type="{http://manager.ws.resiliation.billcom.com/}operationResponseResiliation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "percistResiliationOrderResponse", propOrder = {
    "finished",
    "response"
})
public class PercistResiliationOrderResponse {

    protected boolean finished;
    protected OperationResponseResiliation response;

    /**
     * Obtient la valeur de la propriété finished.
     * 
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * Définit la valeur de la propriété finished.
     * 
     */
    public void setFinished(boolean value) {
        this.finished = value;
    }

    /**
     * Obtient la valeur de la propriété response.
     * 
     * @return
     *     possible object is
     *     {@link OperationResponseResiliation }
     *     
     */
    public OperationResponseResiliation getResponse() {
        return response;
    }

    /**
     * Définit la valeur de la propriété response.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResponseResiliation }
     *     
     */
    public void setResponse(OperationResponseResiliation value) {
        this.response = value;
    }

}
