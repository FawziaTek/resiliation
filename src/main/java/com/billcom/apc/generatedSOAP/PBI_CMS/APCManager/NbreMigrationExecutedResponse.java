
package com.billcom.apc.generatedSOAP.PBI_CMS.APCManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour nbreMigrationExecutedResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="nbreMigrationExecutedResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numBer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nbreMigrationExecutedResponse", propOrder = {
    "numBer"
})
public class NbreMigrationExecutedResponse {

    protected int numBer;

    /**
     * Obtient la valeur de la propriété numBer.
     * 
     */
    public int getNumBer() {
        return numBer;
    }

    /**
     * Définit la valeur de la propriété numBer.
     * 
     */
    public void setNumBer(int value) {
        this.numBer = value;
    }

}
