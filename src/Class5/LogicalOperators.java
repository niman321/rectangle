package Class5;

public class LogicalOperators {
    public static void main(String[] args) {


        boolean broughtCho=true;
        boolean broughtFlower=true;
        if (broughtCho||broughtFlower){
            System.out.println("I am happy");
        }else {
            System.out.println("I am sad ");

            boolean wifi=true;
            boolean fiveG=true;
            if (wifi||fiveG){
                System.out.println("you are good ");
            }else {
                System.out.println("either connect to wifi or fiveG");
            }
        }


    }
}
