package Day06.Tasks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckboxHomework02 extends Base {

    /*
        Go to URL: https://demoqa.com/
        Click on Elements.
        Click on Checkbox.
        Verify if Home checkbox is selected.
        Verify that "You have selected" is visible
     */
    @Test
    public void test01() throws InterruptedException {
        //     Go to URL: https://demoqa.com/
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        //     Click on Elements.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("(//*[@class='card mt-4 top-card'])[1]")).click();
        //     Click on Checkbox.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("item-1")).click();



        //     Verify if Home checkbox is selected.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).click();

        //     Verify that "You have selected" is visible

        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='rct-text']")).isDisplayed());

         driver.quit();
    }


}
