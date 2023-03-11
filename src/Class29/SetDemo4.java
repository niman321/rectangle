package Class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers= new TreeSet<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(60);
        numbers.add(90);
        System.out.println(numbers);
    }
}
