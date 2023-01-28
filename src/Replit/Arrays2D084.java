package Replit;

public class Arrays2D084 {
    /*
    Write a program that prints the total number of elements that are negative AND odd
    **Output:**
    for example -3 is both negative and odd

    3

     */
    public static void main(String[] args) {
        int[][] arr = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0 && arr[i][j] % 2 != 0) {
                    sum++;
                }

            }


        }
        System.out.println(sum);
    }
}
