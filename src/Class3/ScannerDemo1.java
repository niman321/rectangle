package Class3;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=input.nextInt();
        System.out.println("you are " +age+" years old");
    }
}
