package com.progmasters.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Created by magyar-attila-317 on 2021. 03. 11.   
*/
public class ExcelLoader {

    public static final String QUESTIONS_XLSX = "src/main/resources/questions.xlsx";

    public List<ExcelRow> loadData(int rows) {
        try {
            FileInputStream file = new FileInputStream(QUESTIONS_XLSX);
            Workbook workbook;
            workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            return iterateRows(sheet, rows);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private List<ExcelRow> iterateRows(Sheet sheet, int rows) {
        List<ExcelRow> data = new ArrayList<>();
        for (int i = 1; i < rows; i++) {
            Row row = sheet.getRow(i);
            if (row != null) {
                int col = 0;
                data.add(ExcelRow.builder()
                                 .context(getStringCellValue(row, col))
                                 .category(getStringCellValue(row, ++col))
                                 .subCategory(getStringCellValue(row, ++col))

                                 .questionTitle(getStringCellValue(row, ++col))
                                 .questionType(getStringCellValue(row, ++col))
                                 .questionText(getStringCellValue(row, ++col))
                                 .questionTextType(getStringCellValue(row, ++col))

                                 .answer1(getStringCellValue(row, ++col))
                                 .fraction1(getDoubleValue(row, ++col))

                                 .answer2(getStringCellValue(row, ++col))
                                 .fraction2(getDoubleValue(row, ++col))

                                 .answer3(getStringCellValue(row, ++col))
                                 .fraction3(getDoubleValue(row, ++col))

                                 .answer4(getStringCellValue(row, ++col))
                                 .fraction4(getDoubleValue(row, ++col))

                                 .tag1(getStringCellValue(row, ++col))
                                 .tag2(getStringCellValue(row, ++col))
                                 .tag3(getStringCellValue(row, ++col))
                                 .tag4(getStringCellValue(row, ++col))
                                 .build());
            }
        }
        return data;
    }

    private int getDoubleValue(Row row, int col) {
        Cell cell = row.getCell(col);
        if (cell != null) {
            return (int) cell.getNumericCellValue();
        } else {
            return 0;
        }
    }

    private String getStringCellValue(Row row, int col) {
        try {
            Cell cell = row.getCell(col);

            if (cell != null) {
                cell.setCellType(CellType.STRING);
                return cell.getStringCellValue();
            } else {
                return "";
            }
        } catch (IllegalStateException e) {
            System.out.println("Current Row:" + row.getRowNum() + "Current cell: " + col);
            e.printStackTrace();
        }
        return "";
    }

}
