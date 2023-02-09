package Replit;

public class VariablesInJava125 {
    /*
    Declare a static variable **number** that will hold an integer value:
    Access **number** from the main method and assign value to it.
    Create an Object of the class, access **number** in a nonstatic way and assing value of 200.
    Print out **number** using class name and using instance
    **Expected Output:**
    200
    200
     */
    static int number;

    static {
        number=200;
    }


    public static void main(String[] args) {
        VariablesInJava125 obj = new VariablesInJava125();
        int num=VariablesInJava125.number;
        System.out.println(number);
        System.out.println(num);

    }
}
