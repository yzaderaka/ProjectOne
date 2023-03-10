package Replit.AbstractClass173;

public class Main {
    /*
    Create a Super Class Tea that will have:
    - instance variable teaType;
    - constructor that will initialize
    - unimplemented method addSugar(),
    Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
    In main class create an object of 2 Child and assign them to Parent reference type.
    Execute method addSugar from both classes.

    **Expected Output:**
    For Lemon Tea we need 2 spoons of sugar
    For Chai Tea we need 1 spoon of sugar
     */
    public static void main(String[] args) {
        LemonTea lemonTea=new LemonTea();
        ChaiTea chaiTea=new ChaiTea();
        lemonTea.addSugar();
        chaiTea.addSugar();
    }
}

abstract class Tea {
    String teaType;

    Tea() {
    }

    abstract void addSugar();
}
class LemonTea extends Tea{

    @Override
    void addSugar() {
        System.out.println("For Lemon Tea we need 2 spoons of sugar");
    }
}
class ChaiTea extends Tea{
    @Override
    void addSugar() {
        System.out.println("For Chai Tea we need 1 spoon of sugar");
    }
}
