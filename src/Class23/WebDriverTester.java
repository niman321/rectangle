package Class23;

public class WebDriverTester {
    public static void main(String[] args) {
       /* WebDriver web=new FireFox();
        web.startBrowser();
        web.openURL();
        web.testLoginPage();
        web.closingBrowser();*/

        WebDriver[] webDrivers={new Chrome(),new Safari(),new FireFox(),new Samsung()};
        for (WebDriver webDriver:webDrivers){
            webDriver.startBrowser();
            webDriver.openURL();
            webDriver.testLoginPage();
            webDriver.closingBrowser();

        }














      /*  Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closingBrowser();

        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.openURL();
        fireFox.testLoginPage();
        fireFox.closingBrowser();*/



    }

}
