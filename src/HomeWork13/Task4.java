package HomeWork13;

public class Task4 {
    /*
    How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
     */
    public static void main(String[] args) {

        String str3 = "This is sentence i want to reverse";
        String[] words = new StringBuilder(str3).reverse().toString().split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
            newStr.append(words[i]).append(" ");
        System.out.println(newStr);

        // one more method
        //String newSte=str3.toString(); //converting a StringBuilder to String so that we can call methods from String
        String str="This is sentence i want to reverse";
        String[] arr=str.split(" ");
        for (String word:arr) {
            for (int i = word.length()-1 ; i>=0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
