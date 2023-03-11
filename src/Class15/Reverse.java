package Class15;

public class Reverse {
    String reverseStr(String input){
        String newstr="";
        for (int i = input.length()-1; i>=0; i--) {
            newstr+=input.charAt(i);

        }
        return newstr;
    }



}
