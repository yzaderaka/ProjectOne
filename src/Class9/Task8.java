package Class9;

public class Task8 {
    public static void main(String[] args) {
        double [] arr={10.5, 12.0, 45, 10.5, 23, 10.5};
        // write a program that can tell us many times the number 10.5 is present in array
        // напишите программу которая скажет нам как много раз цифра 10.5 встречается в массиве
        int sum=0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i]==10.5){
                sum++; // can also be written as sum=sum+1;
            }

        }
        System.out.println(sum);

    }
}
