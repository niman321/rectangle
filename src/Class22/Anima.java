package Class22;

public class Anima {
    String name;
    String color;
    int age;
    double weight;
    void speak(){
        System.out.println("mew mew");
    }
    void eat(){
        System.out.println(" all animals eat");
    }

}
class cat extends Anima{
    void speak(){
        System.out.println(" mew mew mew ");
    }
}
class Dog extends Anima{

}
class Tester{
    public static void main(String[] args) {

    }
}