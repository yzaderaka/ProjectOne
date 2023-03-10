package Replit;

public class MethodOverloading161 {
    /*
    Overload private instance method m1
    Call each method from the main method.
    Expected Output:
    private m1 method
    private m1 method with int parameter
     */
    private void m1(){
        System.out.println("private m1 method ");
    }
    private void m1(int data){
        System.out.println("private m1 method with int parameter");
    }
    public static void main(String[] args) {
        MethodOverloading161 obj=new MethodOverloading161();
        obj.m1();
        obj.m1(1);
    }
}
