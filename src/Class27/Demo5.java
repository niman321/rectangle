package Class27;

import java.util.AbstractList;
import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        AbstractList<Character> characters=new ArrayList<>();
        characters.add('@');
        characters.add('c');
        characters.add('!');
        characters.add('A');
        characters.add('B');

        for (var character:characters){
            System.out.println(character);
        }


    }
}
