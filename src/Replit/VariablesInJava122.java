package Replit;

public class VariablesInJava122 {
    /*
    Declare 3 instance variables to hold:
    - name of the country
    - capital
    - population size
    Create a method to display values of instance variables
    Create 2 Object, assign values to instance variables, execute method display;
    **Expected Output:**
    The capital of USA is Washington DC and population is 330000000
    The capital of Kazakhstan is Astana and population is 18500000
     */
    String country;
    String capital;
    long population;

    void display() {
        System.out.println("The capital of " + country + " is " + capital + " and population is " + population);
    }

    public static void main(String[] args) {
        VariablesInJava122 obj1 = new VariablesInJava122();
        VariablesInJava122 obj2 = new VariablesInJava122();
        obj1.country = "USA";
        obj1.capital="Washington DC";
        obj1.population=330000000;
        obj2.country="Kazakhstan";
        obj2.capital="Astana";
        obj2.population=18500000;
        obj1.display();
        obj2.display();
    }
}
