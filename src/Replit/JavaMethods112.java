package Replit;

public class JavaMethods112 {
    /*
    1. Create a method in which you will be printing numbers from 1 to 10
    2. Call the method in the main method
    **Expected Output:**
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
     */
    void printNumbers(){
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JavaMethods112 java=new JavaMethods112();
        java.printNumbers();
    }
}
