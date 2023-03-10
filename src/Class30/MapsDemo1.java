package Class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1, "Yaroslav");
        studentsMap.put(2, "Victoria");
        studentsMap.put(3, "Boris");
        studentsMap.put(4, "Aisha");

        System.out.println(studentsMap.get(3));
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.containsKey(3));
        System.out.println(studentsMap.containsValue("Yaroslav"));
        System.out.println(studentsMap.remove(1));
        System.out.println(studentsMap);
        studentsMap.replace(2, "Antonina");
        System.out.println(studentsMap);

    }
}
