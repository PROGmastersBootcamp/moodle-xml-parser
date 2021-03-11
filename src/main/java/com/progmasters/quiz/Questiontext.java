package com.progmasters.quiz;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}text">
 *       &lt;attribute name="format" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "questiontext")
@Generated(value = "com.sun.tools.internal.xjc.Driver",
           date = "2021-03-11T06:00:19+01:00",
           comments = "JAXB RI v2.2.8-b130911.1802")
public class Questiontext extends Text {

    @XmlAttribute(name = "format",
                  required = true)
    @XmlSchemaType(name = "anySimpleType")
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    protected String format;

    public Questiontext() {
    }

    public Questiontext(String text, String format) {
        super(text);
        this.format = format;
    }

    public Questiontext(String format) {
        this.format = format;
    }

    public static QuestiontextBuilder builder() {
        return new QuestiontextBuilder();
    }

    /**
     * Gets the value of the format property.
     *
     * @return possible object is
     * {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFormat(String value) {
        this.format = value;
    }

    @Override
    public String getText() {
        return super.getText();
    }

    @Override
    public void setText(String value) {
        super.setText(value);
    }

    public static class QuestiontextBuilder {

        private String text;
        private String format;

        QuestiontextBuilder() {
        }

        public QuestiontextBuilder text(String text) {
            this.text = text;
            return this;
        }

        public QuestiontextBuilder format(String format) {
            this.format = format;
            return this;
        }

        public Questiontext build() {
            return new Questiontext(text, format);
        }

        public String toString() {
            return "Questiontext.QuestiontextBuilder(text=" + this.text + ", format=" + this.format + ")";
        }

    }

}
