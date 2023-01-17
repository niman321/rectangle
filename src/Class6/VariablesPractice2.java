package Class6;

public class VariablesPractice2 {
    public static void main(String[] args) {
        byte byteVariables=100;
        short shortVariables=-2000;
        int intVariables=10000;
        long longVariables=5788890098876567l;
        System.out.println(longVariables);
        longVariables=longVariables+1;
        System.out.println(longVariables);

        long distance;
        int minutes=300;
        distance=186282l*minutes*60;
        System.out.println("The distance traveled is "+ distance +"miles.");
    }
}
