package Replit;

import java.util.Scanner;

public class StringManipulations095 {
    /*
       Using Scanner class input string value.
   Print out the following: "The first 3 letters of \_\_\_ is ___"
   For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
        */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        String newstr=str.substring(0,3);
        System.out.println("The first 3 letters of "+str+" is "+newstr);


    }
}
