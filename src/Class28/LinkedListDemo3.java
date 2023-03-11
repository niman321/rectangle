package Class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        ArrayList<String> numbers=new ArrayList<>();//214 ms LinkedList//
        for (int i = 0; i < 100000; i++) {//451 millisecond runtime
            numbers.add(0,"test data");


        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);// 207 milliSecond runtime

    }
}
