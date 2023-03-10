package Replit;

import java.util.ArrayList;
import java.util.Scanner;

public class List188 {
    /*
    Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line

    Numbers in:
    4
    62
    8
    5
    4
    **Expected Output:**
    4 62 8 5 4
     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();

        for (int i = 1; i <=5; i++) {
            arrayList.add(scanner.nextInt());
        }
        for (Integer i: arrayList){
            System.out.print(i+" ");
        }
    }
}
