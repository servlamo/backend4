//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.11 at 07:50:00 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.cre.response;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * Сводные данные по арбитражным делам
 * 
 * <p>Java class for sparkArbitrationCasesYear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sparkArbitrationCasesYear">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Plaintiff">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CasesNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Sum" type="{}sparkDecimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Defendant">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CasesNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Sum" type="{}sparkDecimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ThirdOrOtherPerson">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CasesNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Year" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sparkArbitrationCasesYear", propOrder = {
    "plaintiff",
    "defendant",
    "thirdOrOtherPerson"
})
public class SparkArbitrationCasesYear {

    @XmlElement(name = "Plaintiff", required = true)
    protected SparkArbitrationCasesYear.Plaintiff plaintiff;
    @XmlElement(name = "Defendant", required = true)
    protected SparkArbitrationCasesYear.Defendant defendant;
    @XmlElement(name = "ThirdOrOtherPerson", required = true)
    protected SparkArbitrationCasesYear.ThirdOrOtherPerson thirdOrOtherPerson;
    @XmlAttribute(name = "Year", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String year;

    /**
     * Gets the value of the plaintiff property.
     * 
     * @return
     *     possible object is
     *     {@link SparkArbitrationCasesYear.Plaintiff }
     *     
     */
    public SparkArbitrationCasesYear.Plaintiff getPlaintiff() {
        return plaintiff;
    }

    /**
     * Sets the value of the plaintiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link SparkArbitrationCasesYear.Plaintiff }
     *     
     */
    public void setPlaintiff(SparkArbitrationCasesYear.Plaintiff value) {
        this.plaintiff = value;
    }

    /**
     * Gets the value of the defendant property.
     * 
     * @return
     *     possible object is
     *     {@link SparkArbitrationCasesYear.Defendant }
     *     
     */
    public SparkArbitrationCasesYear.Defendant getDefendant() {
        return defendant;
    }

    /**
     * Sets the value of the defendant property.
     * 
     * @param value
     *     allowed object is
     *     {@link SparkArbitrationCasesYear.Defendant }
     *     
     */
    public void setDefendant(SparkArbitrationCasesYear.Defendant value) {
        this.defendant = value;
    }

    /**
     * Gets the value of the thirdOrOtherPerson property.
     * 
     * @return
     *     possible object is
     *     {@link SparkArbitrationCasesYear.ThirdOrOtherPerson }
     *     
     */
    public SparkArbitrationCasesYear.ThirdOrOtherPerson getThirdOrOtherPerson() {
        return thirdOrOtherPerson;
    }

    /**
     * Sets the value of the thirdOrOtherPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link SparkArbitrationCasesYear.ThirdOrOtherPerson }
     *     
     */
    public void setThirdOrOtherPerson(SparkArbitrationCasesYear.ThirdOrOtherPerson value) {
        this.thirdOrOtherPerson = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
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
     *       &lt;attribute name="CasesNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Sum" type="{}sparkDecimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Defendant {

        @XmlAttribute(name = "CasesNumber")
        protected BigInteger casesNumber;
        @XmlAttribute(name = "Sum")
        protected String sum;

        /**
         * Gets the value of the casesNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCasesNumber() {
            return casesNumber;
        }

        /**
         * Sets the value of the casesNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCasesNumber(BigInteger value) {
            this.casesNumber = value;
        }

        /**
         * Gets the value of the sum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSum() {
            return sum;
        }

        /**
         * Sets the value of the sum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSum(String value) {
            this.sum = value;
        }

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
     *       &lt;attribute name="CasesNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Sum" type="{}sparkDecimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Plaintiff {

        @XmlAttribute(name = "CasesNumber")
        protected BigInteger casesNumber;
        @XmlAttribute(name = "Sum")
        protected String sum;

        /**
         * Gets the value of the casesNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCasesNumber() {
            return casesNumber;
        }

        /**
         * Sets the value of the casesNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCasesNumber(BigInteger value) {
            this.casesNumber = value;
        }

        /**
         * Gets the value of the sum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSum() {
            return sum;
        }

        /**
         * Sets the value of the sum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSum(String value) {
            this.sum = value;
        }

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
     *       &lt;attribute name="CasesNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ThirdOrOtherPerson {

        @XmlAttribute(name = "CasesNumber")
        protected BigInteger casesNumber;

        /**
         * Gets the value of the casesNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCasesNumber() {
            return casesNumber;
        }

        /**
         * Sets the value of the casesNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCasesNumber(BigInteger value) {
            this.casesNumber = value;
        }

    }

}
