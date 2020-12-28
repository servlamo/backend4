
package com.farzoom.lime.adapter.cbs.service.integration.model.comission.request;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип процентная ставка
 * 
 * <p>Java class for IntRate_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntRate_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntBy" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Current"/>
 *               &lt;enumeration value="Orig"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IntRateType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Fixed"/>
 *               &lt;enumeration value="Float"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IntRateAmtSlab" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element ref="{}Rate"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}Rate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRate_Type", propOrder = {
    "intMethodCode",
    "intBy",
    "intRateType",
    "intRateAmtSlab",
    "rate"
})
public class IntRateType {

    @XmlElement(name = "IntMethodCode")
    protected String intMethodCode;
    @XmlElement(name = "IntBy")
    protected String intBy;
    @XmlElement(name = "IntRateType")
    protected String intRateType;
    @XmlElement(name = "IntRateAmtSlab")
    protected List<IntRateType.IntRateAmtSlab> intRateAmtSlab;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;

    /**
     * Gets the value of the intMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntMethodCode() {
        return intMethodCode;
    }

    /**
     * Sets the value of the intMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntMethodCode(String value) {
        this.intMethodCode = value;
    }

    /**
     * Gets the value of the intBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntBy() {
        return intBy;
    }

    /**
     * Sets the value of the intBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntBy(String value) {
        this.intBy = value;
    }

    /**
     * Gets the value of the intRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntRateType() {
        return intRateType;
    }

    /**
     * Sets the value of the intRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntRateType(String value) {
        this.intRateType = value;
    }

    /**
     * Gets the value of the intRateAmtSlab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intRateAmtSlab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntRateAmtSlab().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntRateType.IntRateAmtSlab }
     * 
     * 
     */
    public List<IntRateType.IntRateAmtSlab> getIntRateAmtSlab() {
        if (intRateAmtSlab == null) {
            intRateAmtSlab = new ArrayList<IntRateType.IntRateAmtSlab>();
        }
        return this.intRateAmtSlab;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
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
     *         &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element ref="{}Rate"/>
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
    public static class IntRateAmtSlab {

        @XmlElement(name = "Amt", required = true)
        protected BigDecimal amt;
        @XmlElement(name = "Rate", required = true)
        protected BigDecimal rate;

        /**
         * Gets the value of the amt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmt() {
            return amt;
        }

        /**
         * Sets the value of the amt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmt(BigDecimal value) {
            this.amt = value;
        }

        /**
         * Gets the value of the rate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRate() {
            return rate;
        }

        /**
         * Sets the value of the rate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRate(BigDecimal value) {
            this.rate = value;
        }

    }

}
