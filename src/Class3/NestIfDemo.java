package Class3;

public class NestIfDemo {
    public static void main(String[] args) {

        int money = 1000;
        String day = "Sunday";
        boolean mood =true;

        if (money > 700) {
            if (mood) {
                System.out.println("lets go shopping");
            }else {
                System.out.println("lets save some money first");

            }
        }
    }
}
