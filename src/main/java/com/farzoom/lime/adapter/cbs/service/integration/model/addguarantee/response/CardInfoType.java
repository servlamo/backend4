
package com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: информация по карте
 * 
 * <p>Java class for CardInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{}HashPAN" minOccurs="0"/>
 *           &lt;element ref="{}MaskPAN" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{}CardId" minOccurs="0"/>
 *         &lt;element ref="{}AcctId" minOccurs="0"/>
 *         &lt;element ref="{}CardActualStatus" minOccurs="0"/>
 *         &lt;element ref="{}CardStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfo_Type", propOrder = {
    "hashPAN",
    "maskPAN",
    "cardId",
    "acctId",
    "cardActualStatus",
    "cardStatus"
})
public class CardInfoType {

    @XmlElement(name = "HashPAN")
    protected String hashPAN;
    @XmlElement(name = "MaskPAN")
    protected String maskPAN;
    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "CardActualStatus")
    protected CardActualStatus cardActualStatus;
    @XmlElement(name = "CardStatus")
    protected CardStatus cardStatus;

    /**
     * Gets the value of the hashPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashPAN() {
        return hashPAN;
    }

    /**
     * Sets the value of the hashPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashPAN(String value) {
        this.hashPAN = value;
    }

    /**
     * Gets the value of the maskPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskPAN() {
        return maskPAN;
    }

    /**
     * Sets the value of the maskPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskPAN(String value) {
        this.maskPAN = value;
    }

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the cardActualStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CardActualStatus }
     *     
     */
    public CardActualStatus getCardActualStatus() {
        return cardActualStatus;
    }

    /**
     * Sets the value of the cardActualStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardActualStatus }
     *     
     */
    public void setCardActualStatus(CardActualStatus value) {
        this.cardActualStatus = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatus }
     *     
     */
    public CardStatus getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatus }
     *     
     */
    public void setCardStatus(CardStatus value) {
        this.cardStatus = value;
    }

}
