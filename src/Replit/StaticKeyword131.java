package Replit;


public class StaticKeyword131 {
    /*
    Write a method header on line two with the following specs:
    Returns:
    a String
    Name:
    thirdLetter
    Parameters:
    a String called s
    Then complete the method by programming the following behavior
    Returns every 3rd letter of the String s, starting from the first letter.
    See below examples.
    Examples:
    thirdLetter("hello there") ==> "hltr"
    thirdLetter("technology") ==> "thly"
     */
    static String thirdLetter(String s) {
        StringBuilder str=new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i <arr.length; i++) {
            if (i%3==0){
                str.append(arr[i]);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
