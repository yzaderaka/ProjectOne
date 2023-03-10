package Replit.MethodOverriding164;

import Replit.MethodOverriding163.Child;

public class Main {
    /*
    Create a method hello() in parent class that will print "method in Parent class" then override  that method is 3 Subclasses
    implementing login to print "method in Child1/Child2/Child3 class"
    In Main Class create 3 object of the child classes and store in into an array and call method hello():
    **Expected Output:**
    method in Child1 class
    method in Child2 class
    method in Child3 class
     */
    public static void main(String[] args) {
        Parent [] arr={new Child1(), new Child2(), new Child3()};
        for (Parent x: arr){
            x.hello();
        }
    }
}
