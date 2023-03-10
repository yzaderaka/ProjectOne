package Replit.MethodOverriding163;

public class Main {
    /*
    In Parent Class create a method with name method() that will print  "Parent method"
    Override method() in Child class that will print "Child method"
    In Main Class create objects of child and parent class and call its method.
    **Expected Output:**
    Parent method
    Child method
     */
    public static void main(String[] args) {
        Parent parent=new Parent();
        Child child=new Child();
        parent.method();
        child.method();
    }
}
