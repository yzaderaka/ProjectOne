package Class18;

public class Task1 {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors
    (private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
    2 - from outside the class; 3 - from different class inside different package  and observe result.
     */
    private Task1(){
        System.out.println("Constructor with no parameter");
    }
    Task1(String name){
        System.out.println("Constructor with String parameter");
    }
}
