package Replit;

public class StaticKeyword134 {
    /*
    Write a method with the following specs:

    Returns:
    an integer
    Name:
    countVowels
    Parameters:
    a String called s

    Purpose:
    count the number of vowels in the string s.  Assume s is all lowercase.
    Examples:
    countVowels("obama") ==> 3
    countVowels("happy friday! i love weekends") ==> 9
     */
    static int countVowels (String s) {
        int num=0;
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                num++;
            }
            if (s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }

}
