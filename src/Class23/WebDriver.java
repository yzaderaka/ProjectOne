package Class23;

public class WebDriver {

    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openURL(){
        System.out.println("Opening a url");
    }
    public void testLoginPage(){
        System.out.println("Checking if login page works");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the url in Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Safari");
    }

    @Override
    public void openURL() {
        System.out.println("Opening a url in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Checking if login page works in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari");
    }
}
class Firefox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Firefox");
    }

    @Override
    public void openURL() {
        System.out.println("Opening a url in Firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Checking if login page works in Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Firefox");
    }
}