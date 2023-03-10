package Replit;

public class AccessModifiers137 {
    /*
    In main class please declared the variables using different access modifiers that will hold value for:
    - name
    - city
    - name of the school
    - batch number

    Create a method to display details in following format:
    My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_
    Assign values to the variables and execute method display
    **Expected Output:**
    My name is John and I live in Miami. I study at Syntax in batch 9
     */
    private String name;
    protected String city;
    String nameOfTheSchool;
    public int batchNumber;

    public void diplay(String name,String city, String nameOfTheSchool, int batchNumber){
        this.name=name;
        this.city=city;
        this.nameOfTheSchool=nameOfTheSchool;
        this.batchNumber=batchNumber;
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+nameOfTheSchool+" in batch "+batchNumber);
    }

    public static void main(String[] args) {
        AccessModifiers137 obj=new AccessModifiers137();
        obj.diplay("Yaroslav","Kyiv", "Syntax", 15);
    }

}
