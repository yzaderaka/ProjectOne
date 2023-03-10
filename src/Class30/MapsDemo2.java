package Class30;

import java.util.HashMap;

public class MapsDemo2 {
    public static void main(String[] args) {

        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Orange", 2.99);
        fruit.put("Banana", 4.99);
        fruit.put("Kiwi", 0.99);
        fruit.put("Apple", 3.99);
        System.out.println(fruit);

        HashMap<String,Double> makeUp=new HashMap<>();
        makeUp.put("lipstick",50.0);
        makeUp.put("foundation",40.0);
        makeUp.put("mascara",70.0);
        makeUp.put("eyeliner", 12.2);
        makeUp.put("blush-on", 12.2);

        HashMap<String,Double> groceries=new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(makeUp);
        System.out.println(groceries);
    }
}
