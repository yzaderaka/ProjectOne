package Replit;

public class Arrays2D082 {
    /*
    Write a program that will print the sum of all elements in 2D array.

    **Expected Output:**
    -9
     */
    public static void main(String[] args) {
        int[][] arr = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                sum+=arr[i][j];


            }


        }
        System.out.println(sum);

    }
}
