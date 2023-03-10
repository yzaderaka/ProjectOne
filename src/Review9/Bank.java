package Review9;

public class Bank {
    public static void main(String[] args) {

        Customer customer=new Customer();
        customer.setName("Yaroslav");
        System.out.println(customer.getName());
        customer.setSsn(709251);
        System.out.println(customer.getSsn());
    }
}
