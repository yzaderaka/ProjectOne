package Replit;

public class Arrays2D081 {
    /*
    Write a program that prints the highest value in the array.

    **Expected Output:**
    input [5,4,8]

    8
     */
    public static void main(String[] args) {
        int[] arr={5,4,8};
        int maxNum = arr[0];

        for (int j : arr) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println(maxNum);
    }

}
