package video1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethodlari {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



        driver.manage().window().getSize();
        driver.manage().window().getPosition();
        driver.manage().window().setPosition(new Point(20,30));
        driver.manage().window().setSize(new Dimension(5,30));

        System.out.println("new size : " + driver.manage().window().getSize());
        System.out.println("new position : " + driver.manage().window().getPosition());


        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().window().minimize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



    }
}
