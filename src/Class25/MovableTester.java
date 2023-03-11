package Class25;

public class MovableTester {
    public static void main(String[] args) {
        Movable[] movables={new car(),new dog()};
        for (int i = 0; i <movables.length ; i++) {
            Movable move=movables[i];
            move.move();

            for (Movable movee:movables){
                movee.move();

            }
        }
    }
}
