package Class12;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        String str="JAVA is FUN";
        String newStr=str.toLowerCase(Locale.ROOT);
        System.out.println(newStr);

        String str2="i love java";
        String upper=str2.toUpperCase();
        System.out.println(upper);



    }


}
