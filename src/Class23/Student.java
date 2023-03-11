package Class23;

public class Student {
    public void study(){
        System.out.println("studying");
    }
    void doHomeWork(){
        System.out.println("solving homework");
    }
    void practice(){
        System.out.println("practice the skills");
    }
}
class SyntaxStudent1 extends Student{
    @Override
    public void study() {
        System.out.println("Syntax student study programming");
    }

    @Override
    void doHomeWork() {
        System.out.println(" do the homework before class");
    }

    @Override
    void practice() {
        System.out.println(" syntax student practice the repls");
    }
}
class CollegeStudent1 extends Student{
    void practice(){
        System.out.println(" must practice");
    }
}
class SchooleStudent extends Student{

}
