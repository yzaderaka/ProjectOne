package Class11;

public class Cat {
    String name;
    String color;
    String bread;
    int age;
    Boolean attitude;
    void speak(){
        System.out.println("Meow meow");
    }
    void  eat(){
        System.out.println("Cat is catching mouses");
    }

    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.name="Basco";
        cat1.speak();
    }
}
