package com.progmasters;

import com.progmasters.excel.ExcelLoader;
import com.progmasters.excel.ExcelRow;
import com.progmasters.quiz.*;
import com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/*
    Created by magyar-attila-317 on 2021. 03. 11.   
*/
public class Main {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Quiz quiz = createQuiz(new ExcelLoader().loadData(65));

        JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");

        CdataCharacterEscapeHandler value = new CdataCharacterEscapeHandler();
        marshaller.setProperty(CharacterEscapeHandler.class.getName(), value);
        OutputStream os = new FileOutputStream("questions.xml");
        marshaller.marshal(quiz, os);
    }

    public static Quiz createQuiz(List<ExcelRow> excelRows) {
        List<Question> collect = new ArrayList<>();
        for (ExcelRow excelRow : excelRows) {
            Question question = new Question();
            question.setType("category");
            String categoryPath = excelRow.getContext();
            String category = excelRow.getCategory();
            if (category != null && !category.isEmpty()) {
                categoryPath += "/" + category;
                String subCategory = excelRow.getSubCategory();
                if (subCategory != null && !subCategory.isEmpty()) {
                    categoryPath += "/" + subCategory;
                }
            }
            question.setName(new Text(categoryPath));
            collect.add(question);
            collect.add(questionBuilder(excelRow));
        }

        Quiz q = new Quiz();
        q.getQuestion().addAll(collect);
        return q;
    }

    public static Question questionBuilder(ExcelRow excelRow) {

        ArrayList<Answer> answer = new ArrayList<>();

        answer.add(new Answer(excelRow.getAnswer1(), null, excelRow.getFraction1()));
        answer.add(new Answer(excelRow.getAnswer2(), null, excelRow.getFraction2()));
        answer.add(new Answer(excelRow.getAnswer3(), null, excelRow.getFraction3()));
        answer.add(new Answer(excelRow.getAnswer4(), null, excelRow.getFraction4()));

        ArrayList<Text> tags = new ArrayList<>();

        String tag1 = excelRow.getTag1();
        if (tag1 != null && !tag1.isEmpty()) {
            tags.add(new Text(tag1));
        }
        String tag2 = excelRow.getTag2();
        if (tag2 != null && !tag2.isEmpty()) {
            tags.add(new Text(tag2));
        }
        String tag3 = excelRow.getTag3();
        if (tag3 != null && !tag3.isEmpty()) {
            tags.add(new Text(tag3));
        }
        String tag4 = excelRow.getTag4();
        if (tag4 != null && !tag4.isEmpty()) {
            tags.add(new Text(tag4));
        }

        return Question.builder()
                       .name(new Text(excelRow.getQuestionTitle()))
                       .questiontext(Questiontext
                                             .builder()
                                             .format(excelRow.getQuestionTextType())
                                             .text(excelRow.getQuestionText())
                                             .build())
                       .tags(Tags.builder()
                                 .tag(tags)
                                 .build())
                       .answer(answer)
                       .type(excelRow.getQuestionType())
                       .build();

    }

}
