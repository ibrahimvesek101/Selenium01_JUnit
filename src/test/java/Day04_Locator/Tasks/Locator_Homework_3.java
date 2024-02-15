package Day04_Locator.Tasks;

import Utilities.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locator_Homework_3 extends Base {
    //Navigate to website  https://testpages.herokuapp.com/styled/index.html
    //Under the ORIGINAL CONTENTS
    //Click on Alerts
    //Print the URL
    //Navigate back
    //Print the URL
    //Click on Basic Ajax
    //Print the URL
    //Enter value 20 and Enter
    //And then verify Submitted Values is displayed open page
    //Close driver.

    @Test
    public void test01() {
        //Navigate to website  https://testpages.herokuapp.com/styled/index.html

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        System.out.println("başta giriş url " + driver.getCurrentUrl());

        //Click on Alerts
        WebElement alerts = driver.findElement(By.id("alerts"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        alerts.click();

        //Print the URL
        System.out.println("alerts sonrası url " + driver.getCurrentUrl());

        //Navigate back
        driver.navigate().back();

        //Print the URL
        System.out.println("alerts ten geri geldikten sonraki url " + driver.getCurrentUrl());

        //Click on Basic Ajax
        driver.findElement(By.id("basicajax")).click();

        //Print the URL
        System.out.println("basicajax sonraki url " + driver.getCurrentUrl());

        //Enter value 20 and Enter
        WebElement giris = driver.findElement(By.id("lteq30"));
        giris.sendKeys("20");
        giris.submit();

        //And then verify Submitted Values is displayed open page
        boolean submittedValues = driver.findElement(By.xpath("//*[text()='Submitted Values']")).isDisplayed();
        System.out.println("submittedValues isDisplayed = " + submittedValues);

        //Close driver.
        driver.quit();
    }
}