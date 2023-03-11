package Class29;

import java.util.ArrayList;
import java.util.Iterator;

public class task3 {// create an arraylist of names and remove every name that ends with "e"
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("nima");
        names.add("lavae");
        names.add("java");
        names.add("kaka");
        names.add("babae");
        names.add("love");
        names.add("level");
      //  names.removeIf(x->x.endsWith("e"));


      //  names.removeIf(x->x.endsWith("e"));
        //System.out.println(names);

     /* Iterator<String>it=names.iterator();
      while (it.hasNext()){
          if (it.next().endsWith("a")){
              it.remove();
          }
      }
        System.out.println(names);*/
        Iterator<String>it=names.iterator();
        while (it.hasNext()){
            if (it.next().endsWith("e")){
                it.remove();
            }
        }
        System.out.println(names);




    }
}
