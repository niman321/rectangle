package Class29;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        // does not allow dublicate and retain the insertion order
        LinkedHashSet<String> fruits= new LinkedHashSet<>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("kiwi");
        fruits.add("kiwi");
       // System.out.println(fruits);
        fruits.removeIf(x->x.endsWith("a")||x.endsWith("o")&&x.contains("k")&&x.startsWith("b"));
        System.out.println(fruits);



    }
}
