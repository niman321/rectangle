package Class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class NewConfig {
    public static void main(String[] args) throws IOException {
        String path="Files/newTest.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("name","nima");
        properties.store(fileOutputStream,"new name has been added");



    }
}
