package Class15;

import java.util.Scanner;

public class MethodPractice2 {
    // Create a method that takes a String reverse it and return
    String reverseStr(String input){
        String newStr="";
        for (int i =input.length()-1 ; i>=0 ; i--) {
            newStr+=input.charAt(i);
        }

        return newStr;
    }


    String reverseStr1(String input){
        return new StringBuilder(input).reverse().toString();
    }

    String reverseStr2(String input){
        StringBuilder stringBuilder=new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

}
