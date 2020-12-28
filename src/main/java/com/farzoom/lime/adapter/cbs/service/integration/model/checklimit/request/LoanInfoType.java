
package com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип информация о кредите
 * 
 * <p>Java class for LoanInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EffDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="ProdType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="ProdName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ProdCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element ref="{}AgreemtNum" minOccurs="0"/>
 *         &lt;element name="SupplAgreemtNum" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="OrigDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="StartDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="MatDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="IncStart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncMat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{}Term" minOccurs="0"/>
 *         &lt;element name="ClosingDt" type="{}Date" minOccurs="0"/>
 *         &lt;element ref="{}BankInfo" minOccurs="0"/>
 *         &lt;element name="BranchNum" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="AgencyNum" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="OrigCurAmt" type="{}CurrencyAmount" minOccurs="0"/>
 *         &lt;element ref="{}AcctId" minOccurs="0"/>
 *         &lt;element ref="{}AcctBal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Freq" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="IntLiqDay" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IntRate" type="{}IntRate_Type" minOccurs="0"/>
 *         &lt;element name="DelinqRate" type="{}IntRate_Type" minOccurs="0"/>
 *         &lt;element name="DelinqRateInt" type="{}IntRate_Type" minOccurs="0"/>
 *         &lt;element ref="{}Collateral" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PurposeDesc" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element ref="{}IndustId" minOccurs="0"/>
 *         &lt;element name="AccruedInt" type="{}AccruedInt_Type" minOccurs="0"/>
 *         &lt;element name="PastDuePrincipal" type="{}AccruedInt_Type" minOccurs="0"/>
 *         &lt;element name="PastDueInt" type="{}AccruedInt_Type" minOccurs="0"/>
 *         &lt;element name="LastEODDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="LastEODInt" type="{}CurrencyAmount" minOccurs="0"/>
 *         &lt;element name="PmtSched" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="DueDt" type="{}Date"/>
 *                   &lt;element name="CurAmt" type="{}CurrencyAmount" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RemainingPmtCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CompletedPmtCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DueDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="NextPmtCurAmt" type="{}CurrencyAmount" minOccurs="0"/>
 *         &lt;element name="LastPmtDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="LastPmtCurAmt" type="{}CurrencyAmount" minOccurs="0"/>
 *         &lt;element name="OverdraftDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="PastDuePmtCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanInfo_Type", propOrder = {
    "effDt",
    "prodType",
    "prodName",
    "prodCode",
    "agreemtNum",
    "supplAgreemtNum",
    "origDt",
    "startDt",
    "matDt",
    "incStart",
    "incMat",
    "term",
    "closingDt",
    "bankInfo",
    "branchNum",
    "agencyNum",
    "origCurAmt",
    "acctId",
    "acctBal",
    "freq",
    "intLiqDay",
    "intRate",
    "delinqRate",
    "delinqRateInt",
    "collateral",
    "purposeDesc",
    "industId",
    "accruedInt",
    "pastDuePrincipal",
    "pastDueInt",
    "lastEODDt",
    "lastEODInt",
    "pmtSched",
    "remainingPmtCount",
    "completedPmtCount",
    "dueDt",
    "nextPmtCurAmt",
    "lastPmtDt",
    "lastPmtCurAmt",
    "overdraftDt",
    "pastDuePmtCount"
})
public class LoanInfoType {

    @XmlElement(name = "EffDt")
    protected Date effDt;
    @XmlElement(name = "ProdType", required = true)
    protected Object prodType;
    @XmlElement(name = "ProdName")
    protected Object prodName;
    @XmlElement(name = "ProdCode")
    protected Object prodCode;
    @XmlElement(name = "AgreemtNum")
    protected String agreemtNum;
    @XmlElement(name = "SupplAgreemtNum")
    protected Object supplAgreemtNum;
    @XmlElement(name = "OrigDt")
    protected Date origDt;
    @XmlElement(name = "StartDt")
    protected Date startDt;
    @XmlElement(name = "MatDt")
    protected Date matDt;
    @XmlElement(name = "IncStart")
    protected Boolean incStart;
    @XmlElement(name = "IncMat")
    protected Boolean incMat;
    @XmlElement(name = "Term")
    protected TermType term;
    @XmlElement(name = "ClosingDt")
    protected Date closingDt;
    @XmlElement(name = "BankInfo")
    protected BankInfo bankInfo;
    @XmlElement(name = "BranchNum")
    protected Object branchNum;
    @XmlElement(name = "AgencyNum")
    protected Object agencyNum;
    @XmlElement(name = "OrigCurAmt")
    protected CurrencyAmount origCurAmt;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctBal")
    protected List<AcctBal> acctBal;
    @XmlElement(name = "Freq")
    protected Object freq;
    @XmlElement(name = "IntLiqDay")
    protected Long intLiqDay;
    @XmlElement(name = "IntRate")
    protected IntRateType intRate;
    @XmlElement(name = "DelinqRate")
    protected IntRateType delinqRate;
    @XmlElement(name = "DelinqRateInt")
    protected IntRateType delinqRateInt;
    @XmlElement(name = "Collateral")
    protected List<Collateral> collateral;
    @XmlElement(name = "PurposeDesc")
    protected Object purposeDesc;
    @XmlElement(name = "IndustId")
    protected IndustId industId;
    @XmlElement(name = "AccruedInt")
    protected AccruedIntType accruedInt;
    @XmlElement(name = "PastDuePrincipal")
    protected AccruedIntType pastDuePrincipal;
    @XmlElement(name = "PastDueInt")
    protected AccruedIntType pastDueInt;
    @XmlElement(name = "LastEODDt")
    protected Date lastEODDt;
    @XmlElement(name = "LastEODInt")
    protected CurrencyAmount lastEODInt;
    @XmlElement(name = "PmtSched")
    protected LoanInfoType.PmtSched pmtSched;
    @XmlElement(name = "RemainingPmtCount")
    protected Long remainingPmtCount;
    @XmlElement(name = "CompletedPmtCount")
    protected Long completedPmtCount;
    @XmlElement(name = "DueDt")
    protected Date dueDt;
    @XmlElement(name = "NextPmtCurAmt")
    protected CurrencyAmount nextPmtCurAmt;
    @XmlElement(name = "LastPmtDt")
    protected Date lastPmtDt;
    @XmlElement(name = "LastPmtCurAmt")
    protected CurrencyAmount lastPmtCurAmt;
    @XmlElement(name = "OverdraftDt")
    protected Date overdraftDt;
    @XmlElement(name = "PastDuePmtCount")
    protected Long pastDuePmtCount;

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEffDt(Date value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the prodType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProdType() {
        return prodType;
    }

    /**
     * Sets the value of the prodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProdType(Object value) {
        this.prodType = value;
    }

    /**
     * Gets the value of the prodName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProdName() {
        return prodName;
    }

    /**
     * Sets the value of the prodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProdName(Object value) {
        this.prodName = value;
    }

    /**
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProdCode(Object value) {
        this.prodCode = value;
    }

    /**
     * Gets the value of the agreemtNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreemtNum() {
        return agreemtNum;
    }

    /**
     * Sets the value of the agreemtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreemtNum(String value) {
        this.agreemtNum = value;
    }

    /**
     * Gets the value of the supplAgreemtNum property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSupplAgreemtNum() {
        return supplAgreemtNum;
    }

    /**
     * Sets the value of the supplAgreemtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSupplAgreemtNum(Object value) {
        this.supplAgreemtNum = value;
    }

    /**
     * Gets the value of the origDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getOrigDt() {
        return origDt;
    }

    /**
     * Sets the value of the origDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setOrigDt(Date value) {
        this.origDt = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStartDt(Date value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the matDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getMatDt() {
        return matDt;
    }

    /**
     * Sets the value of the matDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setMatDt(Date value) {
        this.matDt = value;
    }

    /**
     * Gets the value of the incStart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncStart() {
        return incStart;
    }

    /**
     * Sets the value of the incStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncStart(Boolean value) {
        this.incStart = value;
    }

    /**
     * Gets the value of the incMat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncMat() {
        return incMat;
    }

    /**
     * Sets the value of the incMat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncMat(Boolean value) {
        this.incMat = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setTerm(TermType value) {
        this.term = value;
    }

    /**
     * Gets the value of the closingDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getClosingDt() {
        return closingDt;
    }

    /**
     * Sets the value of the closingDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setClosingDt(Date value) {
        this.closingDt = value;
    }

    /**
     * Gets the value of the bankInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankInfo }
     *     
     */
    public BankInfo getBankInfo() {
        return bankInfo;
    }

    /**
     * Sets the value of the bankInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInfo }
     *     
     */
    public void setBankInfo(BankInfo value) {
        this.bankInfo = value;
    }

    /**
     * Gets the value of the branchNum property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBranchNum() {
        return branchNum;
    }

    /**
     * Sets the value of the branchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBranchNum(Object value) {
        this.branchNum = value;
    }

    /**
     * Gets the value of the agencyNum property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAgencyNum() {
        return agencyNum;
    }

    /**
     * Sets the value of the agencyNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAgencyNum(Object value) {
        this.agencyNum = value;
    }

    /**
     * Gets the value of the origCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getOrigCurAmt() {
        return origCurAmt;
    }

    /**
     * Sets the value of the origCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setOrigCurAmt(CurrencyAmount value) {
        this.origCurAmt = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctBal }
     * 
     * 
     */
    public List<AcctBal> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<AcctBal>();
        }
        return this.acctBal;
    }

    /**
     * Gets the value of the freq property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFreq() {
        return freq;
    }

    /**
     * Sets the value of the freq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFreq(Object value) {
        this.freq = value;
    }

    /**
     * Gets the value of the intLiqDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntLiqDay() {
        return intLiqDay;
    }

    /**
     * Sets the value of the intLiqDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntLiqDay(Long value) {
        this.intLiqDay = value;
    }

    /**
     * Gets the value of the intRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getIntRate() {
        return intRate;
    }

    /**
     * Sets the value of the intRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setIntRate(IntRateType value) {
        this.intRate = value;
    }

    /**
     * Gets the value of the delinqRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getDelinqRate() {
        return delinqRate;
    }

    /**
     * Sets the value of the delinqRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setDelinqRate(IntRateType value) {
        this.delinqRate = value;
    }

    /**
     * Gets the value of the delinqRateInt property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getDelinqRateInt() {
        return delinqRateInt;
    }

    /**
     * Sets the value of the delinqRateInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setDelinqRateInt(IntRateType value) {
        this.delinqRateInt = value;
    }

    /**
     * Gets the value of the collateral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collateral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollateral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collateral }
     * 
     * 
     */
    public List<Collateral> getCollateral() {
        if (collateral == null) {
            collateral = new ArrayList<Collateral>();
        }
        return this.collateral;
    }

    /**
     * Gets the value of the purposeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPurposeDesc() {
        return purposeDesc;
    }

    /**
     * Sets the value of the purposeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPurposeDesc(Object value) {
        this.purposeDesc = value;
    }

    /**
     * Gets the value of the industId property.
     * 
     * @return
     *     possible object is
     *     {@link IndustId }
     *     
     */
    public IndustId getIndustId() {
        return industId;
    }

    /**
     * Sets the value of the industId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustId }
     *     
     */
    public void setIndustId(IndustId value) {
        this.industId = value;
    }

    /**
     * Gets the value of the accruedInt property.
     * 
     * @return
     *     possible object is
     *     {@link AccruedIntType }
     *     
     */
    public AccruedIntType getAccruedInt() {
        return accruedInt;
    }

    /**
     * Sets the value of the accruedInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccruedIntType }
     *     
     */
    public void setAccruedInt(AccruedIntType value) {
        this.accruedInt = value;
    }

    /**
     * Gets the value of the pastDuePrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link AccruedIntType }
     *     
     */
    public AccruedIntType getPastDuePrincipal() {
        return pastDuePrincipal;
    }

    /**
     * Sets the value of the pastDuePrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccruedIntType }
     *     
     */
    public void setPastDuePrincipal(AccruedIntType value) {
        this.pastDuePrincipal = value;
    }

    /**
     * Gets the value of the pastDueInt property.
     * 
     * @return
     *     possible object is
     *     {@link AccruedIntType }
     *     
     */
    public AccruedIntType getPastDueInt() {
        return pastDueInt;
    }

    /**
     * Sets the value of the pastDueInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccruedIntType }
     *     
     */
    public void setPastDueInt(AccruedIntType value) {
        this.pastDueInt = value;
    }

    /**
     * Gets the value of the lastEODDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getLastEODDt() {
        return lastEODDt;
    }

    /**
     * Sets the value of the lastEODDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setLastEODDt(Date value) {
        this.lastEODDt = value;
    }

    /**
     * Gets the value of the lastEODInt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getLastEODInt() {
        return lastEODInt;
    }

    /**
     * Sets the value of the lastEODInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setLastEODInt(CurrencyAmount value) {
        this.lastEODInt = value;
    }

    /**
     * Gets the value of the pmtSched property.
     * 
     * @return
     *     possible object is
     *     {@link LoanInfoType.PmtSched }
     *     
     */
    public LoanInfoType.PmtSched getPmtSched() {
        return pmtSched;
    }

    /**
     * Sets the value of the pmtSched property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanInfoType.PmtSched }
     *     
     */
    public void setPmtSched(LoanInfoType.PmtSched value) {
        this.pmtSched = value;
    }

    /**
     * Gets the value of the remainingPmtCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingPmtCount() {
        return remainingPmtCount;
    }

    /**
     * Sets the value of the remainingPmtCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingPmtCount(Long value) {
        this.remainingPmtCount = value;
    }

    /**
     * Gets the value of the completedPmtCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompletedPmtCount() {
        return completedPmtCount;
    }

    /**
     * Sets the value of the completedPmtCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompletedPmtCount(Long value) {
        this.completedPmtCount = value;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDueDt(Date value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the nextPmtCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getNextPmtCurAmt() {
        return nextPmtCurAmt;
    }

    /**
     * Sets the value of the nextPmtCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setNextPmtCurAmt(CurrencyAmount value) {
        this.nextPmtCurAmt = value;
    }

    /**
     * Gets the value of the lastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getLastPmtDt() {
        return lastPmtDt;
    }

    /**
     * Sets the value of the lastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setLastPmtDt(Date value) {
        this.lastPmtDt = value;
    }

    /**
     * Gets the value of the lastPmtCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getLastPmtCurAmt() {
        return lastPmtCurAmt;
    }

    /**
     * Sets the value of the lastPmtCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setLastPmtCurAmt(CurrencyAmount value) {
        this.lastPmtCurAmt = value;
    }

    /**
     * Gets the value of the overdraftDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getOverdraftDt() {
        return overdraftDt;
    }

    /**
     * Sets the value of the overdraftDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setOverdraftDt(Date value) {
        this.overdraftDt = value;
    }

    /**
     * Gets the value of the pastDuePmtCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPastDuePmtCount() {
        return pastDuePmtCount;
    }

    /**
     * Sets the value of the pastDuePmtCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPastDuePmtCount(Long value) {
        this.pastDuePmtCount = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="DueDt" type="{}Date"/>
     *         &lt;element name="CurAmt" type="{}CurrencyAmount" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class PmtSched {

        @XmlElement(name = "DueDt", required = true)
        protected Date dueDt;
        @XmlElement(name = "CurAmt")
        protected CurrencyAmount curAmt;

        /**
         * Gets the value of the dueDt property.
         * 
         * @return
         *     possible object is
         *     {@link Date }
         *     
         */
        public Date getDueDt() {
            return dueDt;
        }

        /**
         * Sets the value of the dueDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Date }
         *     
         */
        public void setDueDt(Date value) {
            this.dueDt = value;
        }

        /**
         * Gets the value of the curAmt property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmount }
         *     
         */
        public CurrencyAmount getCurAmt() {
            return curAmt;
        }

        /**
         * Sets the value of the curAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmount }
         *     
         */
        public void setCurAmt(CurrencyAmount value) {
            this.curAmt = value;
        }

    }

}
