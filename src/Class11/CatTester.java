package Class11;

public class CatTester {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name="Basco";
        cat1.bread="Scotland";
        cat1.age=2;
        cat1.eat();
        cat1.attitude=false;

        System.out.println();

        Cat cat2= new Cat();
        cat2.name="Loki";
        cat2.bread="Domestic";
        cat2.color="White";

        cat2.speak();
    }
}
