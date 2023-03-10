package Class30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1, "Yaroslav");
        studentsMap.put(2, "Victoria");
        studentsMap.put(3, "Boris");
        studentsMap.put(4, "Nina");
        studentsMap.put(5, "Tonya");

        Set<Integer> keys= studentsMap.keySet();
        keys.removeIf(x->x>2);
        System.out.println(studentsMap);






    }
}
