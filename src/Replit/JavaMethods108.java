package Replit;
/*
1. create method and name as m1. Inside your method body add print statement as "m1 method implementation"
2. create another method and name as m2. Inside your method body add print statement as "m2 method implementation"
3. Call these two methods in the main method
**Expected Output:**
m1 method implementation
m2 method implementation
 */
public class JavaMethods108 {
    public void m1(){
        System.out.println("m1 method implementation");
    }
    private void m2(){
        System.out.println("m2 method implementation");
    }


    public static void main(String[] args) {
        JavaMethods108 javaMethods108=new JavaMethods108();
        javaMethods108.m1();
        javaMethods108.m2();
    }
}
