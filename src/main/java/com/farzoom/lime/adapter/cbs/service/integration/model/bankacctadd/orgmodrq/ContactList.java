//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.30 at 09:45:03 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.orgmodrq;

import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.common.EmailAddrs;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.common.PhoneNums;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.common.PostAddrs;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.common.URLs;

import java.util.ArrayList;
import java.util.List;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactRec" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element ref="{}PhoneNums" minOccurs="0"/&gt;
 *                   &lt;element ref="{}EmailAddrs" minOccurs="0"/&gt;
 *                   &lt;element ref="{}PostAddrs" minOccurs="0"/&gt;
 *                   &lt;element ref="{}URLs" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    protected List<ContactRec> contactRec;

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
     * {@link ContactRec }
     * 
     * 
     */
    public List<ContactRec> getContactRec() {
        if (contactRec == null) {
            contactRec = new ArrayList<ContactRec>();
        }
        return this.contactRec;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element ref="{}PhoneNums" minOccurs="0"/&gt;
     *         &lt;element ref="{}EmailAddrs" minOccurs="0"/&gt;
     *         &lt;element ref="{}PostAddrs" minOccurs="0"/&gt;
     *         &lt;element ref="{}URLs" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
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
