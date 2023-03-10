package Replit.MethodOverriding166;

public class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps a lot");
    }

    public void eats() {
        System.out.println("Cat eats");
    }
}
