package browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIE {
    public static void main(String[] args){

        System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
        new InternetExplorerDriver();

    }
}
