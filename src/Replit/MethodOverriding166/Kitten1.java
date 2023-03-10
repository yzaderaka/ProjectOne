package Replit.MethodOverriding166;

public class Kitten1 extends Cat{

    Kitten1(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("kitten1 eats milk");
    }

    @Override
    public void sleep() {
        System.out.println("kitten1 sleeps a lot");
    }
}
