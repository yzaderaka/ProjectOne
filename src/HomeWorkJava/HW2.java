package HomeWorkJava;



import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = scanner.nextBoolean();
        if (loan) {
            System.out.println("What is your credit score?");
            int score = scanner.nextInt();
            if (score < 600) {
                System.out.println("Not eligible");
            }
            if (score >= 600 && score <= 700) {
                System.out.println("Maybe eligible");
            }
            if (score >= 701 && score <= 800) {
                System.out.println("Eligible");
            }
            if (score > 800) {
                System.out.println("Definitely eligible");
            }


        } else {
            System.out.println("Unknown");
        }
    }
}