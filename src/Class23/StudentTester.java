package Class23;

public class StudentTester {
    public static void main(String[] args) {
        Student []students={new CollegeStudent1(),new SyntaxStudent1(),new SchooleStudent()};
        for (Student stu:students){
            stu.study();
            stu.practice();
            stu.doHomeWork();
        }

    }
}
