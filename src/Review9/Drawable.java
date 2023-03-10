package Review9;

public interface Drawable {
    String TOOL = "Pencil"; // by default in interface public static final variables

    void draw(); // by default this method is asbtract

    default void print() {
        System.out.println("We are drawing object using " + TOOL);
    }

    static void erase() {
        System.out.println("We can erase all drawings are erasable");
    }
}

abstract class Shape {
    String color;
    double width, length;

    Shape(String color, double width, double length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public abstract double  calculateArea();



}

class Rectangle extends Shape implements Drawable {
    Rectangle(String color, double width, double lenght){
        super(color, width, lenght);
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public void draw() {
        System.out.println("I`m drawing rectangle");
    }
}

class Square implements Drawable {
    public void draw() {
        System.out.println("I`m drawing square");
    }

}
