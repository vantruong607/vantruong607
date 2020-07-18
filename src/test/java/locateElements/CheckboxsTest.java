package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckboxsTest {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        if(!(driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).isSelected())) {
//        driver.findElement(By.xpath("//form/*[1]")).click(); // check box 1
//        driver.findElement(By.xpath("//form/*[last()]")); // check box 2
//        driver.findElement(By.xpath("//input[1]")).click(); // check box 1
//        driver.findElement(By.xpath("//form/*[2]")).click(); // check box 2

            driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).click();
        }

        if(!(driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected()))
            driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).click();
    }
}
