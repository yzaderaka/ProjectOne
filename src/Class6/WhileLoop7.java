package Class6;

public class WhileLoop7 {
    public static void main(String[] args) {
        boolean condition = true;
        int number = 0;
        while (condition) {
            System.out.println("Hello World");
            if (number > 3) {
                condition = false;
            }
            number++;
        }
    }
}
