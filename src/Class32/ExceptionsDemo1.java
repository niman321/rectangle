package Class32;

public class ExceptionsDemo1 {
    public static void main(String[] args) {
        System.out.println("line1");
        System.out.println("line2");
        System.out.println("line3");
        System.out.println("line4");
        System.out.println("line5");
        System.out.println("line6");
        try {
            System.out.println(10/0);
            System.out.println("2");
            System.out.println("3");
        }catch (Exception e){
            System.out.println(e);
            System.out.println(10/0);
            System.out.println("5");
            System.out.println("30");
        }
        finally {
            System.out.println("nima");

        }
        System.out.println("line6");





    }
}
