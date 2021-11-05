package com.progmasters.service.xmlParserDeps.quiz;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}text">
 *       &lt;sequence>
 *         &lt;element ref="{}feedback"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fraction" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         propOrder = {
                 "feedback"
         })
@XmlRootElement(name = "answer")
@Generated(value = "com.sun.tools.internal.xjc.Driver",
           date = "2021-03-11T06:00:19+01:00",
           comments = "JAXB RI v2.2.8-b130911.1802")
public class Answer extends Text {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    protected Text feedback;
    @XmlAttribute(name = "fraction",
                  required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    protected int fraction;

    public Answer(String text, Text feedback, int fraction) {
        super(text);
        this.feedback = feedback;
        this.fraction = fraction;
    }

    public Answer(Text feedback, int fraction) {
        this.feedback = feedback;
        this.fraction = fraction;
    }

    public Answer() {
    }

    /**
     * Gets the value of the feedback property.
     *
     * @return possible object is
     * {@link Text }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public Text getFeedback() {
        return feedback;
    }

    /**
     * Sets the value of the feedback property.
     *
     * @param value allowed object is
     *              {@link Text }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFeedback(Text value) {
        this.feedback = value;
    }

    /**
     * Gets the value of the fraction property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public int getFraction() {
        return fraction;
    }

    /**
     * Sets the value of the fraction property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFraction(int value) {
        this.fraction = value;
    }

    @Override
    public String getText() {
        return super.getText();
    }

    @Override
    public void setText(String value) {
        super.setText(value);
    }

}
