package Class4;

public class NestedDemo7 {
    public static void main(String[] args) {

        boolean studyHard=true;
        int salary=90000;

        if (studyHard){
            System.out.println("We get the jobs");

            if (salary>100000){
                System.out.println("we will buy a tesla");
            }else {
                System.out.println("Lets buy a toyota");
            }
        }else {
            System.out.println("It might take a little longer for us to get the jobs");
        }
    }
}
