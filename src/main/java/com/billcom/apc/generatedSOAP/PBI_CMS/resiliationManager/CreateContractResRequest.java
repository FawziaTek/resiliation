
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CreateContractResRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CreateContractResRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rpCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateContractResRequest", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "coId",
    "rpCode"
})
public class CreateContractResRequest {

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long coId;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long rpCode;

    /**
     * Obtient la valeur de la propriété coId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCoId() {
        return coId;
    }

    /**
     * Définit la valeur de la propriété coId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCoId(Long value) {
        this.coId = value;
    }

    /**
     * Obtient la valeur de la propriété rpCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRpCode() {
        return rpCode;
    }

    /**
     * Définit la valeur de la propriété rpCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRpCode(Long value) {
        this.rpCode = value;
    }

}
