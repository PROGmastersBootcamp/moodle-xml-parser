package com.progmasters.excel;

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

    private String answer1;
    private int fraction1;

    private String answer2;
    private int fraction2;

    private String answer3;
    private int fraction3;

    private String answer4;
    private int fraction4;

    private String tag1;
    private String tag2;
    private String tag3;
    private String tag4;

}
