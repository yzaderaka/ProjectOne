package Class16;

public class Task4 {
    /*
    Create a method that will say Hello in different languages
    based on the country that will be passed when method is executed
    return type => String void
    name => sayHello
    parameter => String countryName
     */
    String sayHello(String counryName){
        switch (counryName){
            case "Ukraine":
                return "Bitaю";
            case "USA":
                return "Hello";
            case "Russia":
                return "Привет";
            case "China":
                return "Ni hao";
            default: return "Country not supported";
        }
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        System.out.println(task4.sayHello("Ukraine"));
    }
}
