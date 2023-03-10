package Class23;

public class Student {
    public void studying(){
        System.out.println("Students are studying");
    }
    public void drinkBear(){
        System.out.println("Students are drinking bear");
    }
}
class SyntaxStudent extends Student{
    @Override
    public void studying() {
        System.out.println("Syntax students are learning Java");
    }

    @Override
    public void drinkBear() {
        System.out.println("Syntax students are not drinking");
    }
}
class CollegeStudent extends Student{
    @Override
    public void studying() {
        System.out.println("College students are studying a whole time");
    }

    @Override
    public void drinkBear() {
        System.out.println("College students are not drinking a lot");
    }
}
class SchoolStudent extends Student{
    @Override
    public void studying() {
        System.out.println("School students are not studying at all");
    }

    @Override
    public void drinkBear() {
        System.out.println("School students are only drinking bear, that`s all");
    }
}
