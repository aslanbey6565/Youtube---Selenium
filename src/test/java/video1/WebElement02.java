package video1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElement02 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Aslanbey@65");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcdef");
        driver.findElement(By.xpath("//button[@name='login']")).click();



    }
}
