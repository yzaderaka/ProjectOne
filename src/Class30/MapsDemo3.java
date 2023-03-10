package Class30;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo3 {
    /*
    Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map
     */
    public static void main(String[] args) {

        HashMap<String, Integer> building = new HashMap<>();
        building.put("Google", 1);
        building.put("Syntax", 2);
        building.put("Tesla", 3);
        building.put("Amazon", 4);
        building.put("Google", 5);
        building.put("Syntax",6);
        building.put("Space X", 7);
        System.out.println(building);
        System.out.println(building.size());
        building.put("Apple",4);
        System.out.println(building);
        building.remove(7);
        System.out.println(building);
        System.out.println("**********************");
        Set<String> allKeys=building.keySet();
        System.out.println(allKeys);

    }
}
