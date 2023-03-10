package HW11;

public class Task1 {
    public static void main(String[] args) {
        /*
        Создайте 2D-массив (более короткий путь), в котором первый массив будет состоять из 4 имен,
        а второй массив будет содержать оценки.
        Затем ваша программа должна вывести имена студентов, у которых есть оценки A и B.
         */
        String[][] names = {{"Jack", "Mike", "Julia", "Yaroslav"}, {"A", "B", "C", "A"}};
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                if (names[i][j].equals("A") || names[i][j].equals("B"))
                    System.out.println(names[0][j]);

            }
        }
    }

}