package Replit;

public class ForLoop055 {
    /*
    Create a for loop that prints out even numbers from 10 to 0
    Must not include the number 0 in the output
     */
    public static void main(String[] args) {
        for (int i = 10; i!=1; i--) {
            if (i%2==0){
                System.out.println(i);
            }

        }
    }
}
