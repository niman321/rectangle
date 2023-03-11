package Class23;

public class Task2 {


    public void studying(){
        System.out.println(" student is studying");

    }
    public void reading(){
        System.out.println(" student is reading");
    }


}
class SyntaxStudent extends Task2{
    public void studying(){
        System.out.println(" student is studying java");

    }
    public void reading(){
        System.out.println(" student is reading a book");
    }

}
class CollegeStudent extends Task2{
    public void studying(){
        System.out.println(" student is studying programming");

    }
    public void reading(){
        System.out.println(" student is reading story book");
    }

}
class SchoolStudent extends Task2{
    public void studying(){
        System.out.println(" student is studying computer science");

    }
    public void reading(){
        System.out.println(" student is reading novel");
    }

}
