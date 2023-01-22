package Review4;

public class NestedLoops {
    public static void main(String[] args) {

        // Loop inside another loop

        for (int i = 1; i <=3; i++) { // outer loop - внешний цикл
            System.out.print(i);
            System.out.println();
            for (int j = 1; j <=4; j++) { // inner loop - внутренний цикл
                System.out.print(j);

            }
        }
    }
}
