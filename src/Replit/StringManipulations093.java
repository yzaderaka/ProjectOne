package Replit;

public class StringManipulations093 {
    /*
    String “abracadabra alakazam”;
    - Print out the position of the first occurrence of "c".
    - Print out the position of the first occurrence of " ".
    - Print out the position of the first occurrence of the variable target1.
    - Print out the position of the first occurrence of the variable target2.
    **Expected Output:**
    4
    11
    6
    -1

     */

    public static void main(String[] args) {
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";
        int int1=str.indexOf("c");
        int int2=str.indexOf(" ");
        int int3=str.indexOf("dab");
        int int4=str.indexOf("ABRA");
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);
        System.out.println(int4);
    }
}
