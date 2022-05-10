import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class MTest {

        @BeforeClass
    public void Base() {
        }

    @Test
    public void Test() {
        System.setProperty("webdriver.chrome.driver","/home/vitat/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.geonames.org/");
       // driver.manage().window().fullscreen();
       // driver.manage().deleteAllCookies();
        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.xpath("//input[@type = 'submit']"));

        searchBox.sendKeys("Selenium");
        searchButton.click();


      //  driver.close();

    }

    @AfterClass
    void Close(){

    }

}
//div[@class = 'card-body']/h5[text() = 'Book Store Application']
//div[@class = 'card-body']/h5[contains (text(), 'For')]