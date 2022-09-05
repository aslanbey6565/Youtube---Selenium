package video1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElement {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://www.bestbuy.com");
        List<org.openqa.selenium.WebElement> buttonList = driver.findElements(By.tagName("button"));
        System.out.println(buttonList.size());


        System.out.println(buttonList);

        for (org.openqa.selenium.WebElement each : buttonList ){
            System.out.println(each.getText());
        }

    }
}
