
package com.billcom.apc.ws.manager;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getMigrationOrderParentResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getMigrationOrderParentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parentProcessInstanceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMigrationOrderParentResponse", propOrder = {
    "parentProcessInstanceId"
})
public class GetMigrationOrderParentResponse {

    protected BigInteger parentProcessInstanceId;

    /**
     * Obtient la valeur de la propriété parentProcessInstanceId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentProcessInstanceId() {
        return parentProcessInstanceId;
    }

    /**
     * Définit la valeur de la propriété parentProcessInstanceId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentProcessInstanceId(BigInteger value) {
        this.parentProcessInstanceId = value;
    }

}
