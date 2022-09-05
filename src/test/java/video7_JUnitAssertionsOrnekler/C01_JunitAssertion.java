package video7_JUnitAssertionsOrnekler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_JunitAssertion {

    @Test
    public void test0() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //IF ELSE ILE
//        driver.get("https://www.amazon.ca/");
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella");
//        driver.findElement(By.className("nav-search-submit-text")).click();
//        WebElement result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
//        System.out.println(result.getText());
//
//        String actualWords = result.getText();
//
//        String expectedWord = "Nutella";
//
//        if (actualWords.contains(expectedWord)){
//            System.out.println("Nutella test.xml PASSED");
//        }else {
//            System.out.println("Result does not have Nutella" + "\nNutella test.xml FAILED");



        // Assertion Methods; 1) Assert.assertTrue()
        //                    2) Assert.assertFalse()
        //                    3)Assert.assertEqual()
        // Test senaryosunun neyi ongordugune gore karar veririz

        //Assert.assertTrue ile
        driver.get("https://www.amazon.ca/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella");
        driver.findElement(By.className("nav-search-submit-text")).click();
        WebElement result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(result.getText());

        String actualWords = result.getText();

        String expectedWord = "nutella";

        Assert.assertTrue(actualWords.contains(expectedWord));

}}
