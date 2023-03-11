package Class22;

public class Degree {
    void getPrerequisite(){
        System.out.println("to get degree you need a high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("to get degree you need a high school diploma for Master");
    }

    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();
    }

}
