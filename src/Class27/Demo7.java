package Class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("fizz");
        names.add("savo");
        names.add("sam");
        names.add("urva");
        names.add("tarik");
        names.add("abeera");
        System.out.println(names.contains("daria"));
        System.out.println(names);
        names.remove("sam");
        System.out.println(names);
      //  names.clear();
      //  System.out.println(names);
        names.set(2,"nima");
        System.out.println(names);
        System.out.println(names.indexOf("tarik"));






    }
}
