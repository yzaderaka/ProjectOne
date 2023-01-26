package Class14;

public class ArrayAddMachine {
    public static void main(String[] args) {
        int [] array2={10,10,10,20,30};
        addArrayElements(array2);
        int[] arr3={100,50,50};
        addArrayElements(arr3);
    }
    static void addArrayElements(int[] arr){
        int sum=0;
        for(int number:arr){
            sum+=number;
        }
        System.out.println(sum);
    }
}
