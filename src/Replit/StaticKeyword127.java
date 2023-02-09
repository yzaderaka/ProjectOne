package Replit;

public class StaticKeyword127 {
    /*
    Create two methods:
    The first method should be a non-static method that will print out the following message:
    "Programming is amazing."
    The second method should be a static method that will print out the following message:
    "Java is awesome."
    Execute both methods
    **Expected Output:**
    Programming is amazing.
    Java is awesome.

     */
    void print1(){
        System.out.println("Programming is amazing.");
    }
    static void print2(){
        System.out.println("Java is awesome.");
    }

    public static void main(String[] args) {
        StaticKeyword127 obj=new StaticKeyword127();
        obj.print1();
        StaticKeyword127.print2();
    }
}
