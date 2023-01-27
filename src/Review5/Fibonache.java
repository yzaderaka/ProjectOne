package Review5;

public class Fibonache {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        for (int i = 1; i <10; i++) {
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;

        }
    }
}
