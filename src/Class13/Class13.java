package Class13;

public class Class13 {
    public static void main(String[] args) {

        String str=" i love java";
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                count++;
            }

            System.out.print(str.charAt(i));

        }
        System.out.println(  "letter a has appeared"+count+ " many times ");
    }
}
