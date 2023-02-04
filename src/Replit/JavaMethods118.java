package Replit;

public class JavaMethods118 {
    /*
    Write a method header on line two with the following specs:
    Returns: a String
    Name: spaceOut
    Parameters: a String
    Then complete the method by programming the following behavior
    Insert spaces after every character in the String s, then return the new string.
    See below examples (note the space at the end as well).
    Examples:
    spaceOut("hello") ==> "h e l l o "
    spaceOut("technology") ==> "t e c h n o l o g y "
     */
    String spaceOut(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        return s;
    }


    public static void main(String[] args) {
        JavaMethods118 str = new JavaMethods118();
        str.spaceOut("technology");

    }

}
