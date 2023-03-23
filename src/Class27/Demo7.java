package Class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("fizz");
        names.add("savo");
        names.add("sam");
        names.add("urva");
        names.add("lava");
        names.add("abeera");
       // System.out.println(names.contains("fizz"));
       // names.removeIf(x->x.contains("sam")||x.contains("s"));
       // System.out.println(names);
        names.remove("savo");
        System.out.println(names);
        names.set(3,"nima");
        System.out.println(names);
        System.out.println(names.indexOf("lava"));







    }
}
