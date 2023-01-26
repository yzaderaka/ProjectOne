package Class14;

import java.util.Scanner;

public class MathTester {
    public static void main(String[] args) {
        Math math = new Math();
        math.add(10,10);
        math.multiply(5,5,5);
        //Scanner sc=new Scanner(System.in);
        //int num=sc.nextInt();
        int result= math.sub(100,50);
        System.out.println(result);
    }
}
