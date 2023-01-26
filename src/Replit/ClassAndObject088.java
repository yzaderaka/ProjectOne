package Replit;

public class ClassAndObject088 {
    String breed;
    String name;
    String color;

    void bark(){
        System.out.println("bark");
    }
    void run(){
        System.out.println("run");
    }
    void play(){
        System.out.println("play");
    }

    public static void main(String[] args) {
        ClassAndObject088 dog1=new ClassAndObject088();
        ClassAndObject088 dog2=new ClassAndObject088();
        ClassAndObject088 dog3=new ClassAndObject088();

        dog1.breed="Husky";
        dog2.breed="Bulldog";
        dog3.breed="Labrador";

        System.out.print(dog1.breed+" can ");
        dog1.bark();
        System.out.print(dog1.breed+" can ");
        dog1.run();
        System.out.print(dog1.breed+" can ");
        dog1.play();
        System.out.print(dog2.breed+" can ");
        dog2.bark();
        System.out.print(dog2.breed+" can ");
        dog2.run();
        System.out.print(dog2.breed+" can ");
        dog2.play();
        System.out.print(dog3.breed+" can ");
        dog3.bark();
        System.out.print(dog3.breed+" can ");
        dog3.run();
        System.out.print(dog3.breed+" can ");
        dog3.play();
    }
}
