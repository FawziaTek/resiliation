
package com.billcom.apc.generatedSOAP.PBI_CMS.APCManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getMigrationResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getMigrationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="migration" type="{http://manager.ws.apc.billcom.com/}migrationBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMigrationResponse", propOrder = {
    "migration"
})
public class GetMigrationResponse {

    protected MigrationBean migration;

    /**
     * Obtient la valeur de la propriété migration.
     * 
     * @return
     *     possible object is
     *     {@link MigrationBean }
     *     
     */
    public MigrationBean getMigration() {
        return migration;
    }

    /**
     * Définit la valeur de la propriété migration.
     * 
     * @param value
     *     allowed object is
     *     {@link MigrationBean }
     *     
     */
    public void setMigration(MigrationBean value) {
        this.migration = value;
    }

}
