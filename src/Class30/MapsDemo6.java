package Class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo6 {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1, "Yaroslav");
        studentsMap.put(2, "Victoria");
        studentsMap.put(3, "Boris");
        studentsMap.put(4, "Nina");
        studentsMap.put(5, "Tonya");

        Collection<String> values=studentsMap.values();
        System.out.println(values);
        // remove all values which contain the letter i

        values.removeIf(x->x.contains("i"));
        System.out.println(values);


    }
}
