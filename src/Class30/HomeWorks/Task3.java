package Class30.HomeWorks;

import java.util.HashSet;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {

        TreeSet<String> countries=new TreeSet<>();
        countries.add("canada");
        countries.add("thailand");
        countries.add("iran");
        countries.add("japan");
        countries.add("korea");
        for (String c:countries){
            System.out.println(c);
        }

    }
}
