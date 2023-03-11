package Class19;

public class ConstructorChaning {
    ConstructorChaning(){
        System.out.println(" i am non Argument constructor");
    }
    ConstructorChaning(String str){
        this();
        System.out.println(str);
    }
    ConstructorChaning(int number){
        this("nima");
        System.out.println("this is constructor with int parameter");

    }

    public static void main(String[] args) {
        ConstructorChaning obj=new ConstructorChaning();
        System.out.println("--------End of the code-----------");
    }
}
