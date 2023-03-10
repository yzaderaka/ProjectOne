package Class29;

import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {

        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Banana");

        System.out.println(fruit);
    }
}
