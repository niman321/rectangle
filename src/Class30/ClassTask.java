package Class30;

import java.util.Map;
import java.util.TreeMap;

public class ClassTask {
    public static void main(String[] args) {
        Map<String, String> countryMap = new TreeMap<>();


        countryMap.put("iran", "tehran");
        countryMap.put("England", "london");
        countryMap.put("usa", "w dc");
        countryMap.put("pakistan", "islam abad");
        countryMap.put("poland", "warsaw");


        for(Map.Entry<String, String> entry : countryMap.entrySet()) {
            System.out.println( entry.getKey() + ", Value: " + entry.getValue());
        }


        for(String value : countryMap.values()) {
            System.out.println("Value: " + value);
        }
    }
}
