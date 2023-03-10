package Replit.MethodOverriding166;

public class Kitten3 extends Cat{
    Kitten3(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("kitten3 eats everything");
    }

    @Override
    public void sleep() {
        System.out.println("kitten3 sleeps a lot");
    }
}
