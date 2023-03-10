package Review8;

public class Furniture {
    public void assemble(){
        System.out.println("Furniture needs to be assembled");
    }
    public void comfort(){
        System.out.println("Furniture need to be comfortable");
    }
}
class Chair extends Furniture{
    @Override
    public void comfort() {
        System.out.println("Not every chair is comfortable");
    }
    protected void loveSeat(){
        System.out.println("This is the best chair");
    }
}
class Table extends Furniture{
    @Override
    public void comfort() {
        System.out.println("Table can not be comfortable");
    }

}
