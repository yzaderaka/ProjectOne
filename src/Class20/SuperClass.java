package Class20;

public class SuperClass {
    SuperClass() {
        System.out.println("I`m a constructor from the parent class");
    }
}

class SubClass extends SuperClass{
    SubClass(){
       super(); // makes a call to the parent class constructor
        System.out.println("I`m a child constructor");
    }

}
