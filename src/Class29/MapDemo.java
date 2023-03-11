package Class29;

import java.util.HashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer> groceries=new TreeMap<>();
        groceries.put("eggs",10);
        groceries.put("milk",5);
        groceries.put("bread",6);
        groceries.put("rice",5);
        groceries.put("meat",33);
        groceries.put("biryani",11);
        System.out.println(groceries.get("rice"));
        System.out.println(groceries);
        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        groceries.remove("meat");
        System.out.println(groceries);

    }
}
