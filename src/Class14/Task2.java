package Class14;

public class Task2 {
    public static void main(String[] args) {
        String str="nima is very cleve";
        String[]arr=str.split(" ");
        for (String word:arr){
            for (int i = word.length()-1; i>=0; i--) {
                System.out.print(word.charAt(i));

            }
            System.out.print(" ");
        }

    }
}
