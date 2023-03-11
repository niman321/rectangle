package Class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo1new {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("cat");
        words.add("java");
        words.add("computer");
        words.add("lava");
        for (String s:words){
            if (s.endsWith("a")){
                words.remove(s);
            }
            for (int i = 0; i < words.size() ; i++) {
                if (words.get(i).endsWith("a")){
                    words.remove(i);
                }

            }

        }
    }
}
