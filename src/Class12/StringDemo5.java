package Class12;

public class StringDemo5 {
    public static void main(String[] args) {

        String str="Java";
        String str2="JAVA";

        boolean areequal=str.equals(str2);
        System.out.println(areequal);
        boolean areequal2=str.equalsIgnoreCase(str2);
        System.out.println(areequal2);
    }
}
