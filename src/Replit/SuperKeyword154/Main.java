package Replit.SuperKeyword154;

public class Main {
    /*
    In Parent Class.
    Create a no-argument constructor and include the logic to print "Parent Constructor without argument"
    Create another constructor that takes one parameter of integer type called number.
    Include the logic to print the value of the number.
    In Child class.
    Create a Constructor without parameter and include the logic to print "Child Constructor without argument"
    Overload the constructor by adding one parameter of type integer
    Inside the constructor call the parameterized parent class constructor.
    In Main Class.
    Create an object of Child without passing any argument.
    And then another object of Child class by passing the value "10". run the application.

    **Expected Output:**
    Parent Constructor without argument
    Child Constructor without argument
    10
     */
    public static void main(String[] args) {
        Child child1=new Child();
        Child child2=new Child(10);
    }
}
