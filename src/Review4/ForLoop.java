package Review4;

public class ForLoop {
    public static void main(String[] args) {
        // best loop used when we know how many times we wanna to repeat a block of code
        // Break breaks a block of code. Usually Using inside SWITCH.
        for (int i = 2; i <=20; i+=5) {
            System.out.println(i);
            if (i==12){
                System.out.println("i is equals to 12 - I am breaking my loop");
                break; // stops the loop
            }
        }
        // Continue
        for (int i = 1; i <=10 ; i++) {
            if (i%3==0){
                System.out.println(i);
                continue; // Java goes back to the beginning of the loop and skips rest of the code that inside loop body
            }if (i%5==0){
                System.out.println(i);
                continue;
            }
            System.out.println("Hello");
        }
    }
}
