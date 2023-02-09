package HW20;

public class Employee {
    /*
    Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
    Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    Test your code!
     */
    String name;
    String surname;

    Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public void printEmployee() {
        System.out.println("Employee name is " + name + " and surname is " + surname);
    }


}

class FullTime extends Employee {
    int age;
    String gender;
    FullTime(String name, String surname, int age, String gender){
        super(name, surname);
        this.age=age;
        this.gender=gender;


    }
    public void printFullTime(){
        System.out.println("Employee name is "+name+" surname is "+surname+" gender "+gender+" age "+age);
    }
}
class PartTime extends Employee{
    float salary;
    PartTime(String name, String surname, int age, String gender, float salary){
        super(name, surname);
        this.salary=salary;

    }
    public void printPartTime(){
        System.out.println("Employee name is "+name+" surname is "+surname+"and salary is "+salary);
    }

}
class SubClass extends FullTime{
    String car;

    SubClass(String name, String surname, int age, String gender, String car) {
        super(name, surname, age, gender);
        this.car=car;
    }
    public void printSubClass(){
        System.out.println("Employee name is "+name+" surname is "+surname+" age "+age+" gender "+gender+" car "+car);
    }

    public static void main(String[] args) {
        SubClass tester=new SubClass("Yaroslav","Zaderaka",38,"male","mercedes");
        tester.printEmployee();
        tester.printFullTime();
        tester.printSubClass();

    }

}
