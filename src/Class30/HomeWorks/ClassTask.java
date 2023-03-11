package Class30.HomeWorks;

import java.util.HashMap;
import java.util.Map;

public class ClassTask {
    public static void main(String[] args) {

        Map<Integer,String>building=new HashMap<>();
        building.put(1,"google");
        building.put(2,"Syntax");
        building.put(1,"google");
        building.put(3,"firefox");
        building.put(4,"chromeDriver");
        building.put(4,"chromeDriver");
        building.put(5,"apple");
        building.put(6,"burgerking");

        System.out.println(building.size());
        building.replace(4,"ibm");
        System.out.println(building);
        building.remove(5);
        System.out.println(building);


    }
}
