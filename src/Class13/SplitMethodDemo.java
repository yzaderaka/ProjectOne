package Class13;

public class SplitMethodDemo {
    public static void main(String[] args) {

        String str="I love Java. I write a lot of code daily. I am from batch 15";
        String [] strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[1].trim());
        //whenever we are working with arrays we use the length and whenever we are working with Strings
        // we use the length()
    }
}
