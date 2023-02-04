package Replit;

public class VariablesInJava124 {
    /*
    Declare static variable in class level as below and assign its value:
    String ss="Welcome To Syntax Technologies"
    Access variable in the main method and print it using three ways you learned so far
    Hint:
    first way: By calling directly
    Second way: By using the className
    Third way: By creating the object of the class
    **Expected Output:**
    Welcome To Syntax Technologies
    Welcome To Syntax Technologies
    Welcome To Syntax Technologies
     */
    static String ss="Welcome To Syntax Technologies";

    public static void main(String[] args) {
        VariablesInJava124 obj=new VariablesInJava124();
        System.out.println(ss);
        String str=VariablesInJava124.ss;
        System.out.println(str);
        System.out.println(obj.ss);
    }
}
