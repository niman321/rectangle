package Class12;

public class StringDemo2 {
    public static void main(String[] args) {
        // this method is used on log in using isEmpty method
        String str="java";
        String str2="java ";
        boolean areEqual=str.equals(str2);
        System.out.println(areEqual);
        boolean areEqual2=str.equalsIgnoreCase(str2);
        System.out.println(areEqual2);


    }
}
