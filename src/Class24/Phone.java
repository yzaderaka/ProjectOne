package Class24;

public abstract class Phone {
    abstract void  displayPictures();
    abstract void unlockPhone();
    abstract void sendText();


}
class IPhone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("IPhone Pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("IPhone unlock phone");
    }

    @Override
    void sendText() {
        System.out.println("IPhone send text");
    }
}
class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Samsung pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Samsung unlock Phone");
    }

    @Override
    void sendText() {
        System.out.println("Samsung send text");
    }
}
class Google extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Google display pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Google unlock phone");
    }

    @Override
    void sendText() {
        System.out.println("Google send text");
    }
}