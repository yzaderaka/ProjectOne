package Class15;

public class MPractice3 {
    /*
    Create a method that takes an array of int sum all the elements from array and return the sum;
     */
    int arrsum(int[] arr){
        int sum=0;
        for (int num:arr) {
            sum+=num;
        }
        return sum;
    }
}
