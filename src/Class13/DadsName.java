package Class13;

public class DadsName {
    public static void main(String[] args) {
        String dadsName="Zafar";
        String momsName="Maryum";
        String expectation="girl";
        String firstHalf="";
        String secondHalf="";
        if(expectation.equalsIgnoreCase("boy")){
            firstHalf=dadsName.substring(0,dadsName.length()/2);
            secondHalf=momsName.substring(momsName.length()/2);

        }else {
            firstHalf=momsName.substring(0,momsName.length()/2);
            secondHalf=dadsName.substring(dadsName.length()/2);
        }
        System.out.println(firstHalf+secondHalf);








    }
}
