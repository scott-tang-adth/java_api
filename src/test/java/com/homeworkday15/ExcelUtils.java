package com.homeworkday15;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.CDATASection;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

public class ExcelUtils {
    @Test(dataProvider = "read")
    public void ReadExcel(String url,String params){
        System.out.println("url = " + url + ", params = " + params);
    }

    @DataProvider
    public static Object[][] read() throws Exception {
        //1、加载excel 文件  LINUX WINDOW
        String path = ExcelUtils.class.getClassLoader().getResource("./cases_v1.xls").getPath();
//        String path = "java19_auto_api_v2/src/test/resources/cases_v1.xls";
        //String path = "src/test/resources/cases_v1.xls";
        FileInputStream fis = new FileInputStream(path);
        //2、创建excel对象
        Workbook execl = WorkbookFactory.create(fis);
        //3、Sheet、Row、Cell
        Sheet sheet = execl.getSheetAt(0);
//        boolean flag = true;
        //循环所有row
        Object[][] datas = new Object[sheet.getLastRowNum()][2];
        int lastRowNum = sheet.getLastRowNum();
        for (int i = 1; i <= lastRowNum; i++) {
            Row row = sheet.getRow(i);
            //获取最大列号，从0开始，长度结束
            int lastCellNum = row.getLastCellNum();
            for (int j = 0; j < lastCellNum; j++) {
                Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                cell.setCellType(CellType.STRING);
                if(j==2){
                    String cellValue = cell.getStringCellValue();
                    datas[i-1][j-2] = cellValue;
                }
                else if(j==5){
                    String cellValue = cell.getStringCellValue();
                    datas[i-1][j-4] = cellValue;
                }
            }
        }
        fis.close();
        return datas;
    }
}
