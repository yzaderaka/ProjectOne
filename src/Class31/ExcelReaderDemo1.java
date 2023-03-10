package Class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo1 {
    public static void main(String[] args) throws IOException {
        // location of file in the computer
        String path = "Files/testdata.xlsx";
        // navigating to the file
        FileInputStream fileInputStream = new FileInputStream(path);
        // It`s a class that know how to read and write data to an Excel files
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        //
        Sheet sheet1 = xssfWorkbook.getSheet("Sheet1");
        /*
        as we are inserted in the row 1 we pass 1 inside the getrow method rows and columns
        are indexed based just like arrays
         */
        Row row = sheet1.getRow(1);
        Cell cell = row.getCell(1);
        System.out.println(cell);

    }
}
