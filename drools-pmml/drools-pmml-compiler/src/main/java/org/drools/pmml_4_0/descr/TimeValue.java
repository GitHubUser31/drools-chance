//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.30 at 10:54:04 AM GMT-03:00 
//


package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Timestamp" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="index" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *       &lt;attribute name="time" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="value" use="required" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="standardError" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "timestamp"
})
@XmlRootElement(name = "TimeValue")
public class TimeValue
    implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Timestamp")
    protected Timestamp timestamp;
    @XmlAttribute
    protected BigInteger index;
    @XmlAttribute
    protected Double time;
    @XmlAttribute(required = true)
    protected double value;
    @XmlAttribute
    protected Double standardError;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setTimestamp(Timestamp value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTime(Double value) {
        this.time = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the standardError property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStandardError() {
        return standardError;
    }

    /**
     * Sets the value of the standardError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStandardError(Double value) {
        this.standardError = value;
    }

}
