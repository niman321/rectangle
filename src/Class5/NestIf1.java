package Class5;

public class NestIf1 {
    public static void main(String[] args) {
       int money=1000;
       String day="sunday";
       boolean mood=false;
       if (money>700){
           if (mood){
               System.out.println("lets go shopping");
           }
       }else{
           System.out.println("lets save more");
       }
    }
}
