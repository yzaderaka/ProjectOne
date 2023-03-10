package Replit.Encapsulation181;

public class Main {
    /*
    Create Class Account
    Create the below variables:

    - acc_no;
    - name;
    - email;
    - double amount;

    Create the getter/setter methods for each variable.
    In Main Class and the main method.
    Using setter methods assign the values as:
    acc_no = 7560504000
    name = Sumair
    email = sumair@syntax.com
    amount = 50000.0
    Using getter methods print the values as below output.

    **Expected Output:**
    7560504000 Sumair sumair@syntax.com 50000.0
     */
    public static void main(String[] args) {
        Account obj=new Account();
        obj.setAcc_no("7560504000");
        obj.setName("Sumair");
        obj.setEmail("sumair@syntax.com");
        obj.setAmount(50000);
        System.out.println(obj.getAcc_no()+" "+obj.getName()+" "+obj.getEmail()+" "+obj.getAmount());
    }
}
