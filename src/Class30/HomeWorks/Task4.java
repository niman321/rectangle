package Class30.HomeWorks;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Car("Geico","BMW"));
        insurances.add(new Pet("Pet love","Cat"));
        insurances.add(new Health("Allianz"));

        for (Insurance i:insurances){
            i.getQuote();
            i.cancelInsurance();
        }
    }
}
abstract class  Insurance{
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public abstract void getQuote();
    public abstract void cancelInsurance();
}

class Car extends Insurance{
    String carModel;

    Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }
    @Override
    public void getQuote() {
        System.out.println(insuranceName+" quote is 2000$ a year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel your car insurance any time you want without any penalty");

    }
}


class Pet extends Insurance{
    String petType;

    Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public   void getQuote() {
        System.out.println(petType+"'s insurance 580$ a year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel your "+insuranceName+" anytime");

    }
}
class Health extends Insurance {

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Your health insurance is 3400$ per year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel your " + insuranceName + " anytime with %7 fee");

    }

}
