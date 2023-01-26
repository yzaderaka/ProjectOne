package Class12;

public class StringDemo7 {
    public static void main(String[] args) {

        String str="I love java";
        boolean startWith=str.startsWith("I love");
        System.out.println(startWith);
        System.out.println(str.endsWith("java"));

        // method changing is when multiple methods are called on the same line
        // only those methods can we changed which returns a string
        //System.out.println(str.length().startsWith("i"));
        System.out.println(str.contains("java"));
    }
}
