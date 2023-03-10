package Replit;

public class Inheritance150 {
    /*
    Create four classes (Person, Employee, Student, Retiree)
    * Have properties

    For Person: name(String)
    For Person: lastName(String)
    For Person: age(int)
    For Employee: salary(int)
    For Student: grade(int)
    For Retiree: seniorActivity(String)

    At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output
    Create multilevel inheritance: Person --> Employee --> Student --> Retiree
    From your Main class create objects of the Employee, Student and Retiree classes and call the print method.

    **Expected Output:**
    Joe Smith 35 35000
    Adam Smith 15 10
    Frank Smith 15 tour
     */
    public static void main(String[] args) {
        Employee employee=new Employee();
        Student student=new Student();
        Retiree retiree=new Retiree();
        employee.display("Joe", "Smith", 35,35000);
        student.display("Adam","Smith",15,10);
        retiree.display("Frank","Smith", 15, "tour");
    }
}
class  Person{
    String name;
    String lastName;
    int age;
}
class Employee extends Person{
    int salary;
    public void display (String name, String lastName, int age, int salary){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class Student extends Employee{
    int grade;
    public void display(String name, String lastName, int age, int grade){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}
class Retiree extends Student{
    String seniorActivity;
    void display(String name, String lastName, int age, String seniorActivity){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}
