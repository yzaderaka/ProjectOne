package HW22;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance
    method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */
    double balance;
    double interest;

    void calculateInterest(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
        double result=(balance*interest)/100;
        System.out.println("Your balance is "+balance+" and interest "+interest+" you will monthly receive "+result);
    }
}
class Visa extends CreditCard{
    void calculateInterest(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
        System.out.println("You will monthly receive "+(balance*interest));
    }
}
class AX extends CreditCard{
    @Override
    void calculateInterest(double balance, double interest) {
        super.calculateInterest(balance, interest);
    }

    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        Visa visa=new Visa();
        AX ax=new AX();
        creditCard.calculateInterest(10000,3.1);
        visa.calculateInterest(100000,2.2);
        ax.calculateInterest(200000,2.5);
    }
}
