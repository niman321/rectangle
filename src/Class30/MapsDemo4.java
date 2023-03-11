package Class30;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {

        HashMap<String,Double> makeup=new HashMap<>();
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
        allkeys.removeIf(x->x.length()>7);
        System.out.println(allkeys);



    }
}
