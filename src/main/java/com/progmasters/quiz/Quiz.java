package com.progmasters.quiz;

import javax.annotation.Generated;
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
 *       &lt;sequence>
 *         &lt;element ref="{}question" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         propOrder = {
                 "question"
         })
@XmlRootElement(name = "quiz")
@Generated(value = "com.sun.tools.internal.xjc.Driver",
           date = "2021-03-11T06:00:19+01:00",
           comments = "JAXB RI v2.2.8-b130911.1802")
public class Quiz {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Question> question;

    /**
     * Gets the value of the question property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the question property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestion().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Question }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Question> getQuestion() {
        if (question == null) {
            question = new ArrayList<Question>();
        }
        return this.question;
    }

}
