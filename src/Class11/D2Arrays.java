package Class11;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {

        int [][] matrix={{10,20,30},
                         {45,44,66},
                         {30,40,20,10,25}
        };
        System.out.println(matrix[2][4]);
        System.out.println(Arrays.toString(matrix[1]));
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[0][i]);
        }
        int [] arr=matrix[0]; // getting complete first array from 2d array
    }

}
