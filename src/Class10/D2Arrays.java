package Class10;

public class D2Arrays {
    public static void main(String[] args) {
        String [][] thomsonTrain=new String[3][3];
        String [] cabin0={"zafar","adam","sam",};
        String [] cabin1={"nabi","saud","anees",};
        String [] cabin2={"safi","abeera","zahra",};
        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;

        System.out.println(thomsonTrain[1][1]);


    }
}
