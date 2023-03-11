package Class19;

public class ThisKeyword {
    int a,b;


    ThisKeyword(int a,int b){
        this.a=a;
        this.a=a;

    }
    public void sum(int a,int b){
        System.out.println(a+b);
        System.out.println(" sum of instance variables= "+this.a+this.b);
    }
    void hello(){
        System.out.println("batch 15");
    }
    void howAreYou(){
        System.out.println("how are you ");
    }
    void greeting(){
        hello();
        howAreYou();
    }

    public static void main(String[] args) {
      ThisKeyword obj= new ThisKeyword(10,20);
        System.out.println(obj.a);
        obj.sum(100,200);

        obj.greeting();
    }
}
