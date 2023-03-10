package Class32;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo3 {
    public static void main(String[] args) throws IOException {
        List<Map<String, String>> excelData = ExcelReader.read();
        //var excelData = ExcelReader.read(); the same just with var
        for (Map<String,String> row: excelData){
            for (Map.Entry<String,String> entry: row.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println("***************");
        }
    }
}
