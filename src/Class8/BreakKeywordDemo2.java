package Class8;

public class BreakKeywordDemo2 {
    public static void main(String[] args) {
        boolean summer=true;
        int temp=75;

        while (summer){
            if (temp<=100){
                System.out.println("I love summer "+temp+" F");
            }else {
                System.out.println("Its very hot "+temp+" F");
                break;
            }
            temp+=5;
        }
    }
}
