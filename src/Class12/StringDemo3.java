package Class12;

public class StringDemo3 {
    public static void main(String[] args) {

        String firstName="Yaroslav";
        String secondName="Zaderaka";
        String fullName=firstName+" "+secondName; //most widely used
        System.out.println(fullName);
        System.out.println(firstName+" "+secondName);
        System.out.println(firstName.concat(" "+secondName));
    }
}
