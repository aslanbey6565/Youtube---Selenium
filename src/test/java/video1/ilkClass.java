package video1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilkClass {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        // driver.get()
        driver.get("https://www.amazon.ca/");
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();

        // driver.getTitle()
        System.out.println("page title: " + driver.getTitle());

        // driver.getCurrentUrl()
        System.out.println(driver.getCurrentUrl());

        // driver.getPageSource();
        System.out.println(driver.getPageSource());

        //driver.getWindowHandle();
        System.out.println(driver.getWindowHandle());


        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();


    }
}
