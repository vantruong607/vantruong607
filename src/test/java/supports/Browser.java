package supports;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {
    public static WebDriver openBrowser(String name){
        if(name.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        }
        else if(name.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }
        else if(name.equalsIgnoreCase("ie")){
            return new InternetExplorerDriver();
        }
        else if(name.equalsIgnoreCase("safari")){
            return new SafariDriver();
        }
        else{
            throw new IllegalArgumentException("The browser" + name + "does not supports");
        }

    }
    public static void main (String[] args){
//        openBrowser("ie");
//        openBrowser("edge");
        openBrowser("chrome");
//        openBrowser("firefox");
//        openBrowser("safari");
//        openBrowser("a");

    }
}
