package Class19;

public class Donkey {
    String name;
    int age;
    double weight;
    void  print(){
        System.out.println("donkey`s name is "+name+"age is "+age+" and weight "+weight);
    }
    //Donkey(){
       // System.out.println("This is non argument constructor");
    //}
    Donkey(String name, int age){
         this.name=name;
         this.age=age;
    }
}
