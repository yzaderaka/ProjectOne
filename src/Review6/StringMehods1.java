package Review6;

public class StringMehods1 {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(str.length());// 5
        System.out.println(str.toUpperCase());// HELLO
        System.out.println(str.charAt(1)); // e
        System.out.println(str.isEmpty()); //false
        String newstr=str.concat("Java");
        System.out.println(str); //Hello. Because String is immutable.
        System.out.println(str.toLowerCase()); //hello

    }
}
