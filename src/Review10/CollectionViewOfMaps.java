package Review10;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CollectionViewOfMaps {
    public static void main(String[] args) {

        Map<String, Double> grocery = new LinkedHashMap<>();
        grocery.put("Milk", 5.99);
        grocery.put("Eggs", 6.50);
        grocery.put("Bread", 2.99);
        grocery.put("Tea", 4.99);
        grocery.put("Coffee", 4.99);
        grocery.put("Cucumber", 2.50);
        grocery.put("Tomato", 2.29);
        grocery.put("Eggs", 6.50);

        Set<String> keys = grocery.keySet();

        for (String key : keys) {
            System.out.print(key + " ");
        }

        System.out.println();
        System.out.println("-------------------------------------------------------------------");

        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

    }
}
