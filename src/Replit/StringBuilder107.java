package Replit;

public class StringBuilder107 {
    /*
    Given String = "Hello Friends"
    **Expected Output:**
    sdneirF olleH
     */
    public static void main(String[] args) {
        String str="Hello Friends";
        StringBuilder builder=new StringBuilder(str);
        builder.reverse();
        System.out.println(builder);
    }
}
