package Class12;

public class StringMethods1 {
    public static void main(String[] args) {
        //Remove spaces from start and end of each word
        String str="java";
        System.out.println(str.length());
        String str02="banana";
        int len=str02.length();
        System.out.println(len);
        String name="nima khurasani";
        if (name.length()>10){
            System.out.println("name cant be more than 10 letters");
        }
    }
}
