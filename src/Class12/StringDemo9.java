package Class12;

public class StringDemo9 {
    public static void main(String[] args) {

        String str="How many characters in this string? 1234567890";

        int count=0;
        for (int i = 0; i <str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)))
            count++;
        }

        System.out.println("Total isAphabetic in Str "+count);
    }
}
