package Replit.MethodOverriding165;

public class Main {
    /*
    Parent class create 4 methods with different level of access modifiers.
    In each method print "I am parent public/protected/default/private method".
    Override methods in child class
    In Main Class create object of the child class and see which methods are available
    **Expected Output:**
    I am a child public method
    I am a child protected method
    I am a child default method
     */
    public static void main(String[] args) {
        Child child=new Child();
        child.m1();
        child.m2();
        child.m3();
    }
}
