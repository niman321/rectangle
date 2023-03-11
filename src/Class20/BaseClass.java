package Class20;

public class BaseClass {
    String name="john";
    void hello(){
        System.out.println("hello method base");
    }
}
class Child extends BaseClass{
    String name="nima";
    void callMe (){
        System.out.println(this.name);
        System.out.println(super.name);
    }
    void callParents(){
        hello();
    }

}
