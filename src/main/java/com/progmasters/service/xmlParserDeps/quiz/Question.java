package com.progmasters.service.xmlParserDeps.quiz;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;
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
 *         &lt;element ref="{}name" minOccurs="0"/>
 *         &lt;element ref="{}questiontext"/>
 *         &lt;element ref="{}tags" minOccurs="0"/>
 *         &lt;element ref="{}answer" maxOccurs="unbounded"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}shuffleanswers"/>
 *           &lt;element ref="{}single"/>
 *           &lt;element ref="{}answernumbering"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         propOrder = {
                 "name",
                 "questiontext",
                 "tags",
                 "answer",
                 "shuffleanswers",
                 "single",
                 "answernumbering"
         })
@XmlRootElement(name = "question")
@Generated(value = "com.sun.tools.internal.xjc.Driver",
           date = "2021-03-11T06:00:19+01:00",
           comments = "JAXB RI v2.2.8-b130911.1802")
public class Question {

    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    protected Text name;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    protected Questiontext questiontext;
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    protected Tags tags;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Answer> answer;
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger shuffleanswers;
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean single;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    protected String answernumbering;
    @XmlAttribute(name = "type",
                  required = true)
    @XmlSchemaType(name = "anySimpleType")
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    protected String type;

    public Question(Text name, Questiontext questiontext, Tags tags, List<Answer> answer, BigInteger shuffleanswers, Boolean single, String answernumbering, String type) {
        this.name = name;
        this.questiontext = questiontext;
        this.tags = tags;
        this.answer = answer;
        this.shuffleanswers = shuffleanswers;
        this.single = single;
        this.answernumbering = answernumbering;
        this.type = type;
    }

    public Question() {
    }

    public static QuestionBuilder builder() {
        return new QuestionBuilder();
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link Text }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public Text getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link Text }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(Text value) {
        this.name = value;
    }

    /**
     * Gets the value of the questiontext property.
     *
     * @return possible object is
     * {@link Questiontext }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public Questiontext getQuestiontext() {
        return questiontext;
    }

    /**
     * Sets the value of the questiontext property.
     *
     * @param value allowed object is
     *              {@link Questiontext }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public void setQuestiontext(Questiontext value) {
        this.questiontext = value;
    }

    /**
     * Gets the value of the tags property.
     *
     * @return possible object is
     * {@link Tags }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public Tags getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     *
     * @param value allowed object is
     *              {@link Tags }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTags(Tags value) {
        this.tags = value;
    }

    /**
     * Gets the value of the answer property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the answer property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnswer().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Answer }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Answer> getAnswer() {
        if (answer == null) {
            answer = new ArrayList<Answer>();
        }
        return this.answer;
    }

    /**
     * Gets the value of the shuffleanswers property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getShuffleanswers() {
        return shuffleanswers;
    }

    /**
     * Sets the value of the shuffleanswers property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public void setShuffleanswers(BigInteger value) {
        this.shuffleanswers = value;
    }

    /**
     * Gets the value of the single property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isSingle() {
        return single;
    }

    /**
     * Sets the value of the single property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSingle(Boolean value) {
        this.single = value;
    }

    /**
     * Gets the value of the answernumbering property.
     *
     * @return possible object is
     * {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public String getAnswernumbering() {
        return answernumbering;
    }

    /**
     * Sets the value of the answernumbering property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAnswernumbering(String value) {
        this.answernumbering = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver",
               date = "2021-03-11T06:00:19+01:00",
               comments = "JAXB RI v2.2.8-b130911.1802")
    public void setType(String value) {
        this.type = value;
    }

    public static class QuestionBuilder {

        private Text name;
        private Questiontext questiontext;
        private Tags tags;
        private List<Answer> answer;
        private BigInteger shuffleanswers;
        private Boolean single;
        private String answernumbering;
        private String type;

        QuestionBuilder() {
        }

        public QuestionBuilder name(Text name) {
            this.name = name;
            return this;
        }

        public QuestionBuilder questiontext(Questiontext questiontext) {
            this.questiontext = questiontext;
            return this;
        }

        public QuestionBuilder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        public QuestionBuilder answer(List<Answer> answer) {
            this.answer = answer;
            return this;
        }

        public QuestionBuilder shuffleanswers(BigInteger shuffleanswers) {
            this.shuffleanswers = shuffleanswers;
            return this;
        }

        public QuestionBuilder single(Boolean single) {
            this.single = single;
            return this;
        }

        public QuestionBuilder answernumbering(String answernumbering) {
            this.answernumbering = answernumbering;
            return this;
        }

        public QuestionBuilder type(String type) {
            this.type = type;
            return this;
        }

        public Question build() {
            return new Question(name, questiontext, tags, answer, shuffleanswers, single, answernumbering, type);
        }

        public String toString() {
            return "Question.QuestionBuilder(name=" + this.name + ", questiontext=" + this.questiontext + ", tags=" + this.tags + ", answer=" + this.answer + ", shuffleanswers=" + this.shuffleanswers + ", single=" + this.single + ", answernumbering=" + this.answernumbering + ", type=" + this.type + ")";
        }

    }

}
