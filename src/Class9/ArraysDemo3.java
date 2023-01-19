package Class9;

public class ArraysDemo3 {
    public static void main(String[] args) {

        char [] tellers={'A', 'B', 'C', 'D', 'E', 'F'};
        tellers[0]='W';// updating an element array to store the letters "0"
        for (int i = 0; i < tellers.length; i++) {
            System.out.print(tellers[i]);

        }
    }
}
