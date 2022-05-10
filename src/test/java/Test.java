import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;

public class Test {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void Base() {
        System.setProperty("webdriver.chrome.driver","/home/vitat/Downloads/chromedriver");
        driver.get("https://www.geonames.org/");
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
    }

    @org.testng.annotations.Test
    public void Test() {

        driver.findElement(By.name("q")).sendKeys("Selenium");
        WebElement searchButton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));


    }

    @AfterMethod
    void Close(){
        driver.close();
    }

}
