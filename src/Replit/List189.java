package Replit;

import java.util.Iterator;
import java.util.LinkedList;

public class List189 {
    /*
    Create a Linked List that will store Integer Objects from 50-100.
    Once Linked List is created remove all numbers that are not divisible by 3.
    Print Linked List
    **Expected Output**
    [51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
     */
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 50; i <= 100; i++) {
            linkedList.add(i);
        }
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            Integer x= iterator.next();
            if(x%3!=0){
                iterator.remove();
            }
        }
        System.out.println(linkedList);
    }
}
