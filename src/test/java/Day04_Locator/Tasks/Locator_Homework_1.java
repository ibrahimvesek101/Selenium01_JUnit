package Day04_Locator.Tasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Homework_1 {

    //Go to http://automationpractice.com/index.php
    //When we write an e-mail without the @ sign in the e-mail box and press enter.
    //Let's test the "Invalid email address" warning.
    public static void main(String[] args) {

    }

    @Test
    public void testEmail() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.pl/index.php");
        WebElement login = driver.findElement(By.xpath("//a[@class='login'][@title='Log in to your customer account']"));
        login.click();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("asa.asa.com");
        driver.findElement(By.id("SubmitLogin")).click();

        String gelenMesaj = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText();
        String mesaj = "Invalid email address.";

        Assert.assertNotEquals(mesaj, gelenMesaj);
        driver.quit();
    }
}
