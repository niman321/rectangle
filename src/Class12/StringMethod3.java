package Class12;

public class StringMethod3 {
    public static void main(String[] args) {
        String str="java is love";
        char c=str.charAt(0);
        System.out.println(c);
        for (int i = 0;i<str.length(); i++) {
            System.out.print(str.charAt(i));
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)=='a'){
                    continue;
                }
                System.out.println(i);

            }
        }






    }
}
