package Class29;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    void printDogName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Dog dog=new Dog("rocky","persian",5);
        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.breed);
    }
}
