package Replit;

import java.util.Scanner;

public class StringManipulations104 {
    /*
    Create an array of names that will hold 5 String elements.
    Names must be taking from a user.
    Print out the first three characters of each element of the array, one per line.
    Note: every array element must be at least 3 characters long.
    Input Example:
    John
    Jane
    Jimmy
    Mike
    Emily
    Expected Output:
    **Joh**
    **Jan**
    **Jim**
    **Mik**
    **Emi**
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr=new String[5];
        for (int i = 0; i <5; i++) {
            arr[i]= sc.nextLine();

        }
        for (int i = 0; i <5; i++) {
            System.out.println("**"+arr[i].substring(0,3)+"**");
        }
    }
}
