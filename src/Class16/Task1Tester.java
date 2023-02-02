package Class16;

public class Task1Tester {
    public static void main(String[] args) {
        Task1 task1=new Task1();
        Task1 task2=new Task1();
        task1.name="Sumair";

        task1.empID="228";
        task1.salary=1000000;

        task2.name="Yaroslav";

        task2.empID="228";
        task2.salary=10000;

        System.out.println(task1.name);
        System.out.println(task1.salary);
        System.out.println(task2.name);
        System.out.println(task2.salary);
        System.out.println();

    }
}
