package Class5;

import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        System.in tells the computer we want to read the data from keyboard
         */
        System.out.println("Please enter your age");
        int age= scanner.nextInt();
        System.out.println("You are "+age+ "Years old");

        System.out.println("Enter your weight");
        double weight= scanner.nextDouble();
        System.out.println("Your weight is "+weight+"Kgs");

        System.out.println("Enter your gender");
        char gender= scanner.next() .charAt(0); //char type of input
        System.out.println("your gender is" +gender);
        scanner.close(); // good practice - saving computer memory

    }
}
