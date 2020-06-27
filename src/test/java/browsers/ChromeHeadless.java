package browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadless {
    public static void main(String[] args ){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--Headless");
        new ChromeDriver(chromeOptions);
    }
}
