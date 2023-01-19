package Class2;

public class VariablesDemo2 {
    public static void main(String[] args) {
        int numberBox=10; // we don`t need to define the data-types again and again, java remember it`s
        numberBox=20; // we are reassigning number 20 to numberBox, so it will overwrite 10 with 20
        System.out.println(numberBox);
        numberBox=200;
        System.out.println(numberBox);
        numberBox=30;
        System.out.println(numberBox+20);

        int number=20;
        int number2=20;
        int number3=20;
        int number4=20;
        System.out.println(numberBox*1);
        System.out.println(numberBox*2);
        System.out.println(numberBox*3);
        System.out.println(numberBox*4);
    }
}
