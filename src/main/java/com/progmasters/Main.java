package com.progmasters;

import com.progmasters.service.XmlParser;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public class Main {

    public static final String QUESTIONS_XLSX = "src/main/resources/questions.xlsx";
    public static final String OUTPUT_XML_FILENAME = "questions.xml";

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        new XmlParser().process(QUESTIONS_XLSX, OUTPUT_XML_FILENAME);
    }

}
