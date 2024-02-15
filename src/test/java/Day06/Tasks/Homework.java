package Day06.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework extends Base {
    /*
     https://www.teknosa.com/ adresine gidiniz.
      Arama çubuğuna ‘’oppo’’ yazıp ENTER tıklayınız.
      Sonuç sayısını yazdırınız.
      Çıkan ilk ürüne tıklayınız.
      Sepete ekleyiniz.
      Sepetime gite tıklayınız.
      Konsolda "Sipariş Özeti" WebElement’inin text’ini yazdırınız.
      Alışverişi tamamlayınız.
      Son olarak "Teknosa’ya Hoş Geldiniz" WebElement’inin text’ini yazdırınız.
      Driver’ı kapatınız.

     */
    @Test
    public void testTeknosa() throws InterruptedException {
        //      https://www.teknosa.com/ adresine gidiniz.
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.teknosa.com/");
        //      Arama çubuğuna ‘’oppo’’ yazıp ENTER tıklayınız.
        WebElement search = driver.findElement(By.id("search-input"));
        search.sendKeys("oppo");
        search.submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //      Sonuç sayısını yazdırınız.
        String sonuç = driver.findElement(By.xpath("//*[@class='plp-info']")).getText();
        System.out.println("sonuç = " + sonuç);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //      Çıkan ilk ürüne tıklayınız.
        // WebElement ilkUrun = driver.findElement(By.xpath("(//*[@class='prd-link gowitPlp-js'])[1]"));
        WebElement ilkUrun = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[1]/a"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        ilkUrun.click();

        //      Sepete ekleyiniz.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("(//*[@id='addToCartButton'])[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //      Sepetime gite tıklayınız.

        driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[3]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //      Konsolda "Sipariş Özeti" WebElement’inin text’ini yazdırınız.
        System.out.println(driver.findElement(By.xpath("//*[@class='cart-sum-body']")).getText());

        //      Alışverişi tamamlayınız.
        driver.findElement(By.xpath("//*[@class='btn btn-primary js-checkout-controls']")).click();

        //      Son olarak "Teknosa’ya Hoş Geldiniz" WebElement’inin text’ini yazdırınız.

        System.out.println(driver.findElement(By.xpath("//*[@class='lrp-title']")).getText());
        //      Driver’ı kapatınız.
        driver.quit();
    }

}
