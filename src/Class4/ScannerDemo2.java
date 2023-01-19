package Class4;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {

        //Below line helps us get the input from keyboard
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age");
        int age= input.nextInt();
        System.out.println("Your are "+age+" years old");
    }
}

