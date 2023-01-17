package Class7;

public class switchCase1 {
    public static void main(String[] args) {

       String day="tuesday";
       switch (day){
           case "monday":
               System.out.println("1");
               break;
           case "tuesday":
               System.out.println("2");
               break;
           case "wednesday":
               System.out.println("3");
               break;
           default:
               System.out.println("wrong day");
       }
    }
}
