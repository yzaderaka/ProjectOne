package Review5;

public class Arrays2DDemo2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {11, 12, 13}, {20, 21, 22}, {100, 101}};

        //getting all values from 2d array
        for (int[] a : arr) {      //iterates over arrays
            for (int num : a) {     //iterates over each element
                System.out.print(num + " ");
            }
            System.out.println();
        }
        for (int row = 0; row < arr.length; row++) {// outer loops iterates over rows
            for (int col = 0; col < arr[row].length ; col++) {// iterates over each column
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();

        }
    }
}
