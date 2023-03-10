package Replit.Encapsulation180;

public class Main {
    /*
    Create Class EncapsulationDemo
    create two variable as shown below.
    private String empName=John;
    private int empAge=30;
    Create only getters methods for each variable.
    Print the values of each variable as shown below.

    **Expected Output:**
    Employee Name: John
    Employee Age: 30
     */
    public static void main(String[] args) {
        EncapsulationDemo obj=new EncapsulationDemo();
        System.out.println("Employee Name: "+obj.getEmpName());
        System.out.println("Employee Age: "+obj.getEmpAge());
    }
}
