package Class17;

public class Task3 {
   private static String onlyVowels(String inputStr){
        return inputStr.replaceAll("[^aeiouy]","");
    }

    public static void main(String[] args) {
        System.out.println(onlyVowels("nima"));

    }
}
