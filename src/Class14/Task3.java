package Class14;

public class Task3 {
    public static void main(String[] args) {
        String str=" it is saturday ? its raining ? do you have";
        String[] arr=str.split(" ");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[3]);
        System.out.println(str.split("[?]").length);
    }
}
