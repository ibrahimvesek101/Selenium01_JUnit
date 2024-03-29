package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T03_LocatorHomework1 {

    /*
    Go to http://automationpractice.com/index.php
    When we write an e-mail without the @ sign in the e-mail box and press enter.
    Let's test the "Invalid email address" warning.
     */
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test01() {
        //http://automationpractice.com/index.php sayfasina gidelim
        driver.get("http://automationpractice.com/index.php");
        //Sign in butonuna basalim
        driver.findElement(By.xpath("//a[@class='login']")).click();
        //driver.findElement(By.xpath("//a[@class='login'] [@title='Log in to your customer account']"));
        //Email kutusuna @isareti olmayan bir mail yazip enter’a bastigimizda


        // “Invalid email address” uyarisi ciktigini test edelim
        WebElement mailKutusu = driver.findElement(By.xpath("//input[@id='email_create']"));
        mailKutusu.sendKeys("abcxgmail.com" + Keys.ENTER); //Keys.Enter yerine mailKutusu.submit();
        WebElement uyariYazisiElementi = driver.findElement(By.xpath("//*[text()='Invalid email address.']"));
        Assert.assertTrue(uyariYazisiElementi.isDisplayed());
    }


}
