package Class12;

public class CharString {
    public static void main(String[] args) {
        String str="java is love";
        char c=str.charAt(5);
        System.out.println(c);
        int counter=0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a'){
                counter++;
            }

        }
        System.out.println(counter);




    }
}
