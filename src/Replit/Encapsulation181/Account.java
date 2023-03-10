package Replit.Encapsulation181;

public class Account {
    String acc_no;
    String name;
    String email;
    double amount;

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}