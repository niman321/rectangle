package Class27;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {//<> are called diamond operator or angle brackets we
        ArrayList <String> names=new ArrayList();
        names.add("nima");
        names.add("saba");
        names.add("lava");
        names.add("java");
        names.add("mana");
        names.add("dana");
        names.add("kaka");
        names.removeIf(x->x.contains("m")||x.contains("I")||x.contains("j"));
        System.out.println(names);


    }
}
