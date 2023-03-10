package Class32;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileDemo {
    public static void main(String[] args) throws IOException {

        String path ="Files/testdata.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet2=xssfWorkbook.getSheet("Sheet2");
        int numOfRows=sheet2.getPhysicalNumberOfRows();
        System.out.println(numOfRows);

        for (int i = 0; i <numOfRows; i++) {
            var row=sheet2.getRow(i);
            //System.out.println(row.getCell(0)+" "+row.getCell(1));
            int numOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j < numOfCells; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }


    }
}
