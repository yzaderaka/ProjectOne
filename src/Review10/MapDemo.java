package Review10;

import java.util.*;


public class MapDemo {
    public static void main(String[] args) {

        Map<String, Double> grocery=new HashMap<>();
        // Key + Value = Entry object
        grocery.put("Milk",5.99);
        grocery.put("Eggs", 6.50);
        grocery.put("Bread", 2.99);
        grocery.put("Tea", 4.99);
        grocery.put("Coffee", 4.99);
        grocery.put("Cucumber", 2.50);
        grocery.put("Tomato", 2.29);
        grocery.put("Eggs", 6.50);

        double teaPrice=grocery.get("Tea");
        System.out.println(teaPrice);

        System.out.println(grocery);

        int size= grocery.size();
        System.out.println("Number of entry objects "+size);

        Map<String, Double> lmap=new LinkedHashMap<>();
        // Key + Value = Entry object
        lmap.putAll(grocery);

        System.out.println("Order is preserved "+lmap);

        Map<String, Double> tmap=new TreeMap<>();
        tmap.putAll(grocery);
        tmap.putAll(lmap);
        System.out.println("Size = "+tmap.size());
        System.out.println(tmap);
    }
}
