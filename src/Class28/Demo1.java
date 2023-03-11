package Class28;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("cat");
        words.add("java");
        words.add("computer");
        words.add("lava");
        for (String s:words){
            if (s.endsWith("a")){
                words.remove(s);
                System.out.println(words);
            }
        }
    }


}
