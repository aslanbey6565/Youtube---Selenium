package video1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestNotasyon {

   WebDriver driver;
   @Before
    public  void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @After
    public void tearDowm() {driver.close();}

    @Test
    public  void test01() {
       driver.get("https://www.facebook.com");
         }
    @Test @Ignore
    public  void test02() {
       driver.get("https://www.amazon.ca/");
         }
    @Test
    public  void test03() {
       driver.get("https://www.bestbuy.com");
        }
}

