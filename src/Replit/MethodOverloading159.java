package Replit;

public class MethodOverloading159 {
    /*
    Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
    In main method execute all 3 methods to match the output:
    Expected Output
    40 (should come from subtracting 4 numbers)
    30 (should come from subtracting 3 numbers)
    20 (should come from subtracting 2 numbers)
     */
    void subtraction(int num, int num2){
        System.out.println(num-num2+" (should come from subtracting 2 numbers)");
    }
    void subtraction(int num, int num2, int num3){
        System.out.println(num-num2-num3-num3+" (should come from subtracting 3 numbers)");
    }
    void subtraction(int num, int num2, int num3, int num4){
        System.out.println(num-num2-num3-num3-num4+" (should come from subtracting 4 numbers)");
    }

    public static void main(String[] args) {
        MethodOverloading159 obj=new MethodOverloading159();
        obj.subtraction(200,40,40,40);
        obj.subtraction(150,40,40);
        obj.subtraction(100,80);
    }


}
