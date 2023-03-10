package Replit;

public class MethodOverloading160 {
    /*
    Overload instance method display by having different types of parameters
    Inside each method write the logic to print value of the parameter
    Call all methods inside your main method
    **Expected Output:**
    100
    Syntax Technologies
    100.09
     */
    void display(int data){
        System.out.println(data);
    }
    void display(String data){
        System.out.println(data);
    }
    void display(double data){
        System.out.println(data);
    }

    public static void main(String[] args) {
        MethodOverloading160 obj=new MethodOverloading160();
        obj.display(100);
        obj.display("Syntax Technologies");
        obj.display(100.89);
    }
}
