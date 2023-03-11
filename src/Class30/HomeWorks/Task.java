package Class30.HomeWorks;

import java.util.LinkedHashSet;

public class Task {
    public static void main(String[] args) {


        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("richmond");
        cities.add("london");
        cities.add("Apland");
        cities.add("tehran");

        cities.removeIf(x->x.startsWith("a")||x.startsWith("A"));
        System.out.println(cities);
    }
}
