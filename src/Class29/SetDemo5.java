package Class29;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo5 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
       System.out.println(numbers);

       LinkedHashSet<Integer>uninumbers=new LinkedHashSet<>(numbers);
        System.out.println(uninumbers);


    }



}
