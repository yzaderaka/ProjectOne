package Class29;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {

        HashSet<String> fruit=new HashSet<>(); //does not allow duplicate values and it does not maintain insertion order
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        System.out.println(fruit);
    }
}
