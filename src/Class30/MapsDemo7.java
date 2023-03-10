package Class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapsDemo7 {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1, "Yaroslav");
        studentsMap.put(2, "Victoria");
        studentsMap.put(3, "Boris");
        studentsMap.put(4, "Nina");
        studentsMap.put(5, "Tonya");
        Set<Entry<Integer,String>> entrySet =studentsMap.entrySet();

        for (Entry<Integer,String> entry: entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }



    }
}
