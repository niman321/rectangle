package Class2;

import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        int money=15000;
        if (money>1000){
            System.out.println("lets buy samsung");
        }
        if (money>2000){
            System.out.println("lets also buy a macbook ");
        }
        boolean mothersday=true;
        if (mothersday){
            System.out.println("happy mothers day");

            String name="nima";
            if (name.equals("nima")){
                System.out.println("I love football");

            }else {
                if (name.equals("a")){
                    System.out.println("lets go to cinema");
                }
            }
        }




    }
}
