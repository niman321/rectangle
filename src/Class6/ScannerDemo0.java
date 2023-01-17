package Class6;

import java.util.Scanner;

public class ScannerDemo0 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your age");
        int age=scan.nextInt();
        System.out.println("you are "+age+ " years old ");
        String name=scan.next();
        System.out.println("your name is "+name);
        String gender=scan.next();
        System.out.println("your gender is " +gender);
        double weight=scan.nextDouble();
        System.out.println("your weight is "+weight);
        System.out.println("please enter your gender");
        char gender1=scan.next().charAt(0);
        System.out.println("your gender is "+gender1);
        scan.close();



    }


}
