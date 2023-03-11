package Class24;

public abstract class File {
    int size;
    File(int size){
        this.size=size;
    }
   abstract void open();
    void edit(){
        System.out.println("File can be edited");
    }
    void close(){
        System.out.println("clos the file");
    }
}
class  JavaFile   extends File{
    JavaFile(int size) {
        super(size);
    }

    void edit(){
        System.out.println("File can be edited in computer");
    }
    void close(){
        System.out.println("close  the file in the computer ");
    }
     void open(){
        System.out.println(" opening the file");

    }
}
class WordFile extends File{
    WordFile(int size) {
        super(size);
    }

    void edit(){
        System.out.println("File can be edited in computer");
    }
    void close(){
        System.out.println("close  the file in the computer ");
    }
    void open(){
        System.out.println(" microsoft");

    }
}
class PDFFile extends File{
    PDFFile(int size) {
        super(size);
    }

    void edit(){
        System.out.println("File can be edited in computer");
    }
    void close(){
        System.out.println("close  the file in the computer ");
    }
    void open(){
        System.out.println("document");

    }
}
