
package com.billcom.apc.ws.manager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour verifyMigrationResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="verifyMigrationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response" type="{http://manager.ws.apc.billcom.com/}operationResponseAPC" minOccurs="0"/&gt;
 *         &lt;element name="verified" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyMigrationResponse", propOrder = {
    "response",
    "verified"
})
public class VerifyMigrationResponse {

    protected OperationResponseAPC response;
    protected boolean verified;

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

    /**
     * Obtient la valeur de la propriété verified.
     * 
     */
    public boolean isVerified() {
        return verified;
    }

    /**
     * Définit la valeur de la propriété verified.
     * 
     */
    public void setVerified(boolean value) {
        this.verified = value;
    }

}
