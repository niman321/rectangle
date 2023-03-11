package Class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String,Double> fruits=new HashMap<>();
        fruits.put("apple",3.0);
        fruits.put("oragge",21.0);
        fruits.put("banaba",11.1);
        fruits.put("kiwi",41.0);
        fruits.put("apple",14.3);
        System.out.println(fruits);
        fruits.put(null,null);
        System.out.println(fruits);


        HashMap<String,Double>makeup=new HashMap<>();
        makeup.put("lipstick",50.1);
        makeup.put("foundation",40.2);
        makeup.put("maskara",21.4);
        makeup.put("eyelashes",64.8);
        makeup.put("blushon",45.3);

        Set<String> allkeys=makeup.keySet();
        System.out.println(allkeys);
        for (String s:allkeys){
            System.out.println(s);
        }


        HashMap<String,Double>groceries=new HashMap<>();
        groceries.putAll(fruits);
        groceries.putAll(makeup);
        System.out.println(groceries);


    }



}
