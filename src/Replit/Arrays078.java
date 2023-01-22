package Replit;

import java.util.Scanner;

public class Arrays078 {
    public static void main(String[] args) {
        /*
        Create an int array of integers with a size of 5 and input values with Scanner.
        Don't print prompt questions for a user.
        Using loop print out each element of the array that should look like the output below
        Example: User input 1,2,3,4,5. Output 10,20,30,40,50.
         */
        int [] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <6; i++) {
            arr[i]= scanner.nextInt();
        }
        for (int j = 1; j< arr.length; j++) {
            System.out.println(arr[j]*10);
        }

    }
}
