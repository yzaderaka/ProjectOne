package Review7;

public class Car {

    protected String make, model;

    protected int year, horsePower;


    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int year, int horsePower) {
        this(make, model); // making call to the current class constructor
        this.year = year;
        this.horsePower = horsePower;
    }

    public void start() {
        System.out.println(make + " starts");
    }

    public void drive(int speed) {
        System.out.println(make + " drive max speed " + speed);
    }
    //SAME class have 2 or more with same name = Method Overloading

    protected String drive(String destination) {
        System.out.println(make + " drives to " + destination);
        return destination;
    }

    public void drive(int speed, String destination) {
        System.out.println(make + " drive to " + destination + " with speed " + speed);
    }

    // am I overloading?
    //private void drive(int wheel){} NO
    // by changing access modifiers we are not overloading !

}

