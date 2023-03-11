package Class12;

public class StringDemo4 {
    public static void main(String[] args) {
        String str="hello hello hello hello 23456754";
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                counter++;
            }

        }
        System.out.println("total is str "+counter);



    }
}
