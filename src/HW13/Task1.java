package HW13;

public class Task1 {
    /*
     Create a String that will hold a sentence. Write a program to get a new String without any spaces.
     */
    public static void main(String[] args) {
        String str="I love java. I like IT technologies.";
        String str2=str.replaceAll(" ","");
        System.out.println(str2);
    }
}
