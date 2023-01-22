package HomeWork11;

public class Task3 {
    public static void main(String[] args) {
    /*
    Используя 2D-массив, создайте список покупок.
    Внутри у вас должно быть множество овощей, фруктов, молочных продуктов и сладостей.
    Получить все значения из этого массива, используя 2 разных цикла
     */
        String [][] grocery={{"Potato", "Onion","Cucumber"},
                                {"Apple","Banana","Orange"},
                                {"Milk","Kefir","Ice cream"},
                                {"Chocolate","Bananas","Candies"}};
        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j <grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();
        for (String []arr: grocery){
            for (String x:arr){
                System.out.println(x+" ");
            }
        }
    }
}
