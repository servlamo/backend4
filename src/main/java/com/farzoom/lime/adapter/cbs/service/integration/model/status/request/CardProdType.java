
package com.farzoom.lime.adapter.cbs.service.integration.model.status.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: карточный продукт
 * 
 * <p>Java class for CardProd_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardProd_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}ExtProdName" minOccurs="0"/>
 *         &lt;element ref="{}ProdCode"/>
 *         &lt;element ref="{}ProdName" minOccurs="0"/>
 *         &lt;element name="CardKindInfo" type="{}CardKind_Type" minOccurs="0"/>
 *         &lt;element ref="{}Fee" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardProd_Type", propOrder = {

})
public class CardProdType {

    @XmlElement(name = "ExtProdName")
    protected String extProdName;
    @XmlElement(name = "ProdCode", required = true)
    protected String prodCode;
    @XmlElement(name = "ProdName")
    protected String prodName;
    @XmlElement(name = "CardKindInfo")
    protected CardKindType cardKindInfo;
    @XmlElement(name = "Fee")
    protected Fee fee;

    /**
     * Gets the value of the extProdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtProdName() {
        return extProdName;
    }

    /**
     * Sets the value of the extProdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtProdName(String value) {
        this.extProdName = value;
    }

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

    /**
     * Gets the value of the cardKindInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardKindType }
     *     
     */
    public CardKindType getCardKindInfo() {
        return cardKindInfo;
    }

    /**
     * Sets the value of the cardKindInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardKindType }
     *     
     */
    public void setCardKindInfo(CardKindType value) {
        this.cardKindInfo = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link Fee }
     *     
     */
    public Fee getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fee }
     *     
     */
    public void setFee(Fee value) {
        this.fee = value;
    }

}
