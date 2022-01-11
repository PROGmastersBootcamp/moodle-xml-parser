package com.progmasters.service.xmlParserDeps.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Created by magyar-attila-317 on 2021. 03. 11.
*/
public class ExcelLoader {

    public List<ExcelRow> loadData(InputStream inputStream) {
        try {
            Workbook workbook;
            workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            return iterateRows(sheet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private List<ExcelRow> iterateRows(Sheet sheet) {
        List<ExcelRow> data = new ArrayList<>();
        int i = 1;
        Row row = sheet.getRow(i);
        while (row != null && row.getCell(0) != null && !row.getCell(0).toString().isEmpty()) {

            int col = 0;
            data.add(ExcelRow.builder()
                    .context(getStringCellValue(row, col))
                    .category(getStringCellValue(row, ++col))
                    .subCategory(getStringCellValue(row, ++col))

                    .questionTitle(getStringCellValue(row, ++col))
                    .questionType(getStringCellValue(row, ++col))
                    .questionSingle(getStringCellValue(row, ++col))
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

                    .answer5(getStringCellValue(row, ++col))
                    .fraction5(getDoubleValue(row, ++col))

                    .answer6(getStringCellValue(row, ++col))
                    .fraction6(getDoubleValue(row, ++col))

                    .answer7(getStringCellValue(row, ++col))
                    .fraction7(getDoubleValue(row, ++col))

                    .tag1(getStringCellValue(row, ++col))
                    .tag2(getStringCellValue(row, ++col))
                    .tag3(getStringCellValue(row, ++col))
                    .tag4(getStringCellValue(row, ++col))
                    .build());

            i++;
            row = sheet.getRow(i);

        }

        return data;
    }

    private int getDoubleValue(Row row, int col) {
        Cell cell = row.getCell(col);
        if (cell != null) {
            if (CellType.STRING.equals(cell.getCellType())) {
                try {
                    Double value = Double.parseDouble(cell.getStringCellValue());
                    int intValue = (int) Math.floor(value);
                    return intValue;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            return (int) Math.floor(cell.getNumericCellValue());
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
