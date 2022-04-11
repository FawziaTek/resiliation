
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour resiliationBean complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="resiliationBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="canal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caseCRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contestClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="contractOrderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="contractStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faContract" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="isResiliationTotal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="motif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motifClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerInit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldCoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldCoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="orderIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prgCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="remarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="rpCodeInit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rpCodeTarget" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="task" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tmcode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="totalFA" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="typeRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resiliationBean", propOrder = {
    "canal",
    "caseCRM",
    "coCode",
    "coId",
    "comments",
    "contestClient",
    "contractOrderId",
    "contractStatus",
    "custCode",
    "custId",
    "dueDate",
    "endDate",
    "faComment",
    "faContract",
    "isResiliationTotal",
    "motif",
    "motifClient",
    "msisdn",
    "offerDes",
    "offerInit",
    "offerTarget",
    "oldCoCode",
    "oldCoId",
    "orderId",
    "orderIdPub",
    "prgCode",
    "remarque",
    "resComment",
    "resDevice",
    "rpCodeInit",
    "rpCodeTarget",
    "startDate",
    "status",
    "task",
    "taskId",
    "tmcode",
    "totalFA",
    "typeRes",
    "user",
    "userGroup"
})
public class ResiliationBean {

    protected String canal;
    protected String caseCRM;
    protected String coCode;
    protected String coId;
    protected String comments;
    protected Boolean contestClient;
    protected Integer contractOrderId;
    protected String contractStatus;
    protected String custCode;
    protected String custId;
    protected String dueDate;
    protected String endDate;
    protected String faComment;
    protected float faContract;
    protected Boolean isResiliationTotal;
    protected String motif;
    protected String motifClient;
    protected String msisdn;
    protected String offerDes;
    protected String offerInit;
    protected String offerTarget;
    protected String oldCoCode;
    protected String oldCoId;
    protected Integer orderId;
    protected String orderIdPub;
    protected Integer prgCode;
    protected String remarque;
    protected String resComment;
    protected Boolean resDevice;
    protected int rpCodeInit;
    protected int rpCodeTarget;
    protected String startDate;
    protected int status;
    protected String task;
    protected Integer taskId;
    protected Integer tmcode;
    protected float totalFA;
    protected String typeRes;
    protected String user;
    protected String userGroup;

    /**
     * Obtient la valeur de la propri�t� canal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanal() {
        return canal;
    }

    /**
     * D�finit la valeur de la propri�t� canal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Obtient la valeur de la propri�t� caseCRM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseCRM() {
        return caseCRM;
    }

    /**
     * D�finit la valeur de la propri�t� caseCRM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseCRM(String value) {
        this.caseCRM = value;
    }

    /**
     * Obtient la valeur de la propri�t� coCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoCode() {
        return coCode;
    }

    /**
     * D�finit la valeur de la propri�t� coCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoCode(String value) {
        this.coCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� coId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoId() {
        return coId;
    }

    /**
     * D�finit la valeur de la propri�t� coId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoId(String value) {
        this.coId = value;
    }

    /**
     * Obtient la valeur de la propri�t� comments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * D�finit la valeur de la propri�t� comments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Obtient la valeur de la propri�t� contestClient.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContestClient() {
        return contestClient;
    }

    /**
     * D�finit la valeur de la propri�t� contestClient.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContestClient(Boolean value) {
        this.contestClient = value;
    }

    /**
     * Obtient la valeur de la propri�t� contractOrderId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractOrderId() {
        return contractOrderId;
    }

    /**
     * D�finit la valeur de la propri�t� contractOrderId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractOrderId(Integer value) {
        this.contractOrderId = value;
    }

    /**
     * Obtient la valeur de la propri�t� contractStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractStatus() {
        return contractStatus;
    }

    /**
     * D�finit la valeur de la propri�t� contractStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractStatus(String value) {
        this.contractStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� custCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCode() {
        return custCode;
    }

    /**
     * D�finit la valeur de la propri�t� custCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCode(String value) {
        this.custCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� custId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * D�finit la valeur de la propri�t� custId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Obtient la valeur de la propri�t� dueDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * D�finit la valeur de la propri�t� dueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� endDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * D�finit la valeur de la propri�t� endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� faComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaComment() {
        return faComment;
    }

    /**
     * D�finit la valeur de la propri�t� faComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaComment(String value) {
        this.faComment = value;
    }

    /**
     * Obtient la valeur de la propri�t� faContract.
     * 
     */
    public float getFaContract() {
        return faContract;
    }

    /**
     * D�finit la valeur de la propri�t� faContract.
     * 
     */
    public void setFaContract(float value) {
        this.faContract = value;
    }

    /**
     * Obtient la valeur de la propri�t� isResiliationTotal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsResiliationTotal() {
        return isResiliationTotal;
    }

    /**
     * D�finit la valeur de la propri�t� isResiliationTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsResiliationTotal(Boolean value) {
        this.isResiliationTotal = value;
    }

    /**
     * Obtient la valeur de la propri�t� motif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotif() {
        return motif;
    }

    /**
     * D�finit la valeur de la propri�t� motif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotif(String value) {
        this.motif = value;
    }

    /**
     * Obtient la valeur de la propri�t� motifClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotifClient() {
        return motifClient;
    }

    /**
     * D�finit la valeur de la propri�t� motifClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotifClient(String value) {
        this.motifClient = value;
    }

    /**
     * Obtient la valeur de la propri�t� msisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * D�finit la valeur de la propri�t� msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Obtient la valeur de la propri�t� offerDes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDes() {
        return offerDes;
    }

    /**
     * D�finit la valeur de la propri�t� offerDes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDes(String value) {
        this.offerDes = value;
    }

    /**
     * Obtient la valeur de la propri�t� offerInit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferInit() {
        return offerInit;
    }

    /**
     * D�finit la valeur de la propri�t� offerInit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferInit(String value) {
        this.offerInit = value;
    }

    /**
     * Obtient la valeur de la propri�t� offerTarget.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTarget() {
        return offerTarget;
    }

    /**
     * D�finit la valeur de la propri�t� offerTarget.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTarget(String value) {
        this.offerTarget = value;
    }

    /**
     * Obtient la valeur de la propri�t� oldCoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCoCode() {
        return oldCoCode;
    }

    /**
     * D�finit la valeur de la propri�t� oldCoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCoCode(String value) {
        this.oldCoCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� oldCoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCoId() {
        return oldCoId;
    }

    /**
     * D�finit la valeur de la propri�t� oldCoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCoId(String value) {
        this.oldCoId = value;
    }

    /**
     * Obtient la valeur de la propri�t� orderId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * D�finit la valeur de la propri�t� orderId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderId(Integer value) {
        this.orderId = value;
    }

    /**
     * Obtient la valeur de la propri�t� orderIdPub.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderIdPub() {
        return orderIdPub;
    }

    /**
     * D�finit la valeur de la propri�t� orderIdPub.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderIdPub(String value) {
        this.orderIdPub = value;
    }

    /**
     * Obtient la valeur de la propri�t� prgCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrgCode() {
        return prgCode;
    }

    /**
     * D�finit la valeur de la propri�t� prgCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrgCode(Integer value) {
        this.prgCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� remarque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarque() {
        return remarque;
    }

    /**
     * D�finit la valeur de la propri�t� remarque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarque(String value) {
        this.remarque = value;
    }

    /**
     * Obtient la valeur de la propri�t� resComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResComment() {
        return resComment;
    }

    /**
     * D�finit la valeur de la propri�t� resComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResComment(String value) {
        this.resComment = value;
    }

    /**
     * Obtient la valeur de la propri�t� resDevice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResDevice() {
        return resDevice;
    }

    /**
     * D�finit la valeur de la propri�t� resDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResDevice(Boolean value) {
        this.resDevice = value;
    }

    /**
     * Obtient la valeur de la propri�t� rpCodeInit.
     * 
     */
    public int getRpCodeInit() {
        return rpCodeInit;
    }

    /**
     * D�finit la valeur de la propri�t� rpCodeInit.
     * 
     */
    public void setRpCodeInit(int value) {
        this.rpCodeInit = value;
    }

    /**
     * Obtient la valeur de la propri�t� rpCodeTarget.
     * 
     */
    public int getRpCodeTarget() {
        return rpCodeTarget;
    }

    /**
     * D�finit la valeur de la propri�t� rpCodeTarget.
     * 
     */
    public void setRpCodeTarget(int value) {
        this.rpCodeTarget = value;
    }

    /**
     * Obtient la valeur de la propri�t� startDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * D�finit la valeur de la propri�t� startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * D�finit la valeur de la propri�t� status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propri�t� task.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTask() {
        return task;
    }

    /**
     * D�finit la valeur de la propri�t� task.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTask(String value) {
        this.task = value;
    }

    /**
     * Obtient la valeur de la propri�t� taskId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * D�finit la valeur de la propri�t� taskId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskId(Integer value) {
        this.taskId = value;
    }

    /**
     * Obtient la valeur de la propri�t� tmcode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTmcode() {
        return tmcode;
    }

    /**
     * D�finit la valeur de la propri�t� tmcode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTmcode(Integer value) {
        this.tmcode = value;
    }

    /**
     * Obtient la valeur de la propri�t� totalFA.
     * 
     */
    public float getTotalFA() {
        return totalFA;
    }

    /**
     * D�finit la valeur de la propri�t� totalFA.
     * 
     */
    public void setTotalFA(float value) {
        this.totalFA = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeRes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeRes() {
        return typeRes;
    }

    /**
     * D�finit la valeur de la propri�t� typeRes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeRes(String value) {
        this.typeRes = value;
    }

    /**
     * Obtient la valeur de la propri�t� user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * D�finit la valeur de la propri�t� user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Obtient la valeur de la propri�t� userGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGroup() {
        return userGroup;
    }

    /**
     * D�finit la valeur de la propri�t� userGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGroup(String value) {
        this.userGroup = value;
    }

}
