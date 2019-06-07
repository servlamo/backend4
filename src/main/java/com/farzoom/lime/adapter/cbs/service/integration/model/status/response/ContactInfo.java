
package com.farzoom.lime.adapter.cbs.service.integration.model.status.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ContactPref" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AlwPhone"/>
 *               &lt;enumeration value="DayPhone"/>
 *               &lt;enumeration value="EvePhone"/>
 *               &lt;enumeration value="AlwFax"/>
 *               &lt;enumeration value="DayFax"/>
 *               &lt;enumeration value="EveFax"/>
 *               &lt;enumeration value="Mobile"/>
 *               &lt;enumeration value="Email"/>
 *               &lt;enumeration value="ccMail"/>
 *               &lt;enumeration value="Post"/>
 *               &lt;enumeration value="Telex"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}PhoneNums"/>
 *           &lt;element ref="{}PhoneNum"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}EmailAddrs"/>
 *           &lt;element ref="{}EmailAddr"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}PostAddrs"/>
 *           &lt;element name="PostAddr" type="{}Addr_Type"/>
 *         &lt;/choice>
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
    "contactPref",
    "phoneNums",
    "phoneNum",
    "emailAddrs",
    "emailAddr",
    "postAddrs",
    "postAddr"
})
@XmlRootElement(name = "ContactInfo")
public class ContactInfo {

    @XmlElement(name = "ContactPref")
    protected String contactPref;
    @XmlElement(name = "PhoneNums")
    protected PhoneNums phoneNums;
    @XmlElement(name = "PhoneNum")
    protected PhoneNum phoneNum;
    @XmlElement(name = "EmailAddrs")
    protected EmailAddrs emailAddrs;
    @XmlElement(name = "EmailAddr")
    protected String emailAddr;
    @XmlElement(name = "PostAddrs")
    protected PostAddrs postAddrs;
    @XmlElement(name = "PostAddr")
    protected AddrType postAddr;

    /**
     * Gets the value of the contactPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPref() {
        return contactPref;
    }

    /**
     * Sets the value of the contactPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPref(String value) {
        this.contactPref = value;
    }

    /**
     * Gets the value of the phoneNums property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNums }
     *     
     */
    public PhoneNums getPhoneNums() {
        return phoneNums;
    }

    /**
     * Sets the value of the phoneNums property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNums }
     *     
     */
    public void setPhoneNums(PhoneNums value) {
        this.phoneNums = value;
    }

    /**
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNum }
     *     
     */
    public PhoneNum getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNum }
     *     
     */
    public void setPhoneNum(PhoneNum value) {
        this.phoneNum = value;
    }

    /**
     * Gets the value of the emailAddrs property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddrs }
     *     
     */
    public EmailAddrs getEmailAddrs() {
        return emailAddrs;
    }

    /**
     * Sets the value of the emailAddrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddrs }
     *     
     */
    public void setEmailAddrs(EmailAddrs value) {
        this.emailAddrs = value;
    }

    /**
     * Gets the value of the emailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddr() {
        return emailAddr;
    }

    /**
     * Sets the value of the emailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddr(String value) {
        this.emailAddr = value;
    }

    /**
     * Gets the value of the postAddrs property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddrs }
     *     
     */
    public PostAddrs getPostAddrs() {
        return postAddrs;
    }

    /**
     * Sets the value of the postAddrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddrs }
     *     
     */
    public void setPostAddrs(PostAddrs value) {
        this.postAddrs = value;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrType }
     *     
     */
    public AddrType getPostAddr() {
        return postAddr;
    }

    /**
     * Sets the value of the postAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrType }
     *     
     */
    public void setPostAddr(AddrType value) {
        this.postAddr = value;
    }

}
