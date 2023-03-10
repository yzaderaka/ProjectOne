package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Lava");
        words.add("Computer");
        var c = 's'; // it does not work in java 9 and below
        var name = "asdasdafdas"; // it does not work in java 9 and below
        var d = 10.5f; // it does not work in java 9 and below
        /*
        it works from java 6 java 19
        while (iterator.hasNext()){
            String s= iterator.next();
            if (s.endsWith("a")){
                iterator.remove();
            }
        }
        the same
         */
        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);
        words.removeIf(i -> i.endsWith("a"));
    }
}
