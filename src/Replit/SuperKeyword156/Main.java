package Replit.SuperKeyword156;

public class Main {
    /*
    Create class A
    declare variable int i=10;
    Create class B  extends A
    declare variable int i=20;
    create a method to display value of variable i from both classes
    In Main Class create an object of subclass and call method display
    **Expected Output:**
    20
    10
     */
    public static void main(String[] args) {
        B obj=new B();
        obj.display();
    }
}
