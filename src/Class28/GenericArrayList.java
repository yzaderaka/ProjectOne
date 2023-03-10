package Class28;

import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {


        // no one now uses the array like this
        ArrayList names = new ArrayList();
        names.add("Yaroslav");
        names.add(10);
        names.add('Y');
        for (Object j: names){
            System.out.println(j);
        }
    }
}
