package Replit;

import java.util.Scanner;

public class LogicalOperators038 {
    /*
    Prompt user with a question: "Is it weekend?"
    If it is not a weekend --> subject="manual testing"
    Otherwise --> subject="Java"

    **Output**: Today you will be learning ____
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Is it the weekend?");
        boolean weekend = input.nextBoolean();

        if (weekend) {
            System.out.println("Today you will be learning Java");

        }else{
            System.out.println("Today you will be learning manual testing");}



    }
}
