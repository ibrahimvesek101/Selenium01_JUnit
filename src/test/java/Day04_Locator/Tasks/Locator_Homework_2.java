package Day04_Locator.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locator_Homework_2 {
    //Go to http://www.google.com
    //Type "Green Mile" in the search box and print the number of results.
    //Type "Premonition" in the search box and print the number of results.
    //Type "The Curious Case of Benjamin Button" in the search box and print the number of results.

    /*
    http:www.google.com adresine gidin,
     arama kutusuna "Green Mile" yazın ve sonuç sayısını yazdırın.
      Arama kutusuna "Premonition" yazın ve sonuç sayısını yazdırın.
       Arama kutusuna "Benjamin Button'ın Tuhaf Hikayesi" yazın ve sonuç sayısını yazdırın.
     */
    public static void main(String[] args) throws InterruptedException {

        sonucSayısı("Green Mile");
        sonucSayısı("Premonition");
        sonucSayısı("Benjamin Button'ın Tuhaf Hikayesi");
    }

    @Test
    public static void sonucSayısı(String aranacakText) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        WebElement textArea = driver.findElement(By.id("APjFqb"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        textArea.sendKeys(aranacakText);
        driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();


        String sonuç = driver.findElement(By.id("result-stats")).getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("'"+aranacakText+"' için " + sonuç);
        driver.quit();

    }
}
