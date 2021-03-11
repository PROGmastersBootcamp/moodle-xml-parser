package com.progmasters.mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import java.math.BigInteger;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.progmasters.mypackage package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Feedback_QNAME = new QName("", "feedback");
    private final static QName _Single_QNAME = new QName("", "single");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Text_QNAME = new QName("", "text");
    private final static QName _Tag_QNAME = new QName("", "tag");
    private final static QName _Answernumbering_QNAME = new QName("", "answernumbering");
    private final static QName _Shuffleanswers_QNAME = new QName("", "shuffleanswers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.progmasters.mypackage
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Quiz }
     */
    public Quiz createQuiz() {
        return new Quiz();
    }

    /**
     * Create an instance of {@link Question }
     */
    public Question createQuestion() {
        return new Question();
    }

    /**
     * Create an instance of {@link Text }
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Questiontext }
     */
    public Questiontext createQuestiontext() {
        return new Questiontext();
    }

    /**
     * Create an instance of {@link Tags }
     */
    public Tags createTags() {
        return new Tags();
    }

    /**
     * Create an instance of {@link Answer }
     */
    public Answer createAnswer() {
        return new Answer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "feedback")
    public JAXBElement<Text> createFeedback(Text value) {
        return new JAXBElement<Text>(_Feedback_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "single")
    public JAXBElement<Boolean> createSingle(Boolean value) {
        return new JAXBElement<Boolean>(_Single_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "name")
    public JAXBElement<Text> createName(Text value) {
        return new JAXBElement<Text>(_Name_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "text")
    public JAXBElement<String> createText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "tag")
    public JAXBElement<Text> createTag(Text value) {
        return new JAXBElement<Text>(_Tag_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "answernumbering")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAnswernumbering(String value) {
        return new JAXBElement<String>(_Answernumbering_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "shuffleanswers")
    public JAXBElement<BigInteger> createShuffleanswers(BigInteger value) {
        return new JAXBElement<BigInteger>(_Shuffleanswers_QNAME, BigInteger.class, null, value);
    }

}
