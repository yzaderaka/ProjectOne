package HomeWork13;

public class Task3 {
    /*
    You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
    How would you find out how many sentences are in that String?
     */
    public static void main(String[] args) {
        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
        int count=0;
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i)=='?'){
                count++;

            }

        }
        System.out.println("In this string we have "+count+" sentences");
        // split method with array(not good, too much memory use)
        String[] arr=str.split("[?]");
        System.out.println(arr.length);
        // the best choice
        System.out.println(str.split("[?]").length);
    }
}
