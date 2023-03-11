package Class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetsDemo1 {
    public static void main(String[] args) {
       /* List<String>list=new ArrayList<>();
        list.add("java");
        list.add("lava");
        list.add("baba");
        list.add("kaka");
        list.add("dada");
        System.out.println(list);*/
        HashSet <String> fruit =new HashSet<>();
        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("mango");
        System.out.println(fruit);
        fruit.removeIf(x->x.contains("o"));
        System.out.println(fruit);




    }





}
