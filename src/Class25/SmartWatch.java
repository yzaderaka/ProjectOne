package Class25;
interface WashAble{
    void wash();
}
public class SmartWatch implements WashAble {
    @Override
    public void wash() {
        System.out.println("You can wash this smartwatch with out any issues");
    }
}
class Phone implements WashAble{

    public void wash(){
        System.out.println("i am IP65 rated you can wash me");
    }
}


