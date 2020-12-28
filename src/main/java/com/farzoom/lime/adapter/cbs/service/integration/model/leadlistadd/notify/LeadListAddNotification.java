
package com.farzoom.lime.adapter.cbs.service.integration.model.leadlistadd.notify;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}ServerInfo"/>
 *         &lt;element name="BankSvcRq">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="LeadList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LeadRec" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="PersonInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element ref="{}PersonName" minOccurs="0"/>
 *                                                 &lt;element ref="{}ContactInfo" minOccurs="0"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ProdInfo">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element ref="{}ProdCode"/>
 *                                                 &lt;element ref="{}ProdName" minOccurs="0"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlRootElement(name = "FDX")
public class LeadListAddNotification {

    @XmlElement(name = "ServerInfo", required = true)
    protected ServerInfoType serverInfo;
    @XmlElement(name = "BankSvcRq", required = true)
    protected LeadListAddNotification.BankSvcRq bankSvcRq;

    /**
     * Gets the value of the serverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServerInfoType }
     *     
     */
    public ServerInfoType getServerInfo() {
        return serverInfo;
    }

    /**
     * Sets the value of the serverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerInfoType }
     *     
     */
    public void setServerInfo(ServerInfoType value) {
        this.serverInfo = value;
    }

    /**
     * Gets the value of the bankSvcRq property.
     * 
     * @return
     *     possible object is
     *     {@link LeadListAddNotification.BankSvcRq }
     *     
     */
    public LeadListAddNotification.BankSvcRq getBankSvcRq() {
        return bankSvcRq;
    }

    /**
     * Sets the value of the bankSvcRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadListAddNotification.BankSvcRq }
     *     
     */
    public void setBankSvcRq(LeadListAddNotification.BankSvcRq value) {
        this.bankSvcRq = value;
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
     *         &lt;element name="LeadList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LeadRec" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="PersonInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element ref="{}PersonName" minOccurs="0"/>
     *                                       &lt;element ref="{}ContactInfo" minOccurs="0"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ProdInfo">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element ref="{}ProdCode"/>
     *                                       &lt;element ref="{}ProdName" minOccurs="0"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    public static class BankSvcRq {

        @XmlElement(name = "LeadList", required = true)
        protected LeadListAddNotification.BankSvcRq.LeadList leadList;

        /**
         * Gets the value of the leadList property.
         * 
         * @return
         *     possible object is
         *     {@link LeadListAddNotification.BankSvcRq.LeadList }
         *     
         */
        public LeadListAddNotification.BankSvcRq.LeadList getLeadList() {
            return leadList;
        }

        /**
         * Sets the value of the leadList property.
         * 
         * @param value
         *     allowed object is
         *     {@link LeadListAddNotification.BankSvcRq.LeadList }
         *     
         */
        public void setLeadList(LeadListAddNotification.BankSvcRq.LeadList value) {
            this.leadList = value;
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
         *         &lt;element name="LeadRec" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="PersonInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element ref="{}PersonName" minOccurs="0"/>
         *                             &lt;element ref="{}ContactInfo" minOccurs="0"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ProdInfo">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element ref="{}ProdCode"/>
         *                             &lt;element ref="{}ProdName" minOccurs="0"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            "leadRec"
        })
        public static class LeadList {

            @XmlElement(name = "LeadRec", required = true)
            protected List<LeadListAddNotification.BankSvcRq.LeadList.LeadRec> leadRec;

            /**
             * Gets the value of the leadRec property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the leadRec property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLeadRec().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LeadListAddNotification.BankSvcRq.LeadList.LeadRec }
             * 
             * 
             */
            public List<LeadListAddNotification.BankSvcRq.LeadList.LeadRec> getLeadRec() {
                if (leadRec == null) {
                    leadRec = new ArrayList<LeadListAddNotification.BankSvcRq.LeadList.LeadRec>();
                }
                return this.leadRec;
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
             *         &lt;element name="PersonInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element ref="{}PersonName" minOccurs="0"/>
             *                   &lt;element ref="{}ContactInfo" minOccurs="0"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ProdInfo">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element ref="{}ProdCode"/>
             *                   &lt;element ref="{}ProdName" minOccurs="0"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
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
            public static class LeadRec {

                @XmlElement(name = "PersonInfo")
                protected LeadListAddNotification.BankSvcRq.LeadList.LeadRec.PersonInfo personInfo;
                @XmlElement(name = "ProdInfo", required = true)
                protected LeadListAddNotification.BankSvcRq.LeadList.LeadRec.ProdInfo prodInfo;

                /**
                 * Gets the value of the personInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LeadListAddNotification.BankSvcRq.LeadList.LeadRec.PersonInfo }
                 *     
                 */
                public LeadListAddNotification.BankSvcRq.LeadList.LeadRec.PersonInfo getPersonInfo() {
                    return personInfo;
                }

                /**
                 * Sets the value of the personInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LeadListAddNotification.BankSvcRq.LeadList.LeadRec.PersonInfo }
                 *     
                 */
                public void setPersonInfo(LeadListAddNotification.BankSvcRq.LeadList.LeadRec.PersonInfo value) {
                    this.personInfo = value;
                }

                /**
                 * Gets the value of the prodInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LeadListAddNotification.BankSvcRq.LeadList.LeadRec.ProdInfo }
                 *     
                 */
                public LeadListAddNotification.BankSvcRq.LeadList.LeadRec.ProdInfo getProdInfo() {
                    return prodInfo;
                }

                /**
                 * Sets the value of the prodInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LeadListAddNotification.BankSvcRq.LeadList.LeadRec.ProdInfo }
                 *     
                 */
                public void setProdInfo(LeadListAddNotification.BankSvcRq.LeadList.LeadRec.ProdInfo value) {
                    this.prodInfo = value;
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
                 *         &lt;element ref="{}PersonName" minOccurs="0"/>
                 *         &lt;element ref="{}ContactInfo" minOccurs="0"/>
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
                public static class PersonInfo {

                    @XmlElement(name = "PersonName")
                    protected PersonNameType personName;
                    @XmlElement(name = "ContactInfo")
                    protected ContactInfo contactInfo;

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
                 *         &lt;element ref="{}ProdCode"/>
                 *         &lt;element ref="{}ProdName" minOccurs="0"/>
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
                public static class ProdInfo {

                    @XmlElement(name = "ProdCode", required = true)
                    protected String prodCode;
                    @XmlElement(name = "ProdName")
                    protected String prodName;

                    /**
                     * Gets the value of the prodCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProdCode() {
                        return prodCode;
                    }

                    /**
                     * Sets the value of the prodCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProdCode(String value) {
                        this.prodCode = value;
                    }

                    /**
                     * Gets the value of the prodName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProdName() {
                        return prodName;
                    }

                    /**
                     * Sets the value of the prodName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProdName(String value) {
                        this.prodName = value;
                    }

                }

            }

        }

    }

}
