package Class11;

public class Example2 {
    public static void main(String[] args) {

        int [][] matrix={{10,20,30},
                         {45,44,66},
                         {30,40,20,10,25}
        };
        // matrix.length tells us how many 1d arrays are present in this 2d array
        for (int[] arr:matrix){
            for (int number:arr){
                System.out.print(number+" ");
            }
            System.out.println();
        }
        }
    }


