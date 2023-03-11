package Class21;

public class TaskRegtangle {

    int length;
    int width;
    void calculateArea(int length,int width){
        System.out.println(length*width);
    }
    void calculateArea(int side,double side1){
        System.out.println(side*side1);
    }

    public static void main(String[] args) {
        TaskRegtangle task=new TaskRegtangle();
        task.calculateArea(10,20);
        task.calculateArea(10,20.2);

    }
}
