package Class23;

public class StudentTester {
    public static void main(String[] args) {

        Student [] students={new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student std: students){
            std.studying();
            std.drinkBear();
            System.out.println();
        }
    }
}
