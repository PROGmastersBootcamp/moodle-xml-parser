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
 *         &lt;element ref="{}tag" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         propOrder = {
                 "tag"
         })
@XmlRootElement(name = "tags")
@Generated(value = "com.sun.tools.internal.xjc.Driver",
           date = "2021-03-11T06:00:19+01:00",
           comments = "JAXB RI v2.2.8-b130911.1802")
public class Tags {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Text> tag;

    public Tags() {
    }

    public Tags(List<Text> tag) {
        this.tag = tag;
    }

    public static TagsBuilder builder() {
        return new TagsBuilder();
    }

    /**
     * Gets the value of the tag property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Text> getTag() {
        if (tag == null) {
            tag = new ArrayList<Text>();
        }
        return this.tag;
    }

    public static class TagsBuilder {

        private List<Text> tag;

        TagsBuilder() {
        }

        public TagsBuilder tag(List<Text> tag) {
            this.tag = tag;
            return this;
        }

        public Tags build() {
            return new Tags(tag);
        }

        public String toString() {
            return "Tags.TagsBuilder(tag=" + this.tag + ")";
        }

    }

}
