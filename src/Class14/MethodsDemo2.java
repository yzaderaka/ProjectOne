package Class14;

import java.util.Scanner;

public class MethodsDemo2 {

    void printHello(){
        System.out.println("Hello World");
    }
    void printHelloManyTimes(int times){
        for (int i = 0; i <times; i++) {
            System.out.println("Hello World");

        }

    }

    void PrintManyTimes(int times, String word, String word2){
        for (int i = 0; i <times; i++) {
            System.out.println(word);
            System.out.println(word2);

        }
    }
}
