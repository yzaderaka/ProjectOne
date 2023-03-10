package Class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        //HashMap<String, Integer> groceries=new HashMap<>();
        //LinkedHashMap<String, Integer> groceries=new LinkedHashMap<>();
        TreeMap<String, Integer> groceries=new TreeMap<>();
        groceries.put("eggs",10);
        groceries.put("milk",5);
        groceries.put("bread",2);
        groceries.put("candy",6);
        groceries.put("rice",7);
        groceries.put("meat",5);

        System.out.println(groceries.get("eggs"));
        System.out.println(groceries);
        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        System.out.println(groceries.values());
        groceries.remove("meat");
        System.out.println(groceries);
    }
}
