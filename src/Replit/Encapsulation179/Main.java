package Replit.Encapsulation179;

public class Main {
    /*
    Create Class EncapsulationDemo that will have 2 variables empName and empAge;
    Create the getter/setter methods for each variable.
    In Main Class and main method
    Using setter methods assign the values as "Mario" and "32"
    Using getter methods print the values as below outputs.

    **Expected Output:**
    Employee Name: Mario
    Employee Age: 32
     */
    public static void main(String[] args) {
        EncapsulationDemo obj=new EncapsulationDemo();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        System.out.println("Employee Name: "+obj.getEmpName());
        System.out.println("Employee Age: "+obj.getEmpAge());
    }
}
