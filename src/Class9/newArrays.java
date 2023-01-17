package Class9;

public class newArrays {
    public static void main(String[] args) {
        int [] num=new int[5];
        num[0]=45;
        num[1]=44;
        num[2]=33;
        num[3]=20;
        num[4]=10;
        int sum=0;
        for (int i = 0; i <num.length ; i++) {
            if (i%2==0){
                sum=sum+num[i];
            }


        }
        System.out.println(sum);




    }
}
