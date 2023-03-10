package Class24;

public abstract class Animal {
    int age;
    abstract void speak();
    void sleep(){
        System.out.println("Animal sleeping");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Woof woof");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow meow");
    }
}
