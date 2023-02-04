package Replit;
/*
    1. Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"
    1. Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"
    3. Call both methods
    **Expected Output:**
    newLine method implementation
    displayLine method implementation
 */
public class JavaMethods110 {
    public void newLine(){
        System.out.println("newLine method implementation");
    }
    private void displayLine(){
        System.out.println("displayLine method implementation");
    }


    public static void main(String[] args) {
        JavaMethods110 javaMethods110=new JavaMethods110();
        javaMethods110.newLine();
        javaMethods110.displayLine();
    }
}
