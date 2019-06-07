
package com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.response;

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
 *         &lt;element ref="{}ServerInfo"/>
 *         &lt;element name="BankSvcRs">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{}RequestId" minOccurs="0"/>
 *                   &lt;element ref="{}OrgId" minOccurs="0"/>
 *                   &lt;element name="LimitInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="LimitCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LimitAmt" type="{}CurrencyAmount"/>
 *                             &lt;element name="LimitDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BankAcctIdTo" type="{}BankAcctId_Type" minOccurs="0"/>
 *                   &lt;element ref="{}Status"/>
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
public class CheckLimitResponse {

    @XmlElement(name = "ServerInfo", required = true)
    protected ServerInfoType serverInfo;
    @XmlElement(name = "BankSvcRs", required = true)
    protected CheckLimitResponse.BankSvcRs bankSvcRs;

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
     * Gets the value of the bankSvcRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckLimitResponse.BankSvcRs }
     *     
     */
    public CheckLimitResponse.BankSvcRs getBankSvcRs() {
        return bankSvcRs;
    }

    /**
     * Sets the value of the bankSvcRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckLimitResponse.BankSvcRs }
     *     
     */
    public void setBankSvcRs(CheckLimitResponse.BankSvcRs value) {
        this.bankSvcRs = value;
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
     *         &lt;element ref="{}RequestId" minOccurs="0"/>
     *         &lt;element ref="{}OrgId" minOccurs="0"/>
     *         &lt;element name="LimitInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LimitCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="LimitAmt" type="{}CurrencyAmount"/>
     *                   &lt;element name="LimitDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BankAcctIdTo" type="{}BankAcctId_Type" minOccurs="0"/>
     *         &lt;element ref="{}Status"/>
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
    public static class BankSvcRs {

        @XmlElement(name = "RequestId")
        protected String requestId;
        @XmlElement(name = "OrgId")
        protected String orgId;
        @XmlElement(name = "LimitInfo")
        protected CheckLimitResponse.BankSvcRs.LimitInfo limitInfo;
        @XmlElement(name = "BankAcctIdTo")
        protected BankAcctIdType bankAcctIdTo;
        @XmlElement(name = "Status", required = true)
        protected Status status;

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
         * Gets the value of the limitInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CheckLimitResponse.BankSvcRs.LimitInfo }
         *     
         */
        public CheckLimitResponse.BankSvcRs.LimitInfo getLimitInfo() {
            return limitInfo;
        }

        /**
         * Sets the value of the limitInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckLimitResponse.BankSvcRs.LimitInfo }
         *     
         */
        public void setLimitInfo(CheckLimitResponse.BankSvcRs.LimitInfo value) {
            this.limitInfo = value;
        }

        /**
         * Gets the value of the bankAcctIdTo property.
         *
         * @return
         *     possible object is
         *     {@link BankAcctIdType }
         *
         */
        public BankAcctIdType getBankAcctIdTo() {
            return bankAcctIdTo;
        }

        /**
         * Sets the value of the bankAcctIdTo property.
         *
         * @param value
         *     allowed object is
         *     {@link BankAcctIdType }
         *
         */
        public void setBankAcctIdTo(BankAcctIdType value) {
            this.bankAcctIdTo = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link Status }
         *     
         */
        public Status getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link Status }
         *     
         */
        public void setStatus(Status value) {
            this.status = value;
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
         *         &lt;element name="LimitCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="LimitAmt" type="{}CurrencyAmount"/>
         *         &lt;element name="LimitDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        public static class LimitInfo {

            @XmlElement(name = "LimitCode", required = true)
            protected String limitCode;
            @XmlElement(name = "LimitAmt", required = true)
            protected CurrencyAmount limitAmt;
            @XmlElement(name = "LimitDesc", required = true)
            protected String limitDesc;

            /**
             * Gets the value of the limitCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLimitCode() {
                return limitCode;
            }

            /**
             * Sets the value of the limitCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLimitCode(String value) {
                this.limitCode = value;
            }

            /**
             * Gets the value of the limitAmt property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmount }
             *     
             */
            public CurrencyAmount getLimitAmt() {
                return limitAmt;
            }

            /**
             * Sets the value of the limitAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmount }
             *     
             */
            public void setLimitAmt(CurrencyAmount value) {
                this.limitAmt = value;
            }

            /**
             * Gets the value of the limitDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLimitDesc() {
                return limitDesc;
            }

            /**
             * Sets the value of the limitDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLimitDesc(String value) {
                this.limitDesc = value;
            }

        }

    }

}
