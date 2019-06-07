
package com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.request;

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
 *       &lt;all>
 *         &lt;element ref="{}ServerInfo"/>
 *         &lt;element name="BankSvcRq">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{}RequestId"/>
 *                   &lt;element ref="{}OrgId"/>
 *                   &lt;element ref="{}ExtOrgId"/>
 *                   &lt;element name="OrgInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element ref="{}Name"/>
 *                             &lt;element ref="{}TaxId"/>
 *                             &lt;element ref="{}TaxRegCode"/>
 *                             &lt;element ref="{}StateRegPrimeNum"/>
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
 *                             &lt;element ref="{}ProdType"/>
 *                             &lt;element name="GuaranteeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CurAmt" type="{}CurrencyAmount"/>
 *                             &lt;element name="StartDt" type="{}Date"/>
 *                             &lt;element name="EndDt" type="{}Date"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Org2OrgList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Org2OrgRec" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="LinkType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element ref="{}OrgId"/>
 *                                       &lt;element name="OrgInfo">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element ref="{}TaxId"/>
 *                                                 &lt;element ref="{}TaxRegCode"/>
 *                                                 &lt;element ref="{}Name"/>
 *                                                 &lt;element ref="{}StateRegPrimeNum"/>
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
public class CheckLimitRequest {

    @XmlElement(name = "ServerInfo", required = true)
    protected ServerInfoType serverInfo;
    @XmlElement(name = "BankSvcRq", required = true)
    protected CheckLimitRequest.BankSvcRq bankSvcRq;

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
     *     {@link CheckLimitRequest.BankSvcRq }
     *     
     */
    public CheckLimitRequest.BankSvcRq getBankSvcRq() {
        return bankSvcRq;
    }

    /**
     * Sets the value of the bankSvcRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckLimitRequest.BankSvcRq }
     *     
     */
    public void setBankSvcRq(CheckLimitRequest.BankSvcRq value) {
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
     *         &lt;element ref="{}RequestId"/>
     *         &lt;element ref="{}OrgId"/>
     *         &lt;element ref="{}ExtOrgId"/>
     *         &lt;element name="OrgInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element ref="{}Name"/>
     *                   &lt;element ref="{}TaxId"/>
     *                   &lt;element ref="{}TaxRegCode"/>
     *                   &lt;element ref="{}StateRegPrimeNum"/>
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
     *                   &lt;element ref="{}ProdType"/>
     *                   &lt;element name="GuaranteeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CurAmt" type="{}CurrencyAmount"/>
     *                   &lt;element name="StartDt" type="{}Date"/>
     *                   &lt;element name="EndDt" type="{}Date"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Org2OrgList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Org2OrgRec" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="LinkType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element ref="{}OrgId"/>
     *                             &lt;element name="OrgInfo">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element ref="{}TaxId"/>
     *                                       &lt;element ref="{}TaxRegCode"/>
     *                                       &lt;element ref="{}Name"/>
     *                                       &lt;element ref="{}StateRegPrimeNum"/>
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

        @XmlElement(name = "RequestId", required = true)
        protected String requestId;
        @XmlElement(name = "OrgId", required = true)
        protected String orgId;
        @XmlElement(name = "ExtOrgId", required = true)
        protected String extOrgId;
        @XmlElement(name = "OrgInfo", required = true)
        protected CheckLimitRequest.BankSvcRq.OrgInfo orgInfo;
        @XmlElement(name = "ProdInfo", required = true)
        protected CheckLimitRequest.BankSvcRq.ProdInfo prodInfo;
        @XmlElement(name = "Org2OrgList", required = true)
        protected CheckLimitRequest.BankSvcRq.Org2OrgList org2OrgList;

        /**
         * Gets the value of the requestId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestId() {
            return requestId;
        }

        /**
         * Sets the value of the requestId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestId(String value) {
            this.requestId = value;
        }

        /**
         * Gets the value of the orgId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgId() {
            return orgId;
        }

        /**
         * Sets the value of the orgId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgId(String value) {
            this.orgId = value;
        }

        /**
         * Gets the value of the extOrgId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtOrgId() {
            return extOrgId;
        }

        /**
         * Sets the value of the extOrgId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtOrgId(String value) {
            this.extOrgId = value;
        }

        /**
         * Gets the value of the orgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CheckLimitRequest.BankSvcRq.OrgInfo }
         *     
         */
        public CheckLimitRequest.BankSvcRq.OrgInfo getOrgInfo() {
            return orgInfo;
        }

        /**
         * Sets the value of the orgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckLimitRequest.BankSvcRq.OrgInfo }
         *     
         */
        public void setOrgInfo(CheckLimitRequest.BankSvcRq.OrgInfo value) {
            this.orgInfo = value;
        }

        /**
         * Gets the value of the prodInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CheckLimitRequest.BankSvcRq.ProdInfo }
         *     
         */
        public CheckLimitRequest.BankSvcRq.ProdInfo getProdInfo() {
            return prodInfo;
        }

        /**
         * Sets the value of the prodInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckLimitRequest.BankSvcRq.ProdInfo }
         *     
         */
        public void setProdInfo(CheckLimitRequest.BankSvcRq.ProdInfo value) {
            this.prodInfo = value;
        }

        /**
         * Gets the value of the org2OrgList property.
         * 
         * @return
         *     possible object is
         *     {@link CheckLimitRequest.BankSvcRq.Org2OrgList }
         *     
         */
        public CheckLimitRequest.BankSvcRq.Org2OrgList getOrg2OrgList() {
            return org2OrgList;
        }

        /**
         * Sets the value of the org2OrgList property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckLimitRequest.BankSvcRq.Org2OrgList }
         *     
         */
        public void setOrg2OrgList(CheckLimitRequest.BankSvcRq.Org2OrgList value) {
            this.org2OrgList = value;
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
         *         &lt;element name="Org2OrgRec" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="LinkType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element ref="{}OrgId"/>
         *                   &lt;element name="OrgInfo">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element ref="{}TaxId"/>
         *                             &lt;element ref="{}TaxRegCode"/>
         *                             &lt;element ref="{}Name"/>
         *                             &lt;element ref="{}StateRegPrimeNum"/>
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
            "org2OrgRec"
        })
        public static class Org2OrgList {

            @XmlElement(name = "Org2OrgRec", required = true)
            protected List<CheckLimitRequest.BankSvcRq.Org2OrgList.Org2OrgRec> org2OrgRec;

            /**
             * Gets the value of the org2OrgRec property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the org2OrgRec property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOrg2OrgRec().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CheckLimitRequest.BankSvcRq.Org2OrgList.Org2OrgRec }
             * 
             * 
             */
            public List<CheckLimitRequest.BankSvcRq.Org2OrgList.Org2OrgRec> getOrg2OrgRec() {
                if (org2OrgRec == null) {
                    org2OrgRec = new ArrayList<CheckLimitRequest.BankSvcRq.Org2OrgList.Org2OrgRec>();
                }
                return this.org2OrgRec;
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
             *         &lt;element name="LinkType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element ref="{}OrgId"/>
             *         &lt;element name="OrgInfo">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element ref="{}TaxId"/>
             *                   &lt;element ref="{}TaxRegCode"/>
             *                   &lt;element ref="{}Name"/>
             *                   &lt;element ref="{}StateRegPrimeNum"/>
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
            public static class Org2OrgRec {

                @XmlElement(name = "LinkType", required = true)
                protected Object linkType;
                @XmlElement(name = "OrgId", required = true)
                protected String orgId;
                @XmlElement(name = "OrgInfo", required = true)
                protected CheckLimitRequest.BankSvcRq.Org2OrgList.Org2OrgRec.OrgInfo orgInfo;

                /**
                 * Gets the value of the linkType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getLinkType() {
                    return linkType;
                }

                /**
                 * Sets the value of the linkType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setLinkType(Object value) {
                    this.linkType = value;
                }

                /**
                 * Gets the value of the orgId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrgId() {
                    return orgId;
                }

                /**
                 * Sets the value of the orgId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrgId(String value) {
                    this.orgId = value;
                }

                /**
                 * Gets the value of the orgInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CheckLimitRequest.BankSvcRq.Org2OrgList.Org2OrgRec.OrgInfo }
                 *     
                 */
                public CheckLimitRequest.BankSvcRq.Org2OrgList.Org2OrgRec.OrgInfo getOrgInfo() {
                    return orgInfo;
                }

                /**
                 * Sets the value of the orgInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CheckLimitRequest.BankSvcRq.Org2OrgList.Org2OrgRec.OrgInfo }
                 *     
                 */
                public void setOrgInfo(CheckLimitRequest.BankSvcRq.Org2OrgList.Org2OrgRec.OrgInfo value) {
                    this.orgInfo = value;
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
                 *         &lt;element ref="{}TaxId"/>
                 *         &lt;element ref="{}TaxRegCode"/>
                 *         &lt;element ref="{}Name"/>
                 *         &lt;element ref="{}StateRegPrimeNum"/>
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
                public static class OrgInfo {

                    @XmlElement(name = "TaxId", required = true)
                    protected String taxId;
                    @XmlElement(name = "TaxRegCode", required = true)
                    protected String taxRegCode;
                    @XmlElement(name = "Name", required = true)
                    protected String name;
                    @XmlElement(name = "StateRegPrimeNum", required = true)
                    protected String stateRegPrimeNum;

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
                     * Gets the value of the taxRegCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTaxRegCode() {
                        return taxRegCode;
                    }

                    /**
                     * Sets the value of the taxRegCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTaxRegCode(String value) {
                        this.taxRegCode = value;
                    }

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
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

                }

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
         *         &lt;element ref="{}Name"/>
         *         &lt;element ref="{}TaxId"/>
         *         &lt;element ref="{}TaxRegCode"/>
         *         &lt;element ref="{}StateRegPrimeNum"/>
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
        public static class OrgInfo {

            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "TaxId", required = true)
            protected String taxId;
            @XmlElement(name = "TaxRegCode", required = true)
            protected String taxRegCode;
            @XmlElement(name = "StateRegPrimeNum", required = true)
            protected String stateRegPrimeNum;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
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
             * Gets the value of the taxRegCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxRegCode() {
                return taxRegCode;
            }

            /**
             * Sets the value of the taxRegCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxRegCode(String value) {
                this.taxRegCode = value;
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
         *         &lt;element ref="{}ProdType"/>
         *         &lt;element name="GuaranteeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CurAmt" type="{}CurrencyAmount"/>
         *         &lt;element name="StartDt" type="{}Date"/>
         *         &lt;element name="EndDt" type="{}Date"/>
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

            @XmlElement(name = "ProdType", required = true)
            protected String prodType;
            @XmlElement(name = "GuaranteeType", required = true)
            protected String guaranteeType;
            @XmlElement(name = "CurAmt", required = true)
            protected CurrencyAmount curAmt;
            @XmlElement(name = "StartDt", required = true)
            protected Date startDt;
            @XmlElement(name = "EndDt", required = true)
            protected Date endDt;

            /**
             * Gets the value of the prodType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProdType() {
                return prodType;
            }

            /**
             * Sets the value of the prodType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProdType(String value) {
                this.prodType = value;
            }

            /**
             * Gets the value of the guaranteeType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuaranteeType() {
                return guaranteeType;
            }

            /**
             * Sets the value of the guaranteeType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuaranteeType(String value) {
                this.guaranteeType = value;
            }

            /**
             * Gets the value of the curAmt property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmount }
             *     
             */
            public CurrencyAmount getCurAmt() {
                return curAmt;
            }

            /**
             * Sets the value of the curAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmount }
             *     
             */
            public void setCurAmt(CurrencyAmount value) {
                this.curAmt = value;
            }

            /**
             * Gets the value of the startDt property.
             * 
             * @return
             *     possible object is
             *     {@link Date }
             *     
             */
            public Date getStartDt() {
                return startDt;
            }

            /**
             * Sets the value of the startDt property.
             * 
             * @param value
             *     allowed object is
             *     {@link Date }
             *     
             */
            public void setStartDt(Date value) {
                this.startDt = value;
            }

            /**
             * Gets the value of the endDt property.
             * 
             * @return
             *     possible object is
             *     {@link Date }
             *     
             */
            public Date getEndDt() {
                return endDt;
            }

            /**
             * Sets the value of the endDt property.
             * 
             * @param value
             *     allowed object is
             *     {@link Date }
             *     
             */
            public void setEndDt(Date value) {
                this.endDt = value;
            }

        }

    }

}
