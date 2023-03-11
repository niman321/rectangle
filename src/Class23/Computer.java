package Class23;

public class Computer {
    int ram;
    int storage;
    String os;

    void playVideo(){
        System.out.println("video is playing ");
    }
    void browserInternet(){
        System.out.println("browse the internet");
    }
}
class Apple extends Computer{

    void playVideo(){
        System.out.println("playing the video on quick time player");
    }
    void browserInternet(){
        System.out.println("browsing the internet using safari");
    }
    void editVideos(){
        System.out.println(" editing videos");
    }
}
class HP extends Computer{

    void browserInternet(){
        System.out.println("browsing the internet using HP browser");
    }
    void editVideos(){
        System.out.println("  HP editing videos");
    }
    void isntalApps(){
        System.out.println("you install app");
    }

}

