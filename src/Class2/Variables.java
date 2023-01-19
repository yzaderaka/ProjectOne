package Class2;
public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a box in the computers memory, we are calling in box1 if we need the information that
        we are storing inside this box we can simple say to the computer give us the contents of box1.
        int=> what type of data we want to store
        Box1=> is the name of the box
        = sign will take whatever we write ofter it and will store it inside the box1
        10=> is what we are storing inside the box
         */
        int box1=10;
        System.out.println(box1);
        //To store whole numbers(wihtout decimal point) we have 4 different types of boxes
        // Whole nombers like 10 30 4000
        // 1) byte 2) short 3) int 4) long
        byte box2=127; // byte range from -128 to 127
        byte box3=-128;
        short box4=32767;
        int biggerBox=123456789; // mots common type of box
        long maxBox=123456789134545l;
        int myBox=10000;
        System.out.println(myBox);
    }
}