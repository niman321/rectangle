package Class9;

public class ArraysDemo2 {
    public static void main(String[] args) {
        int sum=0;

        int [] num={10,20,30,45,50};
        System.out.println(num.length);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            sum=sum+num[i];
            System.out.println(sum);


        }



    }
}
