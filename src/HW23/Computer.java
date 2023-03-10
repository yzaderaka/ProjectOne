package HW23;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
    int price;
    double size;
    boolean backlitKeyboard;
    int coresCPU;
    int ram;

    public void palyingGames() {
        System.out.println("is good for games");
    }

    public void writeCode() {
        System.out.println("is good for write a code");
    }

    public void upgrade() {
        System.out.println("Can be upgraded");
    }
}
class Apple extends Computer{
    @Override
    public void palyingGames() {
        System.out.println("is bad for games");
    }

    @Override
    public void writeCode() {
        super.writeCode();
    }

    @Override
    public void upgrade() {
        System.out.println("Can not be upgraded");
    }
}
