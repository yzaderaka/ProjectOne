package Replit;

public class StaticKeyword128 {
    /*
    Create a static method with the following specification
    Return Type: String
    Method Name: mixString
    Parameters:
    - a String called s1
    - a String called s2
    Then inside method write logic that will return the strings combined, one letter at a time, starting with s1.
    See example below for an example.

    NOTE: s1 and s2 should be of equal lengths:
    s1 ==> "12345"
    s2 ==> "abcde"
    mixString(s1,s2) ==> "1a2b3c4d5e"
     */
    static String mixString(String s1, String s2){
        char[] arrs1 = String.valueOf(s1).toCharArray();
        char[] arrs2 = String.valueOf(s2).toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <5; i++) {
            result.append(arrs1[i]).append(arrs2[i]);

        }

        return result.toString();
    }
    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }


}
