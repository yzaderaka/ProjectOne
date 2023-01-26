package Replit;

public class Arrays2D083 {
    /*
    Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers
    For example, if we run rowSums for the following 2D array:
    {
    {1,1,2}, //sum = 4
    {3,1,2}, //sum = 6
    {3,5,3}, //sum = 11
    {0,1,2}  //sum = 3
    }
    Then we should get the following array back:
    4
    6
    11
    3
     */
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j= 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            System.out.print(sum);
            sum=0;
            System.out.println();
        }

    }
}
