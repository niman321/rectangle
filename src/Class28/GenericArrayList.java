package Class28;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();//this is the right array to use
        Object a =new String("london");
        Object b = new Integer(10);
        Object c= new Scanner(System.in);

        ArrayList name=new ArrayList();//OLd java Version non Generic there is no angle brackets no one use this array now
        name.add("nima");
        name.add(10);
        name.add('A');
        for (Object j:name){
            System.out.println(j);


        }
    }
}
