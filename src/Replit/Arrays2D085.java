package Replit;

public class Arrays2D085 {
    /*
    Write a program that sums all numbers that are on even index and on even row.

    **Expected Output:**
    -4
     */
    public static void main(String[] args) {

        {
            int[][] arr = {
                    {-5, -2, -3, 7},
                    {1, -5, -2, 2},
                    {1, -2, 3, -4}
            };
            int sum=0;
            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j <arr[i].length; j++) {
                    if (i%2==0&&j%2==0) {
                        sum=sum+arr[i][j];


                        }
                    }

                }
            System.out.println(sum);
            }


        }
    }
