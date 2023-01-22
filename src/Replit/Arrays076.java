package Replit;

import java.util.Scanner;

public class Arrays076 {
    public static void main(String[] args) {
        /*
        Write a program that creates a String array with size 7.
        Ask the user to input Days of a week beginning with Sunday using Scanner class.
        Add these inputs to your array and then print all values from that array
         */
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[8];

        for (int i = 1; i <8; i++) {
            System.out.println("Please enter day "+i+" of the week");
            arr[i] = scanner.nextLine();
        }
        for (int j = 1; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}