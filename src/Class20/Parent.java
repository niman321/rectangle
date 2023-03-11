package Class20;

public class Parent {
    String name;
    static  String lastName;
    Parent(){
        System.out.println("parent constructor");
    }
    public void hello (){
        System.out.println(" hello from parent class ");
    }
    protected static void bye(){
        System.out.println("bye from parent ");
    }
    private void money(){
        System.out.println("money from parent");
    }
}
