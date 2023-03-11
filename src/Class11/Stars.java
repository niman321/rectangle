package Class11;

public class Stars {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
            for (int j = 1; j <=4 ; j++) {
                for (int k = 0; k < 4-i; k++) {
                    System.out.print("* ");

                }
                System.out.println();

            }

        }





    }
}
