package Class24;

public abstract class Animal {
    public abstract void speak();
    public abstract void eat();

}
class Dog extends Animal{
    public void speak(){
        System.out.println("woof woof");
    }
    public void eat(){
        System.out.println("animal food");
    }
}
class cat extends Animal{
    public void speak(){
        System.out.println("meow meow ");
    }
    public void eat(){
        System.out.println("animal meat");
    }
}