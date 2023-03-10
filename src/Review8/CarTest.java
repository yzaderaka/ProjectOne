package Review8;

import Review7.Car;
import Review7.Tesla;

public class CarTest {
    public static void main(String[] args) {
        Bmw bmw=new Bmw("BMW", "X7");
        bmw.start();
        bmw.drive("smooth");
        bmw.Brake();

        Car car=new Car("SomeCar", "SomeModel");
        car.start();
        car.drive(90);
        Tesla tesla=new Tesla("Tesla", "Plaid",2022,1000, "EV",true);
        tesla.start();
        tesla.haveAutopilot();
        tesla.drive(300);
    }
    // run time polymorphism looks into the object
}
