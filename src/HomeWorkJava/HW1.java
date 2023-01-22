package HomeWorkJava;


import java.util.Scanner;

public class HW1 {


    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Value is even");
            if (number > 1000) {
                System.out.println("The value is large");
            } else {
                System.out.println("Even value just right");
            }


        }


    }


}