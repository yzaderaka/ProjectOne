package Replit.Constructor142;

public class SyntaxTechnologies {
    /*
    Include the following class variables:

    * schoolName(String)
    * batch(int)
    * year(int)
    * lastDayOfClass(String)

    Write two constructors:
    * non-argument constructor
    * parameterized constructor
    Create method to display values of instance variables.

    **2. In Main Class:**
    Create two different objects of the SyntaxTechnologies class using both constructors and call display method.

    **Expected Output:**
    null 0 0 null
    Syntax 6 2020 07/30/2020
     */
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    SyntaxTechnologies() {

    }

    SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    void display() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }
}
