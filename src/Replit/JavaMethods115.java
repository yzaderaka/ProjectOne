package Replit;

public class JavaMethods115 {
    /*
    Create a method that will accept a String as a parameter and return new String all in upper case
    Call method
    **Expected Output:**
    TEST
     */
    String method(){
        String a="test";
        System.out.println(a.toUpperCase());
        return a;
    }

    public static void main(String[] args) {
        JavaMethods115 str=new JavaMethods115();
        str.method();
    }

}
