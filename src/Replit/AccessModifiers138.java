package Replit;

public class AccessModifiers138 {
    /*
    In AnotherClass declare a private, default, protected, public methods and have them each
    return the name of the what access modifier they are using.
    All methods should be accessible by class name
    Call methods of Another class inside Main class
    **Expected Output:**
    default
    protected
    public
     */
    private String prvt(){
        return "private";
    }
    String dflt(){
        return "default";
    }
    protected String prtctd(){
        return "protected";
    }
    public String pblc(){
        return "public";
    }
    static class Tester extends AccessModifiers138{
        public static void main(String[] args) {
            Tester obj=new Tester();
            System.out.println(obj.dflt());
            System.out.println(obj.prtctd());
            System.out.println(obj.pblc());

        }
    }
}
