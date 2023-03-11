package Class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {//create an arraylist of cars and retrieve all the values using 3 different ways
        ArrayList<String> cars=new ArrayList<>();
        cars.add("nima");
        cars.add("lava");
        cars.add("java");
        cars.add("kaka");
        cars.add("baba");
        for (String s:cars){
            System.out.print(s+" ");
        }
        System.out.println();
        Iterator<String> it=cars.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.print(cars+" ");

        System.out.println();

        for (int i = 0; i < cars.size(); i++) {
            String name=cars.get(i);
            System.out.print(name+" ");

        }






    }
}
