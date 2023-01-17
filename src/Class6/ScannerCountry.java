package Class6;

import java.util.Scanner;

public class ScannerCountry {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("please Enter three number");
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();

        if (number1>number2&& number1>number3){
            System.out.println("largest number is ");
        }
    }
}
