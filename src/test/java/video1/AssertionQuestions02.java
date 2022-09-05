package video1;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AssertionQuestions02 {


    @Test
    public  void  test01(){

//    1. Launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
//            3. Verify that home page is visible successfully
        WebElement logoElement = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(logoElement.isDisplayed());

//        4. Click on 'Products' button
        driver.findElement(By.xpath(" //a[text()=' Products']")).click();

//        5. Verify user is navigated to ALL PRODUCTS page successfully
        String expectedUrl ="https://automationexercise.com/products";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
//        6. Enter product name in search input and click search button
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search_product']"));
        searchBox.sendKeys("Thsirt");
        driver.findElement(By.xpath("//button[@id='submit_search'] ")).click();
//        7. Verify 'SEARCHED PRODUCTS' is visible
        WebElement searchedOk = driver.findElement(By.xpath("//h2[text()='Searched Products'] "));
        Assert.assertTrue(searchedOk.isDisplayed());

        driver.close();

}}
