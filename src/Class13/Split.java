package Class13;

public class Split {
    public static void main(String[] args) {


        String str=" i love java. i love you .i want you ";
        String[]strArr=str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());

    }
}
