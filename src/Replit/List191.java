package Replit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List191 {
    /*
    Create an ArrayList of type boolean called listA and add below values
    (true, false, false)
    Create another array list call listB and ad all values from List A into it
    Using iterator print all values from ListB 1 by 1
    **Expected Output:**
    true
    false
    false
     */
    public static void main(String[] args) {
        ArrayList<Boolean> listA=new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);
        List<Boolean> listB=listA;

        Iterator<Boolean> iterator= listB.iterator();
        while (iterator.hasNext()) {
            boolean number=iterator.next();
            System.out.println(number);
        }

    }
}
