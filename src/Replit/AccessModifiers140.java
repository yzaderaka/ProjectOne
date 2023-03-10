package Replit;

public class AccessModifiers140 {
    /*
    Create the maxLength method that will accept String array of words and return the word with the largest length.
    Method should visible only within same package!
    **Expected Output:**
    this is long
    */
    static String maxLength(String[] s) {
        String restring = "";
        for (String word : s) {
            if (word.length() > restring.length())
                restring = word;
        }
        return (restring);
    }

    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
        System.out.println(maxLength(arr));

    }
}
