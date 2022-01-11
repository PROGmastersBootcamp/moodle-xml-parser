package com.progmasters.service.xmlParserDeps.excel;

import lombok.*;

/*
    Created by magyar-attila-317 on 2021. 03. 11.
*/
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ExcelRow {

    private String context;
    private String category;
    private String subCategory;

    private String questionTitle;
    private String questionType;
    private String questionText;
    private String questionTextType;
    private String questionSingle;

    private String answer1;
    private int fraction1;

    private String answer2;
    private int fraction2;

    private String answer3;
    private int fraction3;

    private String answer4;
    private int fraction4;

    private String answer5;
    private int fraction5;

    private String answer6;
    private int fraction6;

    private String answer7;
    private int fraction7;

    private String tag1;
    private String tag2;
    private String tag3;
    private String tag4;

}
