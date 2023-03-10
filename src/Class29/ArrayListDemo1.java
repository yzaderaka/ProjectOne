package Class29;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        //Dog dog1=new Dog("Jacky","Persian", 15);
        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("Jacky","Persian", 15));
        dogs.add(new Dog("Jami","German", 12));
        dogs.add(new Dog("Jimmi","Bulldog", 5));
        dogs.add(new Dog("Mami","Persian", 10));
        for ( Dog d: dogs){
            d.printDogName();
        }
    }
}
