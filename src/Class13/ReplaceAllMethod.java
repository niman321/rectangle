package Class13;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String str="NIMA khur658asani @123456#%^&";
        System.out.println(str.replaceAll("[^A-Z-a-z]","#"));
        System.out.println(str.replaceAll("[a-z]","x"));
        System.out.println(str.replaceAll("p[0-9]",""));
    }
}
