package Class2;

import java.util.Scanner;

public class ScanerDemo1 {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=input.nextInt();
        System.out.println("you are" +age+ "year old");

    }
}
