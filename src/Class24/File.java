package Class24;

public abstract class File {
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
     */
    int size;
    File(int size){
        this.size=size;
        System.out.println("File size is "+size);
    }
    public abstract void open();
    public abstract void edit();
    public abstract void close();
}
class JavaFile extends File{
    JavaFile(int size) {
        super(size);
    }

    @Override
    public void open() {
        System.out.println("Opening file in Itellij");
    }

    @Override
    public void edit() {
        System.out.println("Editing file in Itellij");
    }

    @Override
    public void close() {
        System.out.println("Closing file in Itellij");
    }
}
class WordFile extends File{
    WordFile(int size) {
        super(size);
    }

    @Override
    public void open() {
        System.out.println("Opening .doc or .rtf files");
    }

    @Override
    public void edit() {
        System.out.println("Editing .doc or .rtf files");
    }

    @Override
    public void close() {
        System.out.println("Closing .doc or .rtf files");
    }
}
class PDF extends File{
    PDF(int size) {
        super(size);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF files");
    }

    @Override
    public void edit() {
        System.out.println("Editing PDF files");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF files");
    }
}
