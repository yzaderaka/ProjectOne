package Replit;

public class FinalKeyword169 {
    /*
    Create final method avgElements that will average all the elements in an integer array (passed to the method as a parameter) and return the average.
    **Expected Output:**
    4.8
     */
    final static double avgElements(int[] num){
        double count=0;
        double sum=0;
        double result=0;
        for (int i = 0; i <num.length; i++) {
            sum++;
            count+=num[i];

        }
        result=count/sum;
        return result;
    }
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8


    }
}
