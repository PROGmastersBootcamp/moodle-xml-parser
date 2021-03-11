package com.progmasters.quiz;

import com.progmasters.Adapter1;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for text complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="text">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "text",
         propOrder = {
                 "text"
         })
@XmlSeeAlso({
                    Answer.class,
                    Questiontext.class
            })
@Generated(value = "com.sun.tools.internal.xjc.Driver",
           date = "2021-03-11T06:00:19+01:00",
           comments = "JAXB RI v2.2.8-b130911.1802")
public class Text {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    @XmlJavaTypeAdapter(Adapter1.class)
    public String text;

    public Text(String text) {
        this.text = text;
    }

    public Text() {
    }

    /**
     * Gets the value of the text property.
     *
     * @return possible object is
     * {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public void setText(String value) {
        this.text = value;
    }

}
