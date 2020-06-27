package browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {
    public static void main(String[] args){
        //System.setProperty("webdriver.edge.driver","drivers\\MicrosoftWebDriver.exe");
        WebDriverManager.edgedriver().setup();
        new EdgeDriver();

    }
}
