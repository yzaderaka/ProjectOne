package Review8;

public class Store {
    public static void main(String[] args) {
        Furniture chair = new Chair();
        chair.comfort();
        chair.assemble(); // runtime polimorphism

        Furniture table =new Table();
        table.comfort();
        table.assemble();

        Table table1=new Table();
    }
}