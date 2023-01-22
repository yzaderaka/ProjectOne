package Replit;


public class Arrays075 {
    public static void main(String[] args) {
        /*
        Using the following array.
        {45, 78, 12,  67, 55, 89, 23, 77, 88}
        Create a for loop to extract values from that array so your output looks as below: 78 55 77
        */
        int[] arr = {45, 78, 12, 67, 55, 89, 23, 77, 88};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 78) {
                System.out.println(arr[i]);
            }
            if (arr[i]==55){
                System.out.println(arr[i]);
            }
            if (arr[i]==77){
                System.out.println(arr[i]);
            }
        }

    }
}
