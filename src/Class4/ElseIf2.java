package Class4;

public class ElseIf2 {
    public static void main(String[] args) {

        int money=1000;
        String day="Sunday";
        boolean mood=false;

        if(money>700){

            if (mood){
                System.out.println("Lets go shopping");
            }
        }else {
            System.out.println("Lets save some money first");
        }
    }
}
