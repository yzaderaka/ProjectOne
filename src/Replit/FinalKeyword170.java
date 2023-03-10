package Replit;

public class FinalKeyword170 {
    /*
    Overload 2 final instance methods:
    Call them in main method

    **Expected Output:**
    Final method with boolean parameter
    Final method with String parameter
     */
    final void method(boolean m1){
        if (m1=true){
            System.out.println("Final method with boolean parameter");
        }else {
            System.out.println("Unknown");
        }
    }
    final void methhod(String m1){
        System.out.println(m1);
    }

    public static void main(String[] args) {
        FinalKeyword170 obj=new FinalKeyword170();
        obj.method(true);
        obj.methhod("Final method with String parameter");
    }
}
