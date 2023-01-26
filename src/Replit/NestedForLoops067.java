package Replit;

public class NestedForLoops067 {
    /*
    Write a program to print out the pattern:

    1 2 3 4 5 6 7 8 9 10

    2 4 6 8 10 12 14 16 18 20

    3 6 9 12 15 18 21 24 27 30

    4 8 12 16 20 24 28 32 36 40

    5 10 15 20 25 30 35 40 45 50
     */
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 2; i <=20 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i = 3; i <=30; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        for (int i = 4; i <=40; i++) {
            if (i%4==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        for (int i = 5; i <=50; i++) {
            if (i%5==0){
                System.out.print(i+" ");
            }

        }
    }
}
