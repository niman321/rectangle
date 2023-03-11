package Class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {

        ArrayList <Double> numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.5);
        numbers.add(30.54);
        numbers.add(40.2);
        numbers.add(10.3);
        numbers.removeIf(nima -> nima < 11);// this line is the best solution
        System.out.println(numbers);
        Iterator<Double> iterator=numbers.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(numbers);
        while (iterator.hasNext()){
            double number=iterator.next();
            if (number>11){
                iterator.remove();
            }
        }
        System.out.println(numbers);
        /*for (Double d:numbers){
            if (d>11){
                numbers.remove(d);
            }
        }*/






    }
}
