package Replit.AbstractClass172;

public class Main extends Parent {
    /*
    Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1
    Make Main class to be a derived class from Parent.
    In main method execute both methods
    **Expected Output:**
    Child class providing implementation
    Parent class providing implementation
     */

    @Override
    void m1() {
        System.out.println("Child class providing implementation");
    }

    public static void main(String[] args) {
        Main obj=new Main();
        obj.m1();
        obj.m2();
    }
}

abstract class Parent {
    void m2(){
        System.out.println("Parent class providing implementation");
    }
    abstract void m1();
}
