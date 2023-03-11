package Class30.HomeWorks;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

       // HashSet<Student1>students=new HashSet<>();
        Set<Student1> students=new HashSet<>();
        students.add(new Student1("anna",12));
        students.add(new Student1("nima",14));
        students.add(new Student1("java",32));
        students.add(new Student1("lava",62));

        for (Student1 stu:students){
            System.out.println(stu.getName());
        }



    }
}
class Student1{
    private String name;
    private int studentID;

    public Student1(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;

}

}
