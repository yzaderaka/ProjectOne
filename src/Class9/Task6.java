package Class9;

public class Task6 {
    public static void main(String[] args) {


        int[] numbers = new int[5]; // an empty array of size will be created. 5 is the size of array
        numbers[0] = 45;
        numbers[1] = 44;
        numbers[2] = 33;
        numbers[3] = 20;
        numbers[4] = 10;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0)
                sum = sum + numbers[i];
        }
        System.out.println(sum);


        }
    }

