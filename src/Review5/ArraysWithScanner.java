package Review5;

import java.util.Scanner;

public class ArraysWithScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many names you want to store");
        int size= scan.nextInt();
        String[] name=new String[size];
        for (int i = 0; i < name.length; i++) {
            System.out.println("Please enter name");
            name[i]= scan.next();
        }
    }
}
