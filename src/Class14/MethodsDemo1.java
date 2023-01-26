package Class14;

import java.util.Arrays;

public class MethodsDemo1 {
    public static void main(String[] args) {

        int [] arr1={10,20,30,45,50};

        int sum=0;
        for (int number:arr1) {
            sum+=number;
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(arr1));

        int [] arr2={10,20,30,45,50};

        int sum2=0;
        for (int number:arr2) {
            sum2+=number;
        }
        System.out.println(sum2);

        int [] arr3={10,20,30,45,50};

        int sum3=0;
        for (int number:arr3) {
            sum3+=number;
        }
        System.out.println(sum3);
    }
}
