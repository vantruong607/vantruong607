package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedirectorTest {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/redirector");
        driver.findElement(By.linkText("here")).click();

        driver.findElement(By.linkText("200")).click();
        driver.findElement(By.linkText("here")).click();

        driver.findElement(By.linkText("301")).click();
        driver.findElement(By.linkText("here")).click();

        driver.findElement(By.linkText("404")).click();
        driver.findElement(By.linkText("here")).click();

        driver.findElement(By.linkText("500")).click();
        driver.findElement(By.linkText("here")).click();

        driver.findElement(By.linkText("here")).click();



    }
}
