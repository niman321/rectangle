package Class17;

public class Student {
    String id;
    String name;
    int age;
    double weight;

    Student(String sName,String sId,int sAge,double sWeight){
        id=sId;
        name=sName;
        age=sAge;
        weight=sWeight;

    }

    void printInfo(){
        System.out.println(name+" age is"+" "+age+" : "+" weight is "+weight);
    }
}
