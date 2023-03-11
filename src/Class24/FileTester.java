package Class24;

public class FileTester {
    public static void main(String[] args) {
        File [] files={new JavaFile(10),new WordFile(20),new PDFFile(30)};
        for (int i = 0; i < files.length; i++) {
            File f=files[i];
            f.open();
            f.edit();
            f.close();
        }

       /* for (File file:files){
            file.open();
            file.edit();
            file.close();

        }*/


    }
}
