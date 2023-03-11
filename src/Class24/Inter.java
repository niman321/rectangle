package Class24;

interface Inter {
    void eat();
    void walk();
    void train();
}
interface Inter1 extends Inter{
    void listen();
    void box();
    String name="nima";
}
class newClass implements Inter,Inter1{
    public void eat(){
        System.out.println("burger");
    }

    @Override
    public void walk() {
        System.out.println(" can walk");
    }

    @Override
    public void train() {
        System.out.println(" training");
    }

    @Override
    public void listen() {
        System.out.println("can listen");
    }

    @Override
    public void box() {
        System.out.println(" is boxer");

    }
}
