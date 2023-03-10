package Class24;

public class FileTester {
    public static void main(String[] args) {
        File[] arr= {new JavaFile(256), new WordFile(512), new PDF(1024)};
        for (File files: arr){
            files.open();
            files.edit();
            files.close();
            System.out.println();
        }

    }
}
