package Day04_Locator.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Homework_4 extends Base {
    //https://id.heroku.com/login sayfasına gidiniz.
    //Bir mail adresi giriniz.
    //Bir password giriniz.
    //Login butonuna tıklayınız.
    //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
    //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
    //Tüm sayfaları kapatınız.


    @Test
    public void test01() throws InterruptedException {

        //https://id.heroku.com/login sayfasına gidiniz.
        WebDriver driver = new ChromeDriver();
        driver.get("https://id.heroku.com/login");

        //Bir mail adresi giriniz.
        driver.findElement(By.xpath("//input[@name='email'][@type='email']")).sendKeys("ibrahim@gmail.com");

        //Bir password giriniz.
        driver.findElement(By.xpath("//input[@name='password'][@placeholder='Password']")).sendKeys("ibrahim");

        //Login butonuna tıklayınız.
        driver.findElement(By.name("commit")).click();

        //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
        boolean gorulenMesaj=driver.findElement(By.xpath("//*[@role='alert']")).isDisplayed();
        if (gorulenMesaj){
            System.out.println("Kayıt Yapılamadı");

        //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
        }else {
            System.out.println("Kayıt Yapıldı");
        }

        //Tüm sayfaları kapatınız.
        driver.quit();

    }
}