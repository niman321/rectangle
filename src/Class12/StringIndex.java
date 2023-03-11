package Class12;

public class StringIndex {
    public static void main(String[] args) {
        String str="java is not pain";
       // System.out.println(str.indexOf("j"));
       // System.out.println(str.indexOf("a"));
       // System.out.println(str.indexOf("p"));
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            counter++;
        }
        System.out.println();

    }

}
