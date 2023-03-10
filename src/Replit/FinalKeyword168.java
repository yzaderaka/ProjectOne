package Replit;

public class FinalKeyword168 {
    /*
    Create an instance final method that will reverse a String and return that new String
    Call method from the main method
    **Expected Output:**
    olleh
     */
    final String method(String s){
        StringBuilder stringBuilder=new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str="hello";
        FinalKeyword168 obj=new FinalKeyword168();
        System.out.println(obj.method(str));
    }
}
