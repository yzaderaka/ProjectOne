package Class12;

public class StringDemo11 {
    public static void main(String[] args) {

        String str="Send it to support channel. More Java";
        String newstr=str.substring(28);// starting point to print
        System.out.println(newstr);
        System.out.println(str.substring(0,27));// starting point and the ending point
    }
}
