package Class24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone[] phones={new IPhone(), new Samsung(), new Google()};
        for (Phone phone : phones) {
            phone.unlockPhone();
            phone.sendText();
            phone.displayPictures();
            System.out.println();
        }
    }
}
