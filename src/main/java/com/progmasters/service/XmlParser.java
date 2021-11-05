package com.progmasters.service;

import com.progmasters.service.xmlParserDeps.CdataCharacterEscapeHandler;
import com.progmasters.service.xmlParserDeps.excel.ExcelLoader;
import com.progmasters.service.xmlParserDeps.excel.ExcelRow;
import com.progmasters.service.xmlParserDeps.quiz.*;
import com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class XmlParser {

    public byte[] process(CommonsMultipartFile commonsMultipartFile) throws IOException, JAXBException {
        String sourceFilePath = System.getProperty("java.io.tmpdir") + '/' + commonsMultipartFile.getOriginalFilename();
        File fileToUpload = new File(sourceFilePath);
        commonsMultipartFile.transferTo(fileToUpload);
        return convertFile(fileToUpload);
    }

    public void process(String inputFilePath, String outputFileName) throws JAXBException, FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(inputFilePath);
        OutputStream os = new FileOutputStream(outputFileName);
        Quiz quiz = createQuiz(new ExcelLoader().loadData(fileInputStream));
        createXmlFromData(quiz, os);
    }

    public byte[] process(File file) throws JAXBException, IOException {
        return convertFile(file);
    }

    private byte[] convertFile(File fileToUpload) throws JAXBException, IOException {
        String currentDate = LocalDate.now().toString();
        String resultFileName = "result" + currentDate;
        OutputStream os = new FileOutputStream(resultFileName);
        Quiz quiz = createQuiz(new ExcelLoader().loadData(new FileInputStream(fileToUpload)));
        createXmlFromData(quiz, os);
        File tempFile = File.createTempFile(resultFileName, ".xml");
        return FileUtils.readFileToByteArray(tempFile);
    }


    private void createXmlFromData(Quiz quiz, OutputStream os) throws JAXBException, FileNotFoundException {
        JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

        CdataCharacterEscapeHandler value = new CdataCharacterEscapeHandler();
        marshaller.setProperty(CharacterEscapeHandler.class.getName(), value);
        marshaller.marshal(quiz, os);
    }

    private Quiz createQuiz(List<ExcelRow> excelRows) {
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

    private Question questionBuilder(ExcelRow excelRow) {

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
