package Replit;

public class VariablesInJava120 {
    /*
    Declare 3 instance variables to hold:
    year, school name and batch #
    Access variables from the main method and assign specific values to them
    Print values of your variables in the following format:
    **Expected Output:**
    I am a student of batch 9 studying at Syntax in the year of 2021
     */
    int year;
    int batch;
    String schoolName;

    public static void main(String[] args) {
        VariablesInJava120 student=new VariablesInJava120();
        student.year=2021;
        student.batch=9;
        student.schoolName="Syntax";
        System.out.println("I am a student of batch "+student.batch+" studying at "+student.schoolName+" in the year of "+student.year);
    }
}
