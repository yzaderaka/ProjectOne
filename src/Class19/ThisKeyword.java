package Class19;

public class ThisKeyword {
    int a,b;
    ThisKeyword(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void sum(int a, int b){
        System.out.println("Sum of the local variables "+(a+b));
        System.out.println("Sum of the instance variables "+(this.a+this.b));
    }


    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(10,20);
        System.out.println(obj.a);
        obj.sum(10,20);
    }
}
