package Class4;

public class IfElseConditionDemo_3 {
    public static void main(String[] args) {

        int day = 9; // assign a value to a variable

        if (day == 1) { // we are compare two values
            System.out.println("Monday"); // if block
        } else if (day == 2) {
            System.out.println("Some other day than Monday"); // else block
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else {
            System.out.println("Enter a day between 1-5");


        }
    }
}

