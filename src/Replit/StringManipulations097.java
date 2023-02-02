package Replit;

import java.util.Locale;
import java.util.Scanner;
/*
Based on the user inputs program should give a correct answer.
If browser is Chrome or CHROME or ChRoMe it should print the:
"Proceed with Chrome browser"
If browser is firefox, FIREFOX or FireFOX it should print the:
"Proceed with Firefox browser"
If browser is IE, ie or iE it should print the:
"Proceed with IE browser"
If any other browser it should print the:
"Invalid browser"
 */

public class StringManipulations097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String browser = sc.nextLine();
        String str = browser.substring(0,1).toUpperCase() + browser.substring(1).toLowerCase();

        switch (str){
            case "Chrome":
                System.out.println("Proceed with Chrome browser");
                break;
            case "Firefox":
                System.out.println("Proceed with Firefox browser");
                break;
            case "Ie":
                System.out.println("Proceed with "+str.toUpperCase()+" browser");
                break;
            default:
                System.out.println("Invalid browser");
        }
        }
    }

