package Class7;

import java.util.Scanner;

public class switchCaseDemo1 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your gender");
        char gender1=scanner.next().charAt(0);

        char gender='f';
        switch (gender){
            case 'f':
                System.out.println("female");
                break;
            case 'm':
                System.out.println("male");
                break;
            default:
                System.out.println("not specified");

        }
    }
}
