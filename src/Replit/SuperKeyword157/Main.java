package Replit.SuperKeyword157;

public class Main {
    /*
    Create a Parent class
    Create  instance method  m1 saying "m1 method in parent class"
    Create a Child class that will be a derived class from Parent
    Create same instance method m1 saying "m1 method in child class"
    Create another method m2 in child class and inside that method call method m1 from child class and method m1 from parents class
    In Main class.
    Create and object of child class and call m2 method

    **Expected Output:**
    m1 method in child class
    m1 method in parent class
     */
    public static void main(String[] args) {
        Child child=new Child();
        child.m2();
    }
}
