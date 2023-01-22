package Review4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //while loop
        // we use it when we don`t know how many times we wanna repeat a block of code
        int a=1;
        while (a<-3){
            System.out.println("I am while loop");
            a++;
        }
        int b=1;
        do {
            System.out.println("do while");
            b++;
        }while (b>=3);
        // ask student if they understand loops?
        // if they don`t --> tell them to practice more on loops
        // if they understand --> you good move to array concept
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java");
            answer = scanner.nextLine();
        }while (!answer.equalsIgnoreCase("Yes"));
        System.out.println("Great job, let`s learn arrays now");
    }
}
