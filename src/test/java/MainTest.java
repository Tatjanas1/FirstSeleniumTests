import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTest {

    @Test
    public void testAbbr() {
        String result = Main.abbr("Hallo", 4);
        Assert.assertEquals(result, "H...");
    }
    @Test
    public void testAbbr1(){
        String result = StringUtils.abbreviate("Hello", 4);
        Assert.assertEquals(result, "H...");
    }

    @Test
    public void testSelenium(){
        System.setProperty("webdriver.chrome.driver","/home/vitat/Downloads/chromedriver");
        //java.lang.IllegalStateException: The path to the driver executable must be set by the
        // webdriver.chrome.driver system property; for more information,
        // see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver.
        // The latest version can be downloaded from http://chromedriver.storage.googleapis.com/index.html


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle()); // => "Google"

        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        searchButton.click();

        searchBox.findElements(By.name("q"));

        //searchButton.getAttribute("value"); // => "Selenium"

        driver.quit();
    }
}