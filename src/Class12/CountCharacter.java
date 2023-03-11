package Class12;

public class CountCharacter {
    public static void main(String[] args) {
        String str="nima khurasani 65198466 ##@{}";
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                counter++;

            }

        }
        System.out.println("total is "+counter);




    }
}
