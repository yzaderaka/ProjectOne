package Replit;

public class VariablesInJava123 {
    /*
    Declare the **instance** variables to hold:
    - integer values
    - String values
    - double values
    - boolean values
    - float values
    Access instance variables and then print them all without assigning any values to them.
    Print variables one by one the same sequence that you declare them.
    **Expected Output:**
    0
    null
    0.0
    false
    0.0
     */
    int num;
    String str;
    double db;
    boolean ft;
    float flt;

    public static void main(String[] args) {
        VariablesInJava123 obj=new VariablesInJava123();
        System.out.println(obj.num);
        System.out.println(obj.str);
        System.out.println(obj.db);
        System.out.println(obj.ft);
        System.out.println(obj.flt);
    }
}
