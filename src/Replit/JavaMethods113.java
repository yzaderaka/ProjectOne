package Replit;

public class JavaMethods113 {
    /*
    Step1: Create a method that will accept with 2 parameters of integer type
    Step2: Write the logic in that method in println statement to print hours and minutes
    Step3: Call the method
    **Expected Output:**
    11:30
     */
    void printHours(int a, int b) {
        System.out.println(a+":"+b);

    }

    public static void main(String[] args) {
        JavaMethods113 clock=new JavaMethods113();
        clock.printHours(11,30);
    }
}
