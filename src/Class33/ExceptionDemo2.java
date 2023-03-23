package Class33;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        String name="!Batch 15 is SMART";
        String name1="nima";

        try {
            System.out.println(name.charAt(-1));
        }catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();

        }catch (NullPointerException npe){
            System.out.println(npe.getMessage());

        }catch (Exception e){
            System.out.println(e);

        }


    }
}
