package Replit;

public class StringManipulations092 {
    /*
    Validate if the string ends with "u" prints the boolean value accordingly.
    Validate if the string ends with "world" prints the boolean value accordingly.
    Validate if the string ends with "are" prints the boolean value accordingly.
    Validate if the string ends with "you" prints the boolean value accordingly.
    */
    public static void main(String[] args) {
        String s1="hello how are you";
        boolean count=s1.endsWith("u");
        boolean count2=s1.endsWith("world");
        boolean count3=s1.endsWith("are");
        boolean count4=s1.endsWith("you");
        System.out.println(count);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);

    }
}
