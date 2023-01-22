package Replit;

import java.util.Scanner;

public class LogicalOperators036 {
    public static void main(String[] args) {
        /*
        Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"
        and make the comparisons:

        - if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
        - if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
        - if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE"

        **Example input/output:**
        word1: banana
        word2: banana
        int1: 2
        int2: 2
        Output: AND
        word1: banana
        word2: apple
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two words");
        String word1= sc.nextLine();
        String word2= sc.nextLine();
        System.out.println("Please enter two numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        if (num1==num2&&word1.equals(word2)){
            System.out.println("AND");
        }else if (num1==num2||word1.equals(word2)){
            System.out.println("OR");
        }else if (num1!=num2||word1.equalsIgnoreCase(word2)){
            System.out.println("NONE");
        }
    }
}
