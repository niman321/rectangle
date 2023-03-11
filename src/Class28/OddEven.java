package Class28;

import java.util.ArrayList;

public class OddEven {
    public static void main(String[] args) {//Create an array of even numbers from 1 to 500. remove any number that is divisible by 5.
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 0; i <=500 ; i+=2) {
            numbers.add(i);


        }
        numbers.removeIf(x->x%5==0);
        System.out.print(numbers+" ");


    }
}
