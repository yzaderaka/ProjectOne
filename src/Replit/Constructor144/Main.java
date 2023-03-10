package Replit.Constructor144;

public class Main {
    public static void main(String [] args){
        StoreProduct obj1= new StoreProduct("Eggs", 3.0, "Produce", true, 10);
        StoreProduct obj2= new StoreProduct("Paper Towels", 2.0, "misc", false, 24);
        StoreProduct obj3= new StoreProduct("Paper Towels", 2.0, "null", true, 0);
        obj1.display();
        obj2.display();
        obj3.display();

    }
}
