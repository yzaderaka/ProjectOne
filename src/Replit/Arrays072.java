package Replit;

public class Arrays072 {
    /*
    Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x}
    Print the values so the output should look like below

    Output: syntax
     */
    public static void main(String[] args) {

        char[] arr={'s','a','y','b','n','c','t','d','a','e','x'};
        for (int i = 0; i <arr.length; i++) {
            if (i%2==0){
                System.out.print(arr[i]);
            }
        }
    }


}
