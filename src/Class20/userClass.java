package Class20;

public class userClass {
    String name;
    long phoneNumber;
    userClass(String name,long phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;

    }
}
class userInfo extends userClass{
    userInfo(String addrees,long phoneNumber){
        super("nima",00555555);

    }
}
