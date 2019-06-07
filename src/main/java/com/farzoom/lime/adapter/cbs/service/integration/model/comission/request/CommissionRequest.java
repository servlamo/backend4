
package com.farzoom.lime.adapter.cbs.service.integration.model.comission.request;

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
 *                   &lt;element ref="{}AgreemtNum"/>
 *                   &lt;element name="FeeStatus">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="FeeStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element ref="{}StatusDesc" minOccurs="0"/>
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
public class CommissionRequest {

    @XmlElement(name = "ServerInfo", required = true)
    protected ServerInfoType serverInfo;
    @XmlElement(name = "BankSvcRq", required = true)
    protected CommissionRequest.BankSvcRq bankSvcRq;

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
     *     {@link CommissionRequest.BankSvcRq }
     *     
     */
    public CommissionRequest.BankSvcRq getBankSvcRq() {
        return bankSvcRq;
    }

    /**
     * Sets the value of the bankSvcRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionRequest.BankSvcRq }
     *     
     */
    public void setBankSvcRq(CommissionRequest.BankSvcRq value) {
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
     *         &lt;element ref="{}AgreemtNum"/>
     *         &lt;element name="FeeStatus">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="FeeStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element ref="{}StatusDesc" minOccurs="0"/>
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
        @XmlElement(name = "AgreemtNum", required = true)
        protected String agreemtNum;
        @XmlElement(name = "FeeStatus", required = true)
        protected CommissionRequest.BankSvcRq.FeeStatus feeStatus;

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
         * Gets the value of the agreemtNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgreemtNum() {
            return agreemtNum;
        }

        /**
         * Sets the value of the agreemtNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgreemtNum(String value) {
            this.agreemtNum = value;
        }

        /**
         * Gets the value of the feeStatus property.
         * 
         * @return
         *     possible object is
         *     {@link CommissionRequest.BankSvcRq.FeeStatus }
         *     
         */
        public CommissionRequest.BankSvcRq.FeeStatus getFeeStatus() {
            return feeStatus;
        }

        /**
         * Sets the value of the feeStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommissionRequest.BankSvcRq.FeeStatus }
         *     
         */
        public void setFeeStatus(CommissionRequest.BankSvcRq.FeeStatus value) {
            this.feeStatus = value;
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
         *         &lt;element name="FeeStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element ref="{}StatusDesc" minOccurs="0"/>
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
        public static class FeeStatus {

            @XmlElement(name = "FeeStatusCode", required = true)
            protected String feeStatusCode;
            @XmlElement(name = "StatusDesc")
            protected String statusDesc;

            /**
             * Gets the value of the feeStatusCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeeStatusCode() {
                return feeStatusCode;
            }

            /**
             * Sets the value of the feeStatusCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeeStatusCode(String value) {
                this.feeStatusCode = value;
            }

            /**
             * Gets the value of the statusDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatusDesc() {
                return statusDesc;
            }

            /**
             * Sets the value of the statusDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatusDesc(String value) {
                this.statusDesc = value;
            }

        }

    }

}
