package Class6;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        System.out.println("choose country");
        Scanner scanner=new Scanner(System.in);
        String country=scanner.next();

        switch (country.toLowerCase()) {// convert the text to lowercase USA => usa
            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Paste");
                break;
            case "ukraine":
                System.out.println("Borsch");
                break;
            default:
                System.out.println("wrong country");
        }

    }
}
