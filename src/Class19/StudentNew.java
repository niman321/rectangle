package Class19;

public class StudentNew {
    String name;
    String address;

    StudentNew (String name, String address) {
        this.name = name;
        this.address = address;
    }
    void info(){
        System.out.println("name= "+name+"    address= "+address);
    }

    public static void main(String[] args) {
        StudentNew stu=new StudentNew("nima","23b kensington");
        stu.info();

        new StringBuilder();
        new StringBuilder("hello");

    }

}
