package Class27;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        String[] names = {"hiral", "kawa", "laura", "nat"};
        ArrayList names1 = new ArrayList();
        String name = "saba";
        // System.out.println(contains(name,names));
        System.out.println(names1.add("wowww"));
        System.out.println(contains(name,names));


    }

    public static boolean contains(String nameTobe ,String[]names) {
        for (String name:names){
            if (nameTobe.equals(name)){
                return true;
            }
        }return false;

    }





}
