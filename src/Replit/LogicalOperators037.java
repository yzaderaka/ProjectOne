package Replit;

import java.util.Scanner;

public class LogicalOperators037 {
    public static void main(String[] args) {
        /*
        Take 2 boolean inputs from a user:
        "Are you thirsty?"
        "Are you sleepy?"
        If user is thirsty and not sleepy--> drink=water
        If user is thirsty and sleepy--> drink=coffee
        If user is not thirsty and sleepy --> drink=tea
        Otherwise drink="nothing"

        Output: Looks like you need to drink \_\_\_
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean drink = sc.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleep = sc.nextBoolean();
        if (drink && !sleep) {
            System.out.println("Looks like you need to drink water");
        }
        if (drink && sleep) {
            System.out.println("Looks like you need to drink coffee");
        }
        if (!drink && sleep) {
            System.out.println("Looks like you need to drink tea");
        }
        if (!drink && !sleep)
            System.out.println("Looks like you need to drink nothing");
    }


}

