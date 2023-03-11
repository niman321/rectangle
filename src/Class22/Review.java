package Class22;

import java.lang.reflect.Method;

public class Review {


    int findLargest(int num1, int num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }

    }
    double findaverage(double num3,double num4){
        return (num3+num4)/2;
    }
   public int min(int [] array){
        int min=array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]<i){
                min=array[i];

            }

        }
        return min;

    }





    StringBuilder reverse(String given){
        StringBuilder sb=new StringBuilder(given);
       return sb.reverse();
    }

    public static void main(String[] args) {
        Review review=new Review();
        review.findaverage(11.0,54.1);
        System.out.println(review.findaverage(23.0,45.1));
        review.toString();
        StringBuilder obj2=new StringBuilder(" hello");
        System.out.println(obj2.reverse());

        int[]array={10,20,30,30};
        review.min(array);
        System.out.println(array);



    }
}
