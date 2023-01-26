package Class13;

public class Task1 {
    public static void main(String[] args) {
        String name = "hello";
        if (!name.isEmpty()) {
            if (name.length() % 2 != 0 && name.length() > 3) {
                int middleIndex = name.length() / 2;
                System.out.println(name.charAt(middleIndex));
            }
        }
    }
}