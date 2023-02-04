package Replit;

public class StringBuilder106 {
    /*
    Instantiate and StringBuffer class
    Append Value "Hello" to it
    Append value "World" to it.
    Print in UPPERCASE.
    **Expected Output:**
    HELLO WORLD
*/
    public static void main(String[] args) {
        String str1="Hello";
        String str2=" World";
        StringBuffer buffer=new StringBuffer();
        buffer.append(str1.toUpperCase()).append(str2.toUpperCase());
        System.out.println(buffer);

    }
}
