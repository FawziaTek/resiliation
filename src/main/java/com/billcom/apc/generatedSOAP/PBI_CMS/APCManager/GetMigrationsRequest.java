
package com.billcom.apc.generatedSOAP.PBI_CMS.APCManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getMigrationsRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getMigrationsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMigrationsRequest", propOrder = {
    "dateEnd",
    "dateStart"
})
public class GetMigrationsRequest {

    protected String dateEnd;
    protected String dateStart;

    /**
     * Obtient la valeur de la propriété dateEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateEnd() {
        return dateEnd;
    }

    /**
     * Définit la valeur de la propriété dateEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateEnd(String value) {
        this.dateEnd = value;
    }

    /**
     * Obtient la valeur de la propriété dateStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateStart() {
        return dateStart;
    }

    /**
     * Définit la valeur de la propriété dateStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateStart(String value) {
        this.dateStart = value;
    }

}
