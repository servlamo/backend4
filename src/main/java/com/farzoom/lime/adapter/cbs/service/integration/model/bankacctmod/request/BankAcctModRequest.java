//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 09:44:50 AM EET 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.request;

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
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="CustInfo">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;all>
 *                               &lt;element ref="{}CustId"/>
 *                             &lt;/all>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="OrgInfo">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;all>
 *                               &lt;element ref="{}OrgId"/>
 *                             &lt;/all>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="BankAcctId" type="{}BankAcctId_Type"/>
 *                   &lt;element ref="{}BankAcctStatus"/>
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
@XmlRootElement(name = "FDX")
public class BankAcctModRequest {

    @XmlElement(name = "ServerInfo", required = true)
    protected ServerInfoType serverInfo;
    @XmlElement(name = "BankSvcRq", required = true)
    protected BankAcctModRequest.BankSvcRq bankSvcRq;

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
     *     {@link BankAcctModRequest.BankSvcRq }
     *     
     */
    public BankAcctModRequest.BankSvcRq getBankSvcRq() {
        return bankSvcRq;
    }

    /**
     * Sets the value of the bankSvcRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctModRequest.BankSvcRq }
     *     
     */
    public void setBankSvcRq(BankAcctModRequest.BankSvcRq value) {
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
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="CustInfo">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;all>
     *                     &lt;element ref="{}CustId"/>
     *                   &lt;/all>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="OrgInfo">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;all>
     *                     &lt;element ref="{}OrgId"/>
     *                   &lt;/all>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="BankAcctId" type="{}BankAcctId_Type"/>
     *         &lt;element ref="{}BankAcctStatus"/>
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
        "custInfo",
        "orgInfo",
        "bankAcctId",
        "bankAcctStatus"
    })
    public static class BankSvcRq {

        @XmlElement(name = "CustInfo")
        protected BankAcctModRequest.BankSvcRq.CustInfo custInfo;
        @XmlElement(name = "OrgInfo")
        protected BankAcctModRequest.BankSvcRq.OrgInfo orgInfo;
        @XmlElement(name = "BankAcctId", required = true)
        protected BankAcctIdType bankAcctId;
        @XmlElement(name = "BankAcctStatus", required = true)
        protected BankAcctStatusType bankAcctStatus;

        /**
         * Gets the value of the custInfo property.
         * 
         * @return
         *     possible object is
         *     {@link BankAcctModRequest.BankSvcRq.CustInfo }
         *     
         */
        public BankAcctModRequest.BankSvcRq.CustInfo getCustInfo() {
            return custInfo;
        }

        /**
         * Sets the value of the custInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankAcctModRequest.BankSvcRq.CustInfo }
         *     
         */
        public void setCustInfo(BankAcctModRequest.BankSvcRq.CustInfo value) {
            this.custInfo = value;
        }

        /**
         * Gets the value of the orgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link BankAcctModRequest.BankSvcRq.OrgInfo }
         *     
         */
        public BankAcctModRequest.BankSvcRq.OrgInfo getOrgInfo() {
            return orgInfo;
        }

        /**
         * Sets the value of the orgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankAcctModRequest.BankSvcRq.OrgInfo }
         *     
         */
        public void setOrgInfo(BankAcctModRequest.BankSvcRq.OrgInfo value) {
            this.orgInfo = value;
        }

        /**
         * Gets the value of the bankAcctId property.
         * 
         * @return
         *     possible object is
         *     {@link BankAcctIdType }
         *     
         */
        public BankAcctIdType getBankAcctId() {
            return bankAcctId;
        }

        /**
         * Sets the value of the bankAcctId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankAcctIdType }
         *     
         */
        public void setBankAcctId(BankAcctIdType value) {
            this.bankAcctId = value;
        }

        /**
         * Gets the value of the bankAcctStatus property.
         * 
         * @return
         *     possible object is
         *     {@link BankAcctStatusType }
         *     
         */
        public BankAcctStatusType getBankAcctStatus() {
            return bankAcctStatus;
        }

        /**
         * Sets the value of the bankAcctStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankAcctStatusType }
         *     
         */
        public void setBankAcctStatus(BankAcctStatusType value) {
            this.bankAcctStatus = value;
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
         *         &lt;element ref="{}CustId"/>
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
        public static class CustInfo {

            @XmlElement(name = "CustId", required = true)
            protected String custId;

            /**
             * Gets the value of the custId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustId() {
                return custId;
            }

            /**
             * Sets the value of the custId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustId(String value) {
                this.custId = value;
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
         *         &lt;element ref="{}OrgId"/>
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

            @XmlElement(name = "OrgId", required = true)
            protected String orgId;

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

        }

    }

}
