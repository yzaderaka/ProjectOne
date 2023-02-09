package Class19;

public class Furniture {
    String type;
    double price;
    String color;

    Furniture(String type, String color, double price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    void print() {
        System.out.println(type + " prise is " + price + " and color is " + color);
    }
}
