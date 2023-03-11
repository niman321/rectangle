package review10;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo2 {
    public static void main(String[] args) { // remove those elements which contain A,E and their price is more than 8
        Map<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("apple",12.2);
        fruitMap.put("banana",4.5);
        fruitMap.put("kkk",4.5);
        fruitMap.put("ddd",4.5);
        fruitMap.put("dragon",4.6);
        fruitMap.put("pear",12.4);
        fruitMap.put("soap",12.5);
        fruitMap.put("soap",12.5);
        // fruitMap.forEach(x,y)->System.out.println(x+y);
        fruitMap.entrySet().removeIf(x->x.getKey().contains("a")||x.getKey().contains("e")&&x.getValue()>8);
        fruitMap.entrySet().removeIf(x->x.getKey().contains("a")||x.getKey().contains("e")&&x.getValue()>8);
        fruitMap.entrySet().removeIf(x->x.getKey().contains("k")||x.getKey().contains("d")&&x.getValue()>8);

        // System.out.println(fruitMap);



    }
}
