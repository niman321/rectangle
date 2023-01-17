package Class1;

public class creditcard {
    public static void main(String[] args) {
             int money=1000;
             boolean creditcard=true;
             if (creditcard==true) {
                 System.out.println("if you have got a credit card");
                 if (!creditcard==true){
                     System.out.println("you dont have a credit card");
                 }else{
                     System.out.println("we can give you card");
                 }
             }else if (money==1000){
                 System.out.println("whats the balance");
                 if (money>1000){
                     System.out.println("pay off now");
                 }else{
                     System.out.println("they can spend more");
                 }
             }







    }
}
