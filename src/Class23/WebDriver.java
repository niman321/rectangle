package Class23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("starting the browser");
    }
    public void openURL(){
        System.out.println("opening the URL");
    }
    public void testLoginPage(){
        System.out.println("checking if the login page works");
    }
    public void closingBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    public void startBrowser(){
        System.out.println("starting the chrome");
    }
    public void openURL(){
        System.out.println("opening the chrome url");
    }
    public void testLoginPage(){
        System.out.println("checking if the login chrome works");
    }
    public void closingBrowser(){
        System.out.println("closing the chrome browser");
    }
}
class Safari extends WebDriver{
    public void startBrowser(){
        System.out.println("starting safari");
    }
    public void openURL(){
        System.out.println("opening the safari URL");
    }
    public void testLoginPage(){
        System.out.println("checking if the login safari works");
    }
    public void closingBrowser(){
        System.out.println("closing the safari browser");
    }
}
class FireFox extends WebDriver{
    public void startBrowser(){
        System.out.println("starting the firefox browser");
    }
    public void openURL(){
        System.out.println("opening the firefox URL");
    }
    public void testLoginPage(){
        System.out.println("checking if the firefox login page works");
    }
    public void closingBrowser(){
        System.out.println("closing the firefox browser");
    }
}
class Samsung extends WebDriver{
    public void startBrowser(){
        System.out.println("starting the samsung browser");
    }
    public void openURL(){
        System.out.println("opening the samsung URL");
    }
    public void testLoginPage(){
        System.out.println("checking if the samsung login page works");
    }
    public void closingBrowser(){
        System.out.println("closing the samsung browser");
    }
}
