package Class18;

public class Task1 {




    Task1(){
        System.out.println("constructor with a String parameter");
    }
    Task1(String name){
        System.out.println("constructor with an int parameter");
    }
    protected Task1(char c){
        System.out.println("with a char parameter");
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();



    }



}
