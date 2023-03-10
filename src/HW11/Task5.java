package HW11;

public class Task5 {
    public static void main(String[] args) {
        /*
        Создайте двумерный массив или целочисленный тип, в котором вы будете хранить нечетные и четные числа
        в 3 строках и 4 столбцах. Разработайте программу, которая будет идентифицировать/печатать только
        четные числа.
         */
        int[][] Arr = {{6, 7, 3, 8}, {7, 4, 1, 12}, {8, 1, 2, 3}};
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++){
                if (Arr[i][j]%2==0){
                    System.out.println(Arr[i][j]);
                }

            }
        }
    }
}
