package Review7;

public class Methods {
    double findAverage(double num1, double num2){
        return (num1+num2)/2;
    }

    public static void main(String[] args) {
        Methods obj=new Methods();
        System.out.println(obj.findAverage(3.5,2.6));
    }
}
