package Class19;

public class ConstructorChain {
    ConstructorChain() {
        System.out.println("I`m non argument constructor");
    }
    ConstructorChain(String str){
        this();// making a call to non argument constructor
                //this() -> ALWAYS must be on the first line
        System.out.println(str);

    }
    ConstructorChain(int number){
        this("Hello");
        System.out.println("This is constructor with int parameters "+number);

    }

    public static void main(String[] args) {
        ConstructorChain obj=new ConstructorChain(10);
        System.out.println("*****Ends of the code*****");
    }
}
