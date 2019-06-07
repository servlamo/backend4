
package com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="ContactRec" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element ref="{}PhoneNums" minOccurs="0"/>
 *                   &lt;element ref="{}EmailAddrs" minOccurs="0"/>
 *                   &lt;element ref="{}PostAddrs" minOccurs="0"/>
 *                   &lt;element ref="{}URLs" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "contactRec"
})
@XmlRootElement(name = "ContactList")
public class ContactList {

    @XmlElement(name = "ContactRec", required = true)
    protected List<ContactList.ContactRec> contactRec;

    /**
     * Gets the value of the contactRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactList.ContactRec }
     * 
     * 
     */
    public List<ContactList.ContactRec> getContactRec() {
        if (contactRec == null) {
            contactRec = new ArrayList<ContactList.ContactRec>();
        }
        return this.contactRec;
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
     *         &lt;element name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element ref="{}PhoneNums" minOccurs="0"/>
     *         &lt;element ref="{}EmailAddrs" minOccurs="0"/>
     *         &lt;element ref="{}PostAddrs" minOccurs="0"/>
     *         &lt;element ref="{}URLs" minOccurs="0"/>
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
    public static class ContactRec {

        @XmlElement(name = "ContactType")
        protected String contactType;
        @XmlElement(name = "PhoneNums")
        protected PhoneNums phoneNums;
        @XmlElement(name = "EmailAddrs")
        protected EmailAddrs emailAddrs;
        @XmlElement(name = "PostAddrs")
        protected PostAddrs postAddrs;
        @XmlElement(name = "URLs")
        protected URLs urLs;

        /**
         * Gets the value of the contactType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactType() {
            return contactType;
        }

        /**
         * Sets the value of the contactType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactType(String value) {
            this.contactType = value;
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
         * Gets the value of the urLs property.
         * 
         * @return
         *     possible object is
         *     {@link URLs }
         *     
         */
        public URLs getURLs() {
            return urLs;
        }

        /**
         * Sets the value of the urLs property.
         * 
         * @param value
         *     allowed object is
         *     {@link URLs }
         *     
         */
        public void setURLs(URLs value) {
            this.urLs = value;
        }

    }

}
