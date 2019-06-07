
package com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.response;

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
 *         &lt;element name="BankSvcRs">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{}RequestId" minOccurs="0"/>
 *                   &lt;element ref="{}OrgId" minOccurs="0"/>
 *                   &lt;element ref="{}ExtOrgId" minOccurs="0"/>
 *                   &lt;element name="StopList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="StopRec" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="StopId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="StopDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
public class StopFactorResponse {

    @XmlElement(name = "ServerInfo", required = true)
    protected ServerInfoType serverInfo;
    @XmlElement(name = "BankSvcRs", required = true)
    protected StopFactorResponse.BankSvcRs bankSvcRs;

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
     *     {@link StopFactorResponse.BankSvcRs }
     *     
     */
    public StopFactorResponse.BankSvcRs getBankSvcRs() {
        return bankSvcRs;
    }

    /**
     * Sets the value of the bankSvcRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopFactorResponse.BankSvcRs }
     *     
     */
    public void setBankSvcRs(StopFactorResponse.BankSvcRs value) {
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
     *         &lt;element ref="{}ExtOrgId" minOccurs="0"/>
     *         &lt;element name="StopList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="StopRec" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="StopId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="StopDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        @XmlElement(name = "ExtOrgId")
        protected String extOrgId;
        @XmlElement(name = "StopList")
        protected StopFactorResponse.BankSvcRs.StopList stopList;
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
         * Gets the value of the stopList property.
         * 
         * @return
         *     possible object is
         *     {@link StopFactorResponse.BankSvcRs.StopList }
         *     
         */
        public StopFactorResponse.BankSvcRs.StopList getStopList() {
            return stopList;
        }

        /**
         * Sets the value of the stopList property.
         * 
         * @param value
         *     allowed object is
         *     {@link StopFactorResponse.BankSvcRs.StopList }
         *     
         */
        public void setStopList(StopFactorResponse.BankSvcRs.StopList value) {
            this.stopList = value;
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
         *       &lt;sequence>
         *         &lt;element name="StopRec" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="StopId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="StopDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "stopRec"
        })
        public static class StopList {

            @XmlElement(name = "StopRec", required = true)
            protected List<StopFactorResponse.BankSvcRs.StopList.StopRec> stopRec;

            /**
             * Gets the value of the stopRec property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stopRec property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStopRec().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StopFactorResponse.BankSvcRs.StopList.StopRec }
             * 
             * 
             */
            public List<StopFactorResponse.BankSvcRs.StopList.StopRec> getStopRec() {
                if (stopRec == null) {
                    stopRec = new ArrayList<StopFactorResponse.BankSvcRs.StopList.StopRec>();
                }
                return this.stopRec;
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
             *         &lt;element name="StopId" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="StopDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            public static class StopRec {

                @XmlElement(name = "StopId", required = true)
                protected String stopId;
                @XmlElement(name = "StopDesc", required = true)
                protected String stopDesc;

                /**
                 * Gets the value of the stopId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStopId() {
                    return stopId;
                }

                /**
                 * Sets the value of the stopId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStopId(String value) {
                    this.stopId = value;
                }

                /**
                 * Gets the value of the stopDesc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStopDesc() {
                    return stopDesc;
                }

                /**
                 * Sets the value of the stopDesc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStopDesc(String value) {
                    this.stopDesc = value;
                }

            }

        }

    }

}
