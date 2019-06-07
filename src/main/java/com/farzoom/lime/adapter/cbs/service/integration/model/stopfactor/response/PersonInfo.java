
package com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.response;

import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{}FullName"/>
 *         &lt;element ref="{}PersonName"/>
 *         &lt;element ref="{}FullNameEn" minOccurs="0"/>
 *         &lt;element ref="{}PersonNameEn" minOccurs="0"/>
 *         &lt;element ref="{}FullNamePrev" minOccurs="0"/>
 *         &lt;element ref="{}PersonNamePrev" minOccurs="0"/>
 *         &lt;element ref="{}ContactInfo" minOccurs="0"/>
 *         &lt;element ref="{}Gender" minOccurs="0"/>
 *         &lt;element ref="{}Birthday" minOccurs="0"/>
 *         &lt;element ref="{}BirthPlace" minOccurs="0"/>
 *         &lt;element ref="{}MaritalStatus" minOccurs="0"/>
 *         &lt;element name="Dependents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MilitaryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}TaxId" minOccurs="0"/>
 *         &lt;element ref="{}StateRegPrimeNum" minOccurs="0"/>
 *         &lt;element ref="{}Resident" minOccurs="0"/>
 *         &lt;element name="Occupation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{}Country"/>
 *                   &lt;element ref="{}CountryName"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}Employee" minOccurs="0"/>
 *         &lt;element ref="{}CodeDate" minOccurs="0"/>
 *         &lt;element ref="{}Hint" minOccurs="0"/>
 *         &lt;element ref="{}Citizenship" minOccurs="0"/>
 *         &lt;element ref="{}IdentityCard" minOccurs="0"/>
 *         &lt;element name="WeddingInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RegDt" type="{}Date" minOccurs="0"/>
 *                   &lt;element name="MarriageContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="DivisionProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Childs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}EmploymentHistory" minOccurs="0"/>
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
@XmlRootElement(name = "PersonInfo")
public class PersonInfo {

    @XmlElement(name = "FullName", required = true)
    protected String fullName;
    @XmlElement(name = "PersonName", required = true)
    protected PersonNameType personName;
    @XmlElement(name = "FullNameEn")
    protected String fullNameEn;
    @XmlElement(name = "PersonNameEn")
    protected PersonNameType personNameEn;
    @XmlElement(name = "FullNamePrev")
    protected String fullNamePrev;
    @XmlElement(name = "PersonNamePrev")
    protected PersonNamePrev personNamePrev;
    @XmlElement(name = "ContactInfo")
    protected ContactInfo contactInfo;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "Birthday")
    protected Date birthday;
    @XmlElement(name = "BirthPlace")
    protected String birthPlace;
    @XmlElement(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlElement(name = "Dependents")
    protected String dependents;
    @XmlElement(name = "MilitaryStatus")
    protected String militaryStatus;
    @XmlElement(name = "TaxId")
    protected String taxId;
    @XmlElement(name = "StateRegPrimeNum")
    protected String stateRegPrimeNum;
    @XmlElement(name = "Resident", defaultValue = "true")
    protected Boolean resident;
    @XmlElement(name = "Occupation")
    protected PersonInfo.Occupation occupation;
    @XmlElement(name = "Employee", defaultValue = "false")
    protected Boolean employee;
    @XmlElement(name = "CodeDate")
    protected String codeDate;
    @XmlElement(name = "Hint")
    protected String hint;
    @XmlElement(name = "Citizenship")
    protected Citizenship citizenship;
    @XmlElement(name = "IdentityCard")
    protected IdentityCard identityCard;
    @XmlElement(name = "WeddingInfo")
    protected PersonInfo.WeddingInfo weddingInfo;
    @XmlElement(name = "EmploymentHistory")
    protected EmploymentHistory employmentHistory;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the fullNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNameEn() {
        return fullNameEn;
    }

    /**
     * Sets the value of the fullNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNameEn(String value) {
        this.fullNameEn = value;
    }

    /**
     * Gets the value of the personNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonNameEn() {
        return personNameEn;
    }

    /**
     * Sets the value of the personNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonNameEn(PersonNameType value) {
        this.personNameEn = value;
    }

    /**
     * Gets the value of the fullNamePrev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNamePrev() {
        return fullNamePrev;
    }

    /**
     * Sets the value of the fullNamePrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNamePrev(String value) {
        this.fullNamePrev = value;
    }

    /**
     * Gets the value of the personNamePrev property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNamePrev }
     *     
     */
    public PersonNamePrev getPersonNamePrev() {
        return personNamePrev;
    }

    /**
     * Sets the value of the personNamePrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNamePrev }
     *     
     */
    public void setPersonNamePrev(PersonNamePrev value) {
        this.personNamePrev = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setBirthday(Date value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the dependents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependents() {
        return dependents;
    }

    /**
     * Sets the value of the dependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependents(String value) {
        this.dependents = value;
    }

    /**
     * Gets the value of the militaryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryStatus() {
        return militaryStatus;
    }

    /**
     * Sets the value of the militaryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryStatus(String value) {
        this.militaryStatus = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the stateRegPrimeNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRegPrimeNum() {
        return stateRegPrimeNum;
    }

    /**
     * Sets the value of the stateRegPrimeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRegPrimeNum(String value) {
        this.stateRegPrimeNum = value;
    }

    /**
     * Gets the value of the resident property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResident() {
        return resident;
    }

    /**
     * Sets the value of the resident property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResident(Boolean value) {
        this.resident = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo.Occupation }
     *     
     */
    public PersonInfo.Occupation getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo.Occupation }
     *     
     */
    public void setOccupation(PersonInfo.Occupation value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmployee(Boolean value) {
        this.employee = value;
    }

    /**
     * Gets the value of the codeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDate() {
        return codeDate;
    }

    /**
     * Sets the value of the codeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDate(String value) {
        this.codeDate = value;
    }

    /**
     * Gets the value of the hint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHint() {
        return hint;
    }

    /**
     * Sets the value of the hint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHint(String value) {
        this.hint = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link Citizenship }
     *     
     */
    public Citizenship getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link Citizenship }
     *     
     */
    public void setCitizenship(Citizenship value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the identityCard property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityCard }
     *     
     */
    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    /**
     * Sets the value of the identityCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityCard }
     *     
     */
    public void setIdentityCard(IdentityCard value) {
        this.identityCard = value;
    }

    /**
     * Gets the value of the weddingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo.WeddingInfo }
     *     
     */
    public PersonInfo.WeddingInfo getWeddingInfo() {
        return weddingInfo;
    }

    /**
     * Sets the value of the weddingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo.WeddingInfo }
     *     
     */
    public void setWeddingInfo(PersonInfo.WeddingInfo value) {
        this.weddingInfo = value;
    }

    /**
     * Gets the value of the employmentHistory property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentHistory }
     *     
     */
    public EmploymentHistory getEmploymentHistory() {
        return employmentHistory;
    }

    /**
     * Sets the value of the employmentHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentHistory }
     *     
     */
    public void setEmploymentHistory(EmploymentHistory value) {
        this.employmentHistory = value;
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
     *         &lt;element ref="{}Country"/>
     *         &lt;element ref="{}CountryName"/>
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
    public static class Occupation {

        @XmlElement(name = "Country", required = true)
        protected String country;
        @XmlElement(name = "CountryName", required = true)
        protected String countryName;

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
         * Gets the value of the countryName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryName() {
            return countryName;
        }

        /**
         * Sets the value of the countryName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryName(String value) {
            this.countryName = value;
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
     *       &lt;sequence>
     *         &lt;element name="RegDt" type="{}Date" minOccurs="0"/>
     *         &lt;element name="MarriageContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="DivisionProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Childs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "regDt",
        "marriageContract",
        "divisionProperty",
        "childs"
    })
    public static class WeddingInfo {

        @XmlElement(name = "RegDt")
        protected Date regDt;
        @XmlElement(name = "MarriageContract")
        protected Boolean marriageContract;
        @XmlElement(name = "DivisionProperty")
        protected String divisionProperty;
        @XmlElement(name = "Childs")
        protected Boolean childs;

        /**
         * Gets the value of the regDt property.
         * 
         * @return
         *     possible object is
         *     {@link Date }
         *     
         */
        public Date getRegDt() {
            return regDt;
        }

        /**
         * Sets the value of the regDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Date }
         *     
         */
        public void setRegDt(Date value) {
            this.regDt = value;
        }

        /**
         * Gets the value of the marriageContract property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMarriageContract() {
            return marriageContract;
        }

        /**
         * Sets the value of the marriageContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMarriageContract(Boolean value) {
            this.marriageContract = value;
        }

        /**
         * Gets the value of the divisionProperty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDivisionProperty() {
            return divisionProperty;
        }

        /**
         * Sets the value of the divisionProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDivisionProperty(String value) {
            this.divisionProperty = value;
        }

        /**
         * Gets the value of the childs property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChilds() {
            return childs;
        }

        /**
         * Sets the value of the childs property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChilds(Boolean value) {
            this.childs = value;
        }

    }

}
