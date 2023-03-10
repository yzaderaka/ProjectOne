package class22;

public class Degree {
    void getPrerequisite(){
        System.out.println("To get a Degree we need a High School diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get a masters Degree we need a Bachelors diploma");
    }
}

class DegreeTester{
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();
    }
}