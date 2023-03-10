package Class31;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo3 {
    public static void main(String[] args) {

        LinkedHashMap<String, String> doc1 = new LinkedHashMap<>();
        doc1.put("Name", "Yaroslav");
        doc1.put("age", "38");
        doc1.put("City", "Kyiv");
        doc1.put("salary", "80000");

        LinkedHashMap<String, String> doc2 = new LinkedHashMap<>();
        doc2.put("Name", "Boris");
        doc2.put("age", "64");
        doc2.put("City", "RudeSelo");
        doc2.put("salary", "40000");

        LinkedHashMap<String, String> doc3 = new LinkedHashMap<>();
        doc3.put("Name", "Nina");
        doc3.put("age", "61");
        doc3.put("City", "RudeSelo");
        doc3.put("salary", "5000");

        List<Map<String, String>> allDocs = new ArrayList<>();
        allDocs.add(doc1);
        allDocs.add(doc2);
        allDocs.add(doc3);

        System.out.println(allDocs);

    }
}
