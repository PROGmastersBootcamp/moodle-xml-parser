
package mypackage;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Quiz }
     * 
     */
    public Quiz createQuiz() {
        return new Quiz();
    }

    /**
     * Create an instance of {@link Quiz.Question }
     * 
     */
    public Quiz.Question createQuizQuestion() {
        return new Quiz.Question();
    }

    /**
     * Create an instance of {@link Quiz.Question.Answer }
     * 
     */
    public Quiz.Question.Answer createQuizQuestionAnswer() {
        return new Quiz.Question.Answer();
    }

    /**
     * Create an instance of {@link Quiz.Question.Tags }
     * 
     */
    public Quiz.Question.Tags createQuizQuestionTags() {
        return new Quiz.Question.Tags();
    }

    /**
     * Create an instance of {@link Quiz.Question.Name }
     * 
     */
    public Quiz.Question.Name createQuizQuestionName() {
        return new Quiz.Question.Name();
    }

    /**
     * Create an instance of {@link Quiz.Question.Questiontext }
     * 
     */
    public Quiz.Question.Questiontext createQuizQuestionQuestiontext() {
        return new Quiz.Question.Questiontext();
    }

    /**
     * Create an instance of {@link Quiz.Question.Category }
     * 
     */
    public Quiz.Question.Category createQuizQuestionCategory() {
        return new Quiz.Question.Category();
    }

    /**
     * Create an instance of {@link Quiz.Question.Answer.Feedback }
     * 
     */
    public Quiz.Question.Answer.Feedback createQuizQuestionAnswerFeedback() {
        return new Quiz.Question.Answer.Feedback();
    }

    /**
     * Create an instance of {@link Quiz.Question.Tags.Tag }
     * 
     */
    public Quiz.Question.Tags.Tag createQuizQuestionTagsTag() {
        return new Quiz.Question.Tags.Tag();
    }

}
