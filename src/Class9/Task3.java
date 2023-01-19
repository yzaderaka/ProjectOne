package Class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two numbers starting point and ending point");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        System.out.println("Start "+start+" End "+end);
        for (int i = start; i <=end; i++) {
                if (i%2==0){
                    System.out.println("Even numbers "+i);
            }else {
                    System.out.println("Odd numbers "+i);
                }

        }
    }
}
