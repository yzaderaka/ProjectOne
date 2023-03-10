package Class32;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo1 {
    public static void main(String[] args) throws IOException {

        String path = "Files/testdata.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet2 = xssfWorkbook.getSheet("Sheet2");
        int numOfRows = sheet2.getPhysicalNumberOfRows();
        System.out.println(numOfRows);

        List<Map<String, String>> excelData = new ArrayList<>();

        for (int i = 1; i < numOfRows; i++) {
            var row = sheet2.getRow(i);
            LinkedHashMap<String, String> rowMap = new LinkedHashMap<>();
            rowMap.put("Username", row.getCell(0).toString());
            rowMap.put("Password", row.getCell(0).toString());
            excelData.add(rowMap);
        }
        System.out.println(excelData);
    }


}

