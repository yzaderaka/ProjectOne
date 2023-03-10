package Replit.AbstractClass171;

public class Main extends Parent{
    /*
    Create a Parent Class that will have two overloaded abstract methods m1
    Make Main class as concrete subclass to Parent Class
    In main method call the methods.
    **Expected Output:**
    m1 without parameters
    m1 method with parameter
     */
    public static void main(String[] args) {
        Main obj=new Main();
        obj.m1();
        obj.m1(true);
    }

    @Override
    void m1() {
        System.out.println("m1 without parameters");
    }

    @Override
    void m1(boolean b) {
        System.out.println("m1 method with parameter");
    }

}
abstract class Parent {
    abstract void m1();
    abstract void m1(boolean b);
}
