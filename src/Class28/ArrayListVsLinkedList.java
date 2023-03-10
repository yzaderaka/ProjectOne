package Class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        //LinkedList for 1million times loop =>350ms
        //Arraylist for 1 million times loop =>95733ms
        long startTime=System.currentTimeMillis();
        LinkedList<String> numbers=new LinkedList<>();
        for (int i = 0; i <500000; i++) {
            numbers.add(0,"Test Data");
        }
        //System.out.println(numbers);
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);

        long startTime1=System.currentTimeMillis();
        ArrayList<String> numbers1=new ArrayList<>();
        for (int i = 0; i <500000; i++) {
            numbers1.add(0,"Test Data");
        }
        //System.out.println(numbers1);
        long endTime1=System.currentTimeMillis();
        System.out.println(endTime1-startTime1);
    }
}
