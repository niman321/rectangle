package Class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter 5 number");
        int [] numbers=new int[5];
       // numbers[0]=scanner.nextInt();
       // numbers[1]=scanner.nextInt();
       // numbers[2]=scanner.nextInt();
      //  numbers[3]=scanner.nextInt();
      //  numbers[4]=scanner.nextInt();
      //  System.out.println(Arrays.toString(numbers));
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
