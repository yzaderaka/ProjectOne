package Class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName="Yaroslav";
        String lastName="Zaderaka";

        System.out.println("***"+" "+firstName+" "+lastName+"***");
        /*
        Java executes code from top to bottom but if we have multiple operations on the same lines
        it executes them from left ot right
         */
        System.out.println("First Name - " + firstName);
        System.out.println("Last Name - " + lastName);

        System.out.println("10"+"10");
        String space=" ";
        System.out.println(firstName+space+lastName);
        System.out.println(firstName+" "+lastName);
    }
}
