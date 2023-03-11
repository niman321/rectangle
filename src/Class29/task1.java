package Class29;

import java.util.ArrayList;//create an arraylist that will store 5 names into it
import java.util.Iterator;
//find out if the arraylist is empty or not .check if an specific name is present in the arraylist or not
//find the size of your arraylist and all the values.

public class task1 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("nima");
        names.add("lava");
        names.add("java");
        names.add("kaka");
        names.add("baba");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("kaka"));
        System.out.println(names.size());
        Iterator<String>it=names.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
