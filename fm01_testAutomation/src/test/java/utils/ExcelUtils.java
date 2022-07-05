package utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {

    public static int rowNumber = 0;

    FileInputStream exlFile;
    XSSFWorkbook excelWorkbook;
    XSSFSheet dataSheet;

    public ExcelUtils(String filePath) throws IOException {
        exlFile = new FileInputStream(filePath);
        excelWorkbook = new XSSFWorkbook(exlFile);
    }

    public Integer getRowCount(String sheetName) {
        dataSheet = excelWorkbook.getSheet(sheetName);
        return dataSheet.getLastRowNum();
    }

    public List<String> getRowData(Integer rowNo) {
//        rowNumber = rowNo;
        List<String> userData = new ArrayList<String>();
        XSSFRow dataRow = dataSheet.getRow(rowNo);
        int lastColumnNo = dataRow.getLastCellNum();
        for (int i = 0; i < lastColumnNo; i++) {
            XSSFCell dataCell = dataRow.getCell(i);
            userData.add(dataCell.toString());
        }
        return userData;
    }


}
