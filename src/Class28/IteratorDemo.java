package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("cat");
        words.add("java");
        words.add("computer");
        words.add("lava");

        words.removeIf(s ->s.endsWith("a"));

        // we use this simple code to remove the  specific last letter of the
        // elements of the above ArrayList. We can use the while loop below to do the same thing so the above built in method is very useful.


        /*Iterator<String>iterator=words.iterator();

        while (iterator.hasNext()){
            String s=iterator.next();
            if (s.endsWith("a")){
                iterator.remove();
            }
        }*/


    }
}
