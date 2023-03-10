package Class28;

public class BoxingDemo {
    public static void main(String[] args) {
        Integer integer=new Integer(10);
        int number=integer; // it`s auto unboxing
        int number2=integer.intValue(); // manually unboxing

        double d=12.3;
        Double wrapperD=new Double(d); //(manually) it`s called boxing
        Double wrapperP=d; // auto boxing

        Float f=12.4f;

    }
}
