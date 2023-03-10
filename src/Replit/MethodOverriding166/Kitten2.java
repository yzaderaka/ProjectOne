package Replit.MethodOverriding166;

public class Kitten2 extends Cat {
    Kitten2(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("kitten2 eats snacks");
    }

    @Override
    public void sleep() {
        System.out.println("kitten2 sleeps a lot");
    }
}

