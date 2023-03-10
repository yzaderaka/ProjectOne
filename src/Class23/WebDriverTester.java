package Class23;

public class WebDriverTester {
    public static void main(String[] args) {
        Chrome googleChrome = new Chrome();
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLoginPage();
        googleChrome.closeBrowser();
        //Polymorphism
        System.out.println();
        WebDriver webDriver = new Firefox();
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();
        System.out.println();
        WebDriver webDriver1 = new Safari();
        webDriver1.startBrowser();
        webDriver1.openURL();
        webDriver1.testLoginPage();
        webDriver1.closeBrowser();
        System.out.println("----------------");
        // an array of type parent class can the objects of all the child classes
        WebDriver[] browsers = {new Chrome(), new Safari(), new Firefox()};
        for (WebDriver browser : browsers) {
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
            System.out.println();
        }
    }
}
