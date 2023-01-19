package Class9;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        1. ask user for item price and item name
        2. accumulate the price
        3. tell the user how much total they should pay
        4. if user give more money program should return a change
        5. Thank you for shopping
         */
        double total=0;
        for (int i = 0; i <3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            total=total+itemPrice;
            System.out.println("Total amount that you you have to pay "+total);
        }/*
        System.out.println("Please pay for the items");
        double amountPaid = scanner.nextDouble();

        if(amountPaid>totalPrice){
            double chang = amountPaid-totalPrice;
            System.out.println("Hey here is your change "+chang);
        }
        System.out.println("Thank you for shopping!");
        */
    }

}
