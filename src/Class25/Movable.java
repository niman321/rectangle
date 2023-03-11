package Class25;

public interface Movable {
    void move();
}
class car implements Movable{
    public void move (){
        System.out.println("move");
    }

}
class dog implements Movable {
    public void move(){
        System.out.println(" moving");
    }

}

