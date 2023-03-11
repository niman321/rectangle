package Class20;

public class child extends Parent {
    public static void main(String[] args) {
        child c1=new child();
        c1.hello();
        Parent.bye();
        child.bye();
    }

}
