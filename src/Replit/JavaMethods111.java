package Replit;
/*
   1. Create one method as syntaxTechnologies and write the logic for that method in println statement as "Welcome to Syntax Technologies!"
    2. Create another method as syntaxStudents and write the logic for that method in println statement as "Welcome Syntax Students!"
    3. Call both methods
    **Expected Output:**
    Welcome to Syntax Technologies!
    Welcome Syntax Students!
 */
public class JavaMethods111 {
    public void syntaxTechnologies(){
        System.out.println("Welcome to Syntax Technologies!");
    }
    private void syntaxStudents(){
        System.out.println("Welcome Syntax Students!");
    }


    public static void main(String[] args) {
        JavaMethods111 javaMethods111=new JavaMethods111();
        javaMethods111.syntaxTechnologies();
        javaMethods111.syntaxStudents();
    }
}
