package Class13;

public class Task2 {
    public static void main(String[] args) {
        // Create a String and print is in reverse order
        String str="Sunday, Monday, Tuesday";
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));
            // можно ввсети сколько угодно слов без ограниечений
        }
        System.out.println();
    }
}
