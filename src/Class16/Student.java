package Class16;

public class Student {
    String name;
    String id;
    static String schoolName;
    int age;
    double weight;

    void printName(){
        System.out.println(name);
        System.out.println(schoolName);
    }
    static void printStudentInfo(){
      //  System.out.println(name); static method can`t accces here, because here static variable and static void
        System.out.println(schoolName);
    }

}
