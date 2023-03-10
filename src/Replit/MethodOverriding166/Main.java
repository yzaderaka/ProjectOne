package Replit.MethodOverriding166;

public class Main {
    /*
    Create a class Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.
    Create a subclass Cat in which override method sleep
    Create 3 Kitten subclasses of a Cat class and override method eat
    for 1 kitten - eats milk
    for 2 kitten - eats snack
    for 3 kitten - eats everything
    In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:

    **Expected Output:**
    Cat eats
    Cat sleeps a lot
    kitten1 eats milk
    kitten1 sleeps a lot
    kitten2 eats snacks
    kitten2 sleeps a lot
    kitten3 eats everything
    kitten3 sleeps a lot
     */
    public static void main(String[] args) {
        Cat cat=new Cat("murka",1);
        Kitten1 kitten1=new Kitten1("murka",1);
        Kitten2 kitten2=new Kitten2("murka",1);
        Kitten3 kitten3=new Kitten3("murka",1);
        cat.eats();
        cat.sleep();
        kitten1.eat();
        kitten1.sleep();
        kitten2.eat();
        kitten2.sleep();
        kitten3.eat();
        kitten3.sleep();
    }
}
