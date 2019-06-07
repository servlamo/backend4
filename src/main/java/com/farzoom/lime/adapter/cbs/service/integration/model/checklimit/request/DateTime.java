
package com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ��� ����/�����
 * 
 * <p>Java class for DateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Year"/>
 *         &lt;element ref="{}Month"/>
 *         &lt;element ref="{}Day"/>
 *         &lt;element ref="{}Hour"/>
 *         &lt;element ref="{}Minute"/>
 *         &lt;element ref="{}Second"/>
 *         &lt;element ref="{}Fraction" minOccurs="0"/>
 *         &lt;element ref="{}UTCOffset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTime", propOrder = {
    "year",
    "month",
    "day",
    "hour",
    "minute",
    "second",
    "fraction",
    "utcOffset"
})
public class DateTime {

    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Month")
    protected int month;
    @XmlElement(name = "Day")
    protected int day;
    @XmlElement(name = "Hour")
    protected int hour;
    @XmlElement(name = "Minute")
    protected int minute;
    @XmlElement(name = "Second")
    protected int second;
    @XmlElement(name = "Fraction")
    protected Long fraction;
    @XmlElement(name = "UTCOffset")
    protected Integer utcOffset;

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Gets the value of the day property.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     */
    public int getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     */
    public void setHour(int value) {
        this.hour = value;
    }

    /**
     * Gets the value of the minute property.
     * 
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     * 
     */
    public void setMinute(int value) {
        this.minute = value;
    }

    /**
     * Gets the value of the second property.
     * 
     */
    public int getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     */
    public void setSecond(int value) {
        this.second = value;
    }

    /**
     * Gets the value of the fraction property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFraction() {
        return fraction;
    }

    /**
     * Sets the value of the fraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFraction(Long value) {
        this.fraction = value;
    }

    /**
     * Gets the value of the utcOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUTCOffset() {
        return utcOffset;
    }

    /**
     * Sets the value of the utcOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUTCOffset(Integer value) {
        this.utcOffset = value;
    }

}
