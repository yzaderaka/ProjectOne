package Review6;

public class StringMethods2 {
    public static void main(String[] args) {
        String mySrting="Today is February 2";

        String[] arr=mySrting.split(" ");
        for (String s:arr){
            System.out.print(s);
        }

        System.out.println();
        String newStr=mySrting.substring(9);
        System.out.println(newStr);

        int index=newStr.indexOf('b');
        System.out.println(index);
    }
}
