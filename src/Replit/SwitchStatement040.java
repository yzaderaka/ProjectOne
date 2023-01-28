package Replit;

import java.util.Scanner;

public class SwitchStatement040 {
    /*
    By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.

    First Output: "Enter name of the instructor"
    case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
    case 2: if User provided the name as Moazzam as input it should show  "Will take care of SDLC Assignment"
    case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
    case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"

    Other than these four names if the user provides any other names --> " Invalid instructor selected"
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the instructor");
        String instructor= sc.next();
        switch (instructor){
            case "Asghar":
                System.out.println("Will take care of Java Assignment");
                break;
            case "Moazzam":
                System.out.println("Will take care of SDLC Assignment");
                break;
            case "Weqas":
                System.out.println("Will take care of Selenium Assignment");
                break;
            case "Asel":
                System.out.println("Will take care of every Assignment");
                break;
            default:
                System.out.println(" Invalid instructor selected");
        }
    }
}
