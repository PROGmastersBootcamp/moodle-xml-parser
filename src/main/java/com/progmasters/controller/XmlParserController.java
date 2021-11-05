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

import javax.xml.bind.JAXBException;
import java.io.IOException;

@RestController
public class XmlParserController {

    private XmlParser xmlParser;

    @Autowired
    public XmlParserController(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }


    @PostMapping("/process")
    public ResponseEntity<byte[]> convert(@RequestParam("file") @NotNull CommonsMultipartFile file) throws IOException, JAXBException {
        byte[] result = xmlParser.process(file);
        return ResponseEntity
                .ok()
                .contentType(MediaType.valueOf("text/xml"))
                .body(result);
    }


}
