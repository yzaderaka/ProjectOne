package Review5;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {11, 12, 13}, {20, 21, 22},{100,101}};
        int numberOfArrays = arr.length;
        System.out.println(numberOfArrays);
        int numberOfElementsIn1Array=arr[0].length;
        System.out.println(numberOfElementsIn1Array);
        int numberofElementsIn4Array=arr[3].length;
        System.out.println(arr[2][1]);
    }
}
