package HomeWork13;

public class Task2 {
    /*
    Create a String that should be combination of letters, numbers and special characters.
    Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
     */
    public static void main(String[] args) {
        String str = "1234567qwertYUIOP!@#$%^&*";

        int count = 0;
        for (int i = 0; i < str.replaceAll("[^A-Za-z0-9]","").length(); i++) {
            count++;

        }
        System.out.print(count);
        System.out.println();
        System.out.print(str.replaceAll("[^A-Za-z0-9]","").length());
    }
}
