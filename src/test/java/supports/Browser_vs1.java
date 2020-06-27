package supports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.HashMap;
import java.util.Map;

public class Browser_vs1 {
    //    public static WebDriver openBrowser(String ...browser){
//        String name = browser[0];
    private static WebDriver driver;

    public static WebDriver openBrowser(String name) {

        switch (name.toLowerCase()) {
            case "chrome": {

                driver = new ChromeDriver();
                break;
            }
            case "firefox":

                driver = new FirefoxDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;

            default:
                throw new IllegalArgumentException("The browser" + name + "does not supports");
        }


    }

    public static WebDriver openHeadlessBrowser(String name) {
        switch (name.toLowerCase()) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setHeadless(true);
                return new ChromeDriver(chromeOptions);
            case "firefox":
                FirefoxBinary firefoxBinary = new FirefoxBinary();
                firefoxBinary.addCommandLineOptions("--headless");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setBinary(firefoxBinary);
                return new FirefoxDriver(firefoxOptions);
            default:
                throw new IllegalArgumentException("The browser " + name + "doesn't support");
        }
    }


    public static WebDriver openChromeMobileMode(String deviceName) {
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", deviceName);
        ChromeOptions opts = new ChromeOptions();
        opts.setExperimentalOption("mobileEmulation", mobileEmulation);
        return new ChromeDriver(opts);
    }

    public static void visit(String url) {
        driver.get(url);
    }

    public static WebDriver find(Sting by, String  locator) {
        switch (by){
            case id: return driver.findElement(By.id(locator));


    }
}
//    public static void main (String[] args){
////        openBrowser("ie");
////        openBrowser("edge");
////        openBrowser("chrome");
////        openBrowser("firefox");
////        openBrowser("safari");
////        openBrowser("a");
//
//    }

}
