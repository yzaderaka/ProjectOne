package Replit;

public class MethodOverloading162 {
    /*
    Overload static method and then execute both overloaded methods.
    **Expected Output:**
    static method without parameter
    static method with int parameter
     */
    public static void m1(){
        System.out.println("static method without parameter");
    }
    public static void m1(int data){
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {
        MethodOverloading162 obj=new MethodOverloading162();
        obj.m1();
        obj.m1(1);
    }
}
