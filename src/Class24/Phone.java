package Class24;

public abstract class Phone {
  abstract void displayPictures();
  abstract void unlockPhone();
  abstract void sendText();

}
class Iphone extends Phone{
     void displayPictures(){
        System.out.println(" play Pictures");
    }
     void unlockPhone(){
        System.out.println("unlock the phone ");
    }
     void sendText(){
        System.out.println("can send messages");
    }

}
class samsung extends Phone{
    void displayPictures(){
        System.out.println("samsung galaxy");
    }
    void unlockPhone(){
        System.out.println("face id ");
    }
    void sendText(){
        System.out.println("can send messages");
    }
}
