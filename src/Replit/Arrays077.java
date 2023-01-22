package Replit;

import java.util.Scanner;

public class Arrays077 {

    public static void main(String[] args) {
        /*
        Create an array of integers that will store 5 elements taken from a user
        Don't print any prompt message for the user
        Then print out all the elements you have created in the first loop in reverse order.
         */
        int [] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <6; i++) {
            arr[i]= scanner.nextInt();
        }
        for (int i = arr.length-1; i>0; i--) {
            System.out.println(arr[i]);
        }
    }
}
