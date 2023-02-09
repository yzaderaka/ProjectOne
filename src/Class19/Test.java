package Class19;

public class Test {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.accountNumber=709251;
        ba.money=1000;

        ba.deposit();
        System.out.println(ba.accountNumber);
        System.out.println(ba.money);;
        System.out.println("***** Creating an object to checking bank account *****");
        Checking check=new Checking();
        check.accountNumber=9882; // feature from parent
        check.money=880.5; // feature from parent
        check.interest=0; // feature from checking class itself
        System.out.println(check.accountNumber);
        System.out.println(check.money);
        check.deposit();
        check.transfer();
    }
}
