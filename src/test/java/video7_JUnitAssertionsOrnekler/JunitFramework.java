package video7_JUnitAssertionsOrnekler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JunitFramework {

    @Test
    public void test01() {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Aslanbey@65");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcdef");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        driver.close();
    }

    @Test
    public void test02() {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.ca/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella");
        driver.findElement(By.className("nav-search-submit-text")).click();
        WebElement result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(result.getText());

        driver.close();

    }
    @Test
    public void test03() {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.bestbuy.com");

        driver.close();

    }
}