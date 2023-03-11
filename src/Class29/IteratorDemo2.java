package Class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.5);
        numbers.add(30.54);
        numbers.add(40.2);
        numbers.add(10.3);

      //  numbers.removeIf(number->number>11);
      //  numbers.removeIf(x->x>11);
       // System.out.println(numbers);

       /* for (Double number : numbers) {
            System.out.println(number);
        }*/
        Iterator it = numbers.iterator();
        //System.out.println(it.hasNext());
       // System.out.println(it.next());
       // System.out.println(it.hasNext());
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
