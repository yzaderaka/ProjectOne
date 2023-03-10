package Class28;

import java.util.LinkedList;

public class LinkedListsDemo {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("Yaroslav");
        names.add("Elvira");
        names.add("Tamara");
        names.add("Temuz");
        names.add("Sam");
        System.out.println(names);
        for (String name: names){
            System.out.println(name);
        }
    }
}
