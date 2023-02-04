package Replit;

public class JavaMethods116 {
    /*
    Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
    ( Return false if one or both given numbers are not even)
    Examples:
    - bothEven(4,6) ==> true
    - bothEven(3,4) ==> false
    - bothEven(-1,1) ==> false
    **Expected Output:**
    false
     */
    Boolean even(int a, int b) {
        boolean flag;
        if (a % 2 == 0 && b % 2 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        JavaMethods116 tester=new JavaMethods116();
        System.out.println(tester.even(4,6));
        System.out.println(tester.even(3,4));
        System.out.println(tester.even(-1,1));
    }


}