package Class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArrays01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter 5 number");
        int [] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}
