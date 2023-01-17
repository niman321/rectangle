package Class8;

import java.util.Scanner;

public class LoopNew1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("do you want card");
            String userResponse=scanner.next();
            if (userResponse.equalsIgnoreCase("yes")){
                break;
            }



        }

    }






}
