package Class4;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Are you ready for your holidays");
        boolean ready= input.hasNextBoolean();
        System.out.println("we are ready for holidays "+ready);
    }
}
