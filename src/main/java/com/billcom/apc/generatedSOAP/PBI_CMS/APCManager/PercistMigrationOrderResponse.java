
package com.billcom.apc.generatedSOAP.PBI_CMS.APCManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour percistMigrationOrderResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="percistMigrationOrderResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="finished" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "percistMigrationOrderResponse", propOrder = {
    "finished"
})
public class PercistMigrationOrderResponse {

    protected boolean finished;

    /**
     * Obtient la valeur de la propri�t� finished.
     * 
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * D�finit la valeur de la propri�t� finished.
     * 
     */
    public void setFinished(boolean value) {
        this.finished = value;
    }

}
