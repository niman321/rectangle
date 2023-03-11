package Class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;// notes: when we want to read data we use FileInputStream when we want to write data we use FileOutputStream
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class ConfigFileReadDemo1 {
    public static void main(String[] args) throws IOException {
        String path="Files/config.properties";//  location of the file from which we want to read data
        FileInputStream fileInputStream=new FileInputStream(path);// this is a class that help us navigate to that folder where file is stored
        Properties properties=new Properties();//this class will assist us to read and write data. properties files
        properties.load(fileInputStream);// load all the data from file inside the above object "properties"
        System.out.println(properties.get("user"));// we now print our values using properties.get method
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URl"));
        System.out.println(properties.get("browser"));
        fileInputStream.close();
    }
}
