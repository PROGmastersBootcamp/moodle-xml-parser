package com.progmasters.controller;

import com.progmasters.service.XmlParser;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.time.LocalDate;

@RestController
public class XmlParserController {

    private XmlParser xmlParser;

    @Autowired
    public XmlParserController(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }


    @PostMapping(value = "/process", produces = "application/xml")
    public void convert(@RequestParam("file") @NotNull CommonsMultipartFile file, HttpServletResponse response) throws IOException, JAXBException {
        String currentDate = LocalDate.now().toString();
        String resultFileName = file.getOriginalFilename() + "-" + currentDate + ".xml";
        response.setContentType("application/xml");
        response.setHeader("Content-Disposition", "attachment; filename=" + resultFileName);
        xmlParser.process(file, response.getOutputStream());
        response.flushBuffer();
    }


}
