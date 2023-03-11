package Class29;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        AbstractList <Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("good","very",5));
        dogs.add(new Dog("jacky","german",10));
        dogs.add(new Dog("jimmy","bulldog",10));
        dogs.add(new Dog("jammy","hery",10));
        dogs.add(new Dog("jemaa","Persian",10));
        for (Dog d:dogs){
            d.printDogName();
        }


    }
}
