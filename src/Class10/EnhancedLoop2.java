package Class10;

import java.util.Arrays;

public class EnhancedLoop2 {
    public static void main(String[] args) {

        int[] arr = {10, 13, 20, 25, 45, 50};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                arr[1]=0;


            }
            System.out.println(i);


        }
    }
}
