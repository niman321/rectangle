package Class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {// create an arraylist of drinks, if any drinks has letter "a" or "e" replace it wit water
        ArrayList<String> names = new ArrayList<>();
        names.add("nima");
        names.add("lavae");
        names.add("java");
        names.add("kaka");
        names.add("did");
        names.add("bib");


        for (int i = 0; i <names.size() ; i++) {
          String name =names.get(i);
          if (name.contains("a")||name.contains("e")){
              names.set(i,"water");

            }
        }
        System.out.println(names);


    }

}
