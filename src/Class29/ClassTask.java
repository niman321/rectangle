package Class29;

import java.util.TreeSet;

public class ClassTask {
    public static void main(String[] args) {

        TreeSet<String>country=new TreeSet<>();
        country.add("usa");
        country.add("france");
        country.add("italy");
        country.add("spain");
        country.add("portugal");
        System.out.println(country);
        for (String s:country){
            System.out.println(s);
        }


    }


}
