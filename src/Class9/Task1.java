package Class9;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter 2 num start and end point");
        int star= scanner.nextInt();
        int end= scanner.nextInt();
        System.out.println("start "+star+" end "+end);
        int eSum=0;
        int oSum=0;
        for (int i = star; i <=end; i++) {
           if (i%2==0){
              eSum+=i;
           }else {
             oSum=oSum=i;
           }
        }
        System.out.println("sum of even numbers "+eSum);
        System.out.println("sum of odd numbers "+oSum);





    }
}
