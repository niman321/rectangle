package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovDemo {

    public static void main(String[] args) {
        var A="nima";
        var B="saba";
        ArrayList<String> words=new ArrayList<>();
        words.add("cat");
        words.add("java");
        words.add("computer");
        words.add("lava");
        //words.add("computer");


        words.removeIf(s -> s.endsWith("a"));


        System.out.println(words);




    }
}
