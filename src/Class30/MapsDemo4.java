package Class30;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> makeUp = new HashMap<>();
        makeUp.put("lipstick", 50.0);
        makeUp.put("foundation", 40.0);
        makeUp.put("mascara", 70.0);
        makeUp.put("eyeliner", 12.2);
        makeUp.put("blush-on", 12.2);

        Set<String> allKeys = makeUp.keySet();
        //Delete all the entries from map for which the size of key is greater than 7
        allKeys.removeIf(x -> x.length() > 7);
        System.out.println(makeUp);
        System.out.println(allKeys);

    }
}
