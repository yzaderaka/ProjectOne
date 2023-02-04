package Replit;

public class VariablesInJava121 {
    /*
    For you to do:
    declare 3 instance variables to hold an integer, double and char values.
    Create 2 instances of the class and assign values to variables and the print them
    **Expected Output:**
    10
    10.23
    a
    100
    100.23
    s
     */
    int num;
    double number;
    char symbol;

    public static void main(String[] args) {
        VariablesInJava121 obj1=new VariablesInJava121();
        VariablesInJava121 obj2=new VariablesInJava121();
        obj1.num=10;
        obj1.number=10.23;
        obj1.symbol='a';
        obj2.num=100;
        obj2.number=100.23;
        obj2.symbol='s';
        System.out.println(obj1.num);
        System.out.println(obj1.number);
        System.out.println(obj1.symbol);
        System.out.println(obj2.num);
        System.out.println(obj2.number);
        System.out.println(obj2.symbol);
    }

}
