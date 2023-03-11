package Class14;

public class MathTester {
    public static void main(String[] args) {

        String str="i love you ";
        String[]arr=str.split(" ");
        for (String word:arr){
            System.out.println(new StringBuilder(word).reverse()+" ");
        }


    }
}
