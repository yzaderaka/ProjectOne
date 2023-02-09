package Replit;

public class VariablesInJava126 {
    static int numberOfCars;

    public VariablesInJava126() {

        numberOfCars++;
    }
    public static void main(String[] args) {
        VariablesInJava126 car1 = new VariablesInJava126();
        VariablesInJava126 car2 = new VariablesInJava126();
        VariablesInJava126 car3 = new VariablesInJava126();

        System.out.println("Результат: " + VariablesInJava126.numberOfCars);
    }
}
