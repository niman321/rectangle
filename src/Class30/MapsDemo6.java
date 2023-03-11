package Class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo6 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Aisha");
        studentsMap.put(6,"Aisha");
        studentsMap.put(7,"Aisha");

        Collection<String>value=studentsMap.values();
        System.out.println(value);

        value.removeIf(x->x.contains("i"));
        System.out.println(studentsMap);





    }
}
