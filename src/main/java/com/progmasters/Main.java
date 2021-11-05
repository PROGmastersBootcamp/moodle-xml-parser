package com.progmasters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@SpringBootApplication
@EnableWebMvc
public class Main {

    public static final String QUESTIONS_XLSX = "src/main/resources/questions.xlsx";
    public static final String OUTPUT_XML_FILENAME = "questions.xml";

    public static void main(String[] args) throws JAXBException, IOException {
        SpringApplication.run(Main.class, args);
//        new XmlParser().process(QUESTIONS_XLSX, OUTPUT_XML_FILENAME);
//        byte[] resultData = new XmlParser().process(new File(QUESTIONS_XLSX));
//        File file = new File("result1234.xml");
//        FileOutputStream fos = new FileOutputStream(file);
//        fos.write(resultData);
    }

    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver getCommonsMultipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(20971520);   // 20MB
        multipartResolver.setMaxInMemorySize(1048576);  // 1MB
        return multipartResolver;
    }

}
