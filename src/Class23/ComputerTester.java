package Class23;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers={new Apple(),new HP()};
        for (Computer com:computers){
            com.playVideo();
            com.browserInternet();
            Apple apple=(Apple) com;
            apple.editVideos();





        }

    }
}
