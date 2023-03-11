package Class24;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.speak();
        Animal [] arr={new Dog(),new cat()};
        for (Animal animal:arr){
            animal.eat();
            animal.speak();

        }

    }
}

