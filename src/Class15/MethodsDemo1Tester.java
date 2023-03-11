package Class15;

public class MethodsDemo1Tester {
    public static void main(String[] args) {
        MethodsDemo1 method=new MethodsDemo1();
       boolean is= method.isEven(15);
        System.out.println(is);
        System.out.println(method.isEven(100));
        System.out.println(method.isEven(12));
        System.out.println(method.isEven(20));
    }
}
