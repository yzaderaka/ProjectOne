package Review8;

import Review7.Car;

public class Bmw extends Car {

    Bmw(String make, String model) {
        super(make, model);

    }

    public void start() {
        System.out.println(make + " starts with push start button");
    }

    public String drive(String typeOfDriving) {
        System.out.println(make + " drives " + typeOfDriving);
        return typeOfDriving;
    }
    void Brake(){
        System.out.println(make+" brakes");
    }


}
