package Class30.HomeWorks;

import java.util.Map;
import java.util.TreeMap;

public class TaskClass {
    public static void main(String[] args) {
        Map<String, String> countryMap = new TreeMap<>();


        countryMap.put("iran", "tehran");
        countryMap.put("England", "london");
        countryMap.put("usa", "w dc");
        countryMap.put("pakistan", "islam abad");
        countryMap.put("poland", "warsaw");

       var entryset=countryMap.entrySet();
       for (var entry:entryset){
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
       var iterator=countryMap.entrySet().iterator();
       while (iterator.hasNext()){
           var entry=iterator.next();
           System.out.println(entry+" "+entry.getValue());
       }
       var values=countryMap.values();
       for (var value:values){
           System.out.println(value);
       }


    }

}
