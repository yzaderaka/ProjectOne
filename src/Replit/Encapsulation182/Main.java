package Replit.Encapsulation182;

public class Main {
    /*
    Create the a Person class with the following:
    **Class Variables**
    - firstname
    - lastname
    - birthmonth
    - birthday
    - birthyear
    - String ssn

    **Constructor**
    The main constructor should take in all values and assign them to their respective private class variables
    **Methods**
    Create a public getters to access all the variables.
    **Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format.
    For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"**
    in Main Class.
    Instantiate and object of Person and provide values. follows below outputs for values.
    using getter and method print them separately.

    **Note: Read carefully the steps.**
    **Expected Output:**
    John
    Doe
    10/25/1900
    123-45-6789
     */
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 10, 25, 1900, "123-45-6789");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.formatBirthday());
        System.out.println(person.getSsn());
    }
}
