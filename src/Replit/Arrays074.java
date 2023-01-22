package Replit;

public class Arrays074 {
    public static void main(String[] args) {
        /*
        Write a program that creates an array of integers of size 11.
        Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values.
         */
        int[] arr=new int[11];
        arr[0]=2010;
        arr[1]=2011;
        arr[2]=2012;
        arr[3]=2013;
        arr[4]=2014;
        arr[5]=2015;
        arr[6]=2016;
        arr[7]=2017;
        arr[8]=2018;
        arr[9]=2019;
        arr[10]=2020;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }


    }
}
