import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GeonamesTest {

        @BeforeClass
    public void Base() {
        }

    @Test
    public void TestOpenGeonames() {
        System.setProperty("webdriver.chrome.driver","/home/vitat/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.geonames.org/");
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        Assert.assertEquals(driver.getTitle(),"GeoNames");
        driver.close();
    }

    @Test
    public void TestSeasrch() {
        System.setProperty("webdriver.chrome.driver","/home/vitat/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.geonames.org/");
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.xpath("//input[@type = 'submit']"));

        searchBox.sendKeys("Selenium");
        searchButton.click();
        Assert.assertEquals(searchBox.findElement(By.xpath())); - добавить проверку не равен ли резутат поиска унлю

        //driver.close();
    }

    @Test
    public void Test2OpenDocumentation(){
        System.setProperty("webdriver.chrome.driver","/home/vitat/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.geonames.org/");
        //WebElement serchButton = driver.findElement(By.xpath("//*[@id='overview']/div[1]/div[3]/ul[2]/li[2]/a")); // работает
        //WebElement serchButton = driver.findElement(By.xpath("//*[@id='overview']/div[1]/div[3]/ul[2]/li[2]/a[contains (text(), 'Documentation')]")); // работает
        //WebElement serchButton = driver.findElement(By.xpath("//a[@href = 'https://www.geonames.org/export/web-services.html']")); // работает
        WebElement serchButton = driver.findElement(By.xpath("//a[text() = 'Documentation']"));
        serchButton.click();
      //  Assert.assertEquals();
        driver.close();
    }

    @Test
    public void Test3(){
        System.setProperty("webdriver.chrome.driver","/home/vitat/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.geonames.org/");
        //WebElement serchButton = driver.findElement(By.xpath("//*[@id='overview']/div[1]/div[3]/ul[2]/li[2]/a")); // работает
        //WebElement serchButton = driver.findElement(By.xpath("//*[@id='overview']/div[1]/div[3]/ul[2]/li[2]/a[contains (text(), 'Documentation')]")); // работает
        //WebElement serchButton = driver.findElement(By.xpath("//a[@href = 'https://www.geonames.org/export/web-services.html']")); // работает
        WebElement serchButton = driver.findElement(By.xpath("//a[text() = 'Documentation']"));
        serchButton.click();



        driver.close();
    }

    @AfterClass
    void Close(){
        //  driver.close();
    }

}
//div[@class = 'card-body']/h5[text() = 'Book Store Application']
//div[@class = 'card-body']/h5[contains (text(), 'For')]
//*[@id="overview"]/div[1]/div[3]/ul[2]/li[2]/a[contains (text(), 'Documentation')]
//*[@href="https://www.geonames.org/export/web-services.html"]