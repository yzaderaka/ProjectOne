package HW11;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iPhone = new Phone();
        iPhone.navigate();
        iPhone.price = 1000;
        iPhone.size = 6.5;
        iPhone.color = "Space gray";
        Phone Huawei = new Phone();
        Huawei.alarm();
        Huawei.color = "Silver";
        Huawei.size = 6.9;
        Huawei.price = 700;
        Phone BlackBerry = new Phone();
        BlackBerry.ringing();
        BlackBerry.color = "Black";
        BlackBerry.size = 5.4;
        BlackBerry.price = 599;
    }
}
