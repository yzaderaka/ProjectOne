package HW11;

public class Task2 {
    public static void main(String[] args) {
        /*
        Создайте 2D-массив автомобилей: американские, немецкие, корейские, итальянские.
        Затем извлеките все значения из этого массива, используя 2 разных цикла.
         */
        String [][] cars={{"Tesla","GMC","Ford"},{"BMW","Audi","Mercedes"},{"Kia","Hyundai","SangYoung"},{"Fiat","Ferrari","Maseratti"}};
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(String []arr :cars){
            for (String x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
