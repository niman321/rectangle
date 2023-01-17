package Class8;

import java.util.Scanner;

public class whileLoop1 {
    public static void main(String[] args) {
        double total=0;

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter the item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            total = total + itemPrice;
            System.out.println("the total amount " + total);

            System.out.println("please pay");
            double paid=scanner.nextDouble();
            if (paid>total){
                double change=paid-total;
                System.out.println("take change");

            }
            System.out.println("thank you for shopping");
        }   }

}
