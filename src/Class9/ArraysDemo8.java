package Class9;

public class ArraysDemo8 {
    public static void main(String[] args) {
        int sum=0;
        int[] arr={10,20,30,4,5,6,7,80};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                sum=sum+arr[i];

            }

        }
        System.out.println(sum);




    }
}
