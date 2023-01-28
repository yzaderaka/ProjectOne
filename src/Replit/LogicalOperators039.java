package Replit;

import java.util.Scanner;

public class LogicalOperators039 {
    /*
    A school has following rules for grading system:
    a. 1 to 25 - F
    b. 25 to 45 - E
    c. 45 to 50 - D
    d. 50 to 60 - C
    e. 60 to 80 - B
    f. Above 80 - A
    Ask the user to enter marks and print the corresponding grade.

    **Example Output:**
    Please enter your mark
    Your grade is A

    **Example Output:**
    Please enter your mark
    Please enter valid mark
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your mark");
        int mark= sc.nextInt();
        if (mark>1&&mark<=25){
            System.out.println("Your grade is F");
        }if (mark>25&&mark<=45){
            System.out.println("Your grade is E");
        }if (mark>45&&mark<=50){
            System.out.println("Your grade is D");
        }if (mark>50&&mark<=60){
            System.out.println("Your grade is C");
        }if (mark>60&&mark<=80){
            System.out.println("Your grade is B");
        }if (mark>80){
            System.out.println("Your grade is A");
        }if (mark<=0){
            System.out.println("Please enter valid mark");
        }
    }
}
