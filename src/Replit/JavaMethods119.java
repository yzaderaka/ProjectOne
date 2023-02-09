package Replit;

public class JavaMethods119 {
    /*
    Write a method header with the following specs:
    Returns:
    a String
    Name:
    censorLetter
    Parameters:
    a String
    a char
    Then complete the method by programming the following behavior
    Replace all instances of given character with a "*" within the given String.
    See below examples.
    Examples:
    censorLetter("computer science",'e') ==> "comput*r sci*nc*"
    censorLetter("trick or treat",'t') ==> "*rick or *rea*"
     */
    String censorLetter(String str, char ch) {

        String newStr = "";
        newStr = str.replace(ch, '*');
        System.out.println(newStr);
        return newStr;
    }
    public static void main(String[] args) {

        JavaMethods119 obj = new JavaMethods119();
        obj.censorLetter("computer science", 'e');
        obj.censorLetter("trick or treat", 't');

    }
}
