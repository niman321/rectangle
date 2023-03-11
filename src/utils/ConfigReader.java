package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties read() throws IOException {
        String path="Files/config.properties";//  location of the file from which we want to read data
        FileInputStream fileInputStream=new FileInputStream(path);// this is a class that help us navigate to that folder where file is stored
        Properties properties=new Properties();//this class will assist us to read and write data. properties files
        properties.load(fileInputStream);
        return properties;


    }


}
