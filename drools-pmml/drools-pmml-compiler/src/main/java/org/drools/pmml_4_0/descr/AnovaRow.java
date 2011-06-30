//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.30 at 10:54:04 AM GMT-03:00 
//


package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Model"/>
 *             &lt;enumeration value="Error"/>
 *             &lt;enumeration value="Total"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="sumOfSquares" use="required" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="degreesOfFreedom" use="required" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="meanOfSquares" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="fValue" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="pValue" type="{http://www.dmg.org/PMML-4_0}PROB-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensions"
})
@XmlRootElement(name = "AnovaRow")
public class AnovaRow
    implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlAttribute(required = true)
    protected String type;
    @XmlAttribute(required = true)
    protected double sumOfSquares;
    @XmlAttribute(required = true)
    protected double degreesOfFreedom;
    @XmlAttribute
    protected Double meanOfSquares;
    @XmlAttribute
    protected Double fValue;
    @XmlAttribute
    protected BigDecimal pValue;

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<Extension>();
        }
        return this.extensions;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the sumOfSquares property.
     * 
     */
    public double getSumOfSquares() {
        return sumOfSquares;
    }

    /**
     * Sets the value of the sumOfSquares property.
     * 
     */
    public void setSumOfSquares(double value) {
        this.sumOfSquares = value;
    }

    /**
     * Gets the value of the degreesOfFreedom property.
     * 
     */
    public double getDegreesOfFreedom() {
        return degreesOfFreedom;
    }

    /**
     * Sets the value of the degreesOfFreedom property.
     * 
     */
    public void setDegreesOfFreedom(double value) {
        this.degreesOfFreedom = value;
    }

    /**
     * Gets the value of the meanOfSquares property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeanOfSquares() {
        return meanOfSquares;
    }

    /**
     * Sets the value of the meanOfSquares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeanOfSquares(Double value) {
        this.meanOfSquares = value;
    }

    /**
     * Gets the value of the fValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFValue() {
        return fValue;
    }

    /**
     * Sets the value of the fValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFValue(Double value) {
        this.fValue = value;
    }

    /**
     * Gets the value of the pValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPValue() {
        return pValue;
    }

    /**
     * Sets the value of the pValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPValue(BigDecimal value) {
        this.pValue = value;
    }

}
