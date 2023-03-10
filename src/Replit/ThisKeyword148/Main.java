package Replit.ThisKeyword148;

public class Main {
    public static void main(String[] args) {
        ShoppingStore obj1 = new ShoppingStore("Blanket", 99.98, 1);
        ShoppingStore obj2 = new ShoppingStore("Mattress", 439.18, 1);
        System.out.println(obj1.itemTotalPrice());
        System.out.println(obj2.itemTotalPrice());
        double totalAmount = (obj1.price * obj1.quantity) + (obj2.price * obj2.quantity);
        System.out.println("You purchased " + totalAmount + " Today");
    }
}
