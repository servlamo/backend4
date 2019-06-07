
package com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о платеже в бюджет
 * 
 * <p>Java class for BudgetaryPmtInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetaryPmtInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}RUS.DrawerStatus" minOccurs="0"/>
 *         &lt;element ref="{}RUS.PmtBasisCode" minOccurs="0"/>
 *         &lt;element ref="{}RUS.TaxPeriod" minOccurs="0"/>
 *         &lt;element ref="{}RUS.TaxDocNum" minOccurs="0"/>
 *         &lt;element name="RUS.TaxDocDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}RUS.TaxPmtType" minOccurs="0"/>
 *         &lt;element ref="{}RUS.OKATO" minOccurs="0"/>
 *         &lt;element ref="{}RUS.OKTMO" minOccurs="0"/>
 *         &lt;element ref="{}RUS.BC" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetaryPmtInfo_Type", propOrder = {

})
public class BudgetaryPmtInfoType {

    @XmlElement(name = "RUS.DrawerStatus")
    protected String rusDrawerStatus;
    @XmlElement(name = "RUS.PmtBasisCode")
    protected String rusPmtBasisCode;
    @XmlElement(name = "RUS.TaxPeriod")
    protected String rusTaxPeriod;
    @XmlElement(name = "RUS.TaxDocNum")
    protected String rusTaxDocNum;
    @XmlElement(name = "RUS.TaxDocDt")
    protected String rusTaxDocDt;
    @XmlElement(name = "RUS.TaxPmtType")
    protected String rusTaxPmtType;
    @XmlElement(name = "RUS.OKATO")
    protected String rusokato;
    @XmlElement(name = "RUS.OKTMO")
    protected String rusoktmo;
    @XmlElement(name = "RUS.BC")
    protected String rusbc;

    /**
     * Gets the value of the rusDrawerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSDrawerStatus() {
        return rusDrawerStatus;
    }

    /**
     * Sets the value of the rusDrawerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSDrawerStatus(String value) {
        this.rusDrawerStatus = value;
    }

    /**
     * Gets the value of the rusPmtBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSPmtBasisCode() {
        return rusPmtBasisCode;
    }

    /**
     * Sets the value of the rusPmtBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSPmtBasisCode(String value) {
        this.rusPmtBasisCode = value;
    }

    /**
     * Gets the value of the rusTaxPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSTaxPeriod() {
        return rusTaxPeriod;
    }

    /**
     * Sets the value of the rusTaxPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSTaxPeriod(String value) {
        this.rusTaxPeriod = value;
    }

    /**
     * Gets the value of the rusTaxDocNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSTaxDocNum() {
        return rusTaxDocNum;
    }

    /**
     * Sets the value of the rusTaxDocNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSTaxDocNum(String value) {
        this.rusTaxDocNum = value;
    }

    /**
     * Gets the value of the rusTaxDocDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSTaxDocDt() {
        return rusTaxDocDt;
    }

    /**
     * Sets the value of the rusTaxDocDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSTaxDocDt(String value) {
        this.rusTaxDocDt = value;
    }

    /**
     * Gets the value of the rusTaxPmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSTaxPmtType() {
        return rusTaxPmtType;
    }

    /**
     * Sets the value of the rusTaxPmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSTaxPmtType(String value) {
        this.rusTaxPmtType = value;
    }

    /**
     * Gets the value of the rusokato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSOKATO() {
        return rusokato;
    }

    /**
     * Sets the value of the rusokato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSOKATO(String value) {
        this.rusokato = value;
    }

    /**
     * Gets the value of the rusoktmo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSOKTMO() {
        return rusoktmo;
    }

    /**
     * Sets the value of the rusoktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSOKTMO(String value) {
        this.rusoktmo = value;
    }

    /**
     * Gets the value of the rusbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSBC() {
        return rusbc;
    }

    /**
     * Sets the value of the rusbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSBC(String value) {
        this.rusbc = value;
    }

}
