package Replit;

public class StaticKeyword129 {
    /*
    Declare two static variables to hold
    - country name
    - continent
    Create a method to display the value of static variables in the following format:
    ____ located on \_\_\_\_ continent
    In the main method assign values to a static variable and execute method display
    **Expected Output:**
    Morocco located on Africa continent
    */
    static String countryName;
    static String continent;
    static void display (String countryName, String continent){
        System.out.println(countryName+" located on "+continent);
    }

    public static void main(String[] args) {

        StaticKeyword129.display("Marocco","Africa");

    }
}
