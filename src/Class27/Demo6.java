package Class27;

import java.util.AbstractList;
import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        AbstractList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        System.out.println(booleans.get(0));
        for (int i = 0; i <booleans.size() ; i++) {
            System.out.println(booleans.get(i));
        }

        System.out.println("*************************************************");

        for (var v:booleans){
            System.out.println(v);
        }
        System.out.println("***************************************************");


        int i = 0;
        while (i<booleans.size()){
            System.out.println(booleans.get(i));
            i++;
        }


    }
}
