package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configFile {
    public static void main(String[] args) { //File Handling
        String path="Files/config.properties";// location of the file
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("something went wrong");
        }catch (NullPointerException e){
            System.out.println("you are trying to to call a method on null object");
        }catch (IOException e){
            System.out.println("IO Exeption occoured");
        }


    }
}
