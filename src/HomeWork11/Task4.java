package HomeWork11;

public class Task4 {
    public static void main(String[] args) {
        /*
        Создайте двумерный массив или целочисленный тип и сохраните числа в 3 строках и 3 столбцах.
        Выведите сумму всех чисел.
         */
        int [][] numbers={{10,20,30},{40,50,60},{70,80,90}};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length ; j++) {
                sum += numbers[i][j];

            }
        }
        System.out.println(sum);
    }
}
