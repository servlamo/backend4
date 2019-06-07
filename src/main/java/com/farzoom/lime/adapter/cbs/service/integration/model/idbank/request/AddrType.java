//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.05 at 06:35:48 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.idbank.request;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Адрес разложенный по КЛАДР
 * 
 * <p>Java class for Addr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Addr_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AddrType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="REGISTRATION"/>
 *               &lt;enumeration value="REAL_LIVE"/>
 *               &lt;enumeration value="POST"/>
 *               &lt;enumeration value="CONTACT"/>
 *               &lt;enumeration value="BUSINESS"/>
 *               &lt;enumeration value="FACT_ORG_CL"/>
 *               &lt;enumeration value="REALTY"/>
 *               &lt;enumeration value="REGIS_BIRTH_PLACE"/>
 *               &lt;enumeration value="REGISTRATION_TEMP"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DistrictCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StateProv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StateProvCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StreetCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HouseNum" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="HouseExt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HouseBlock" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnitNum" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KladrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OKATOCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OKTMOCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Addr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Addr_Type", propOrder = {

})
public class AddrType {

    @XmlElement(name = "AddrType", required = true)
    protected String addrType;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "RegionCode", required = true)
    protected String regionCode;
    @XmlElement(name = "District", required = true)
    protected String district;
    @XmlElement(name = "DistrictCode", required = true)
    protected String districtCode;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "CityCode", required = true)
    protected String cityCode;
    @XmlElement(name = "StateProv", required = true)
    protected String stateProv;
    @XmlElement(name = "StateProvCode", required = true)
    protected String stateProvCode;
    @XmlElement(name = "Street", required = true)
    protected String street;
    @XmlElement(name = "StreetCode", required = true)
    protected String streetCode;
    @XmlElement(name = "HouseNum", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger houseNum;
    @XmlElement(name = "HouseExt", required = true)
    protected String houseExt;
    @XmlElement(name = "HouseBlock", required = true)
    protected String houseBlock;
    @XmlElement(name = "Unit", required = true)
    protected String unit;
    @XmlElement(name = "UnitNum", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger unitNum;
    @XmlElement(name = "PostalCode", required = true)
    protected String postalCode;
    @XmlElement(name = "KladrCode")
    protected String kladrCode;
    @XmlElement(name = "OKATOCode", required = true)
    protected String okatoCode;
    @XmlElement(name = "OKTMOCode", required = true)
    protected String oktmoCode;
    @XmlElement(name = "Addr", required = true)
    protected String addr;

    /**
     * Gets the value of the addrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrType() {
        return addrType;
    }

    /**
     * Sets the value of the addrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrType(String value) {
        this.addrType = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the districtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * Sets the value of the districtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictCode(String value) {
        this.districtCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProv(String value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the stateProvCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvCode() {
        return stateProvCode;
    }

    /**
     * Sets the value of the stateProvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvCode(String value) {
        this.stateProvCode = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the streetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetCode() {
        return streetCode;
    }

    /**
     * Sets the value of the streetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetCode(String value) {
        this.streetCode = value;
    }

    /**
     * Gets the value of the houseNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHouseNum() {
        return houseNum;
    }

    /**
     * Sets the value of the houseNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHouseNum(BigInteger value) {
        this.houseNum = value;
    }

    /**
     * Gets the value of the houseExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseExt() {
        return houseExt;
    }

    /**
     * Sets the value of the houseExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseExt(String value) {
        this.houseExt = value;
    }

    /**
     * Gets the value of the houseBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseBlock() {
        return houseBlock;
    }

    /**
     * Sets the value of the houseBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseBlock(String value) {
        this.houseBlock = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the unitNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitNum() {
        return unitNum;
    }

    /**
     * Sets the value of the unitNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitNum(BigInteger value) {
        this.unitNum = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the kladrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKladrCode() {
        return kladrCode;
    }

    /**
     * Sets the value of the kladrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKladrCode(String value) {
        this.kladrCode = value;
    }

    /**
     * Gets the value of the okatoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKATOCode() {
        return okatoCode;
    }

    /**
     * Sets the value of the okatoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKATOCode(String value) {
        this.okatoCode = value;
    }

    /**
     * Gets the value of the oktmoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKTMOCode() {
        return oktmoCode;
    }

    /**
     * Sets the value of the oktmoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKTMOCode(String value) {
        this.oktmoCode = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr(String value) {
        this.addr = value;
    }

}
