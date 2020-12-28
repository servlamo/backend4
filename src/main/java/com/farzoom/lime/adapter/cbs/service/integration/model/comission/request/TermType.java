
package com.farzoom.lime.adapter.cbs.service.integration.model.comission.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Срок
 * 
 * <p>Java class for Term_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Term_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TermUnits">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Days"/>
 *               &lt;enumeration value="Weeks"/>
 *               &lt;enumeration value="Months"/>
 *               &lt;enumeration value="Years"/>
 *               &lt;enumeration value="Indefinite"/>
 *               &lt;enumeration value="Overnight"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExtraTerm" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="TermUnits">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Days"/>
 *                         &lt;enumeration value="Weeks"/>
 *                         &lt;enumeration value="Months"/>
 *                         &lt;enumeration value="Years"/>
 *                         &lt;enumeration value="Indefinite"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}Desc" minOccurs="0"/>
 *         &lt;element name="DaysCall" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Term_Type", propOrder = {
    "count",
    "termUnits",
    "extraTerm",
    "desc",
    "daysCall"
})
public class TermType {

    @XmlElement(name = "Count")
    protected long count;
    @XmlElement(name = "TermUnits", required = true)
    protected String termUnits;
    @XmlElement(name = "ExtraTerm")
    protected List<TermType.ExtraTerm> extraTerm;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "DaysCall")
    protected Long daysCall;

    /**
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the value of the termUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermUnits() {
        return termUnits;
    }

    /**
     * Sets the value of the termUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermUnits(String value) {
        this.termUnits = value;
    }

    /**
     * Gets the value of the extraTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermType.ExtraTerm }
     * 
     * 
     */
    public List<TermType.ExtraTerm> getExtraTerm() {
        if (extraTerm == null) {
            extraTerm = new ArrayList<TermType.ExtraTerm>();
        }
        return this.extraTerm;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the daysCall property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysCall() {
        return daysCall;
    }

    /**
     * Sets the value of the daysCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysCall(Long value) {
        this.daysCall = value;
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
     *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="TermUnits">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Days"/>
     *               &lt;enumeration value="Weeks"/>
     *               &lt;enumeration value="Months"/>
     *               &lt;enumeration value="Years"/>
     *               &lt;enumeration value="Indefinite"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
    public static class ExtraTerm {

        @XmlElement(name = "Count")
        protected long count;
        @XmlElement(name = "TermUnits", required = true)
        protected String termUnits;

        /**
         * Gets the value of the count property.
         * 
         */
        public long getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         */
        public void setCount(long value) {
            this.count = value;
        }

        /**
         * Gets the value of the termUnits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTermUnits() {
            return termUnits;
        }

        /**
         * Sets the value of the termUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTermUnits(String value) {
            this.termUnits = value;
        }

    }

}
