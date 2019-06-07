
package com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.request;

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
public class StopFactorRequest {

    @XmlElement(name = "ServerInfo", required = true)
    protected ServerInfoType serverInfo;
    @XmlElement(name = "BankSvcRq", required = true)
    protected StopFactorRequest.BankSvcRq bankSvcRq;

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
     *     {@link StopFactorRequest.BankSvcRq }
     *     
     */
    public StopFactorRequest.BankSvcRq getBankSvcRq() {
        return bankSvcRq;
    }

    /**
     * Sets the value of the bankSvcRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopFactorRequest.BankSvcRq }
     *     
     */
    public void setBankSvcRq(StopFactorRequest.BankSvcRq value) {
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
        protected StopFactorRequest.BankSvcRq.OrgInfo orgInfo;

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
         *     {@link StopFactorRequest.BankSvcRq.OrgInfo }
         *     
         */
        public StopFactorRequest.BankSvcRq.OrgInfo getOrgInfo() {
            return orgInfo;
        }

        /**
         * Sets the value of the orgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link StopFactorRequest.BankSvcRq.OrgInfo }
         *     
         */
        public void setOrgInfo(StopFactorRequest.BankSvcRq.OrgInfo value) {
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

    }

}
