package Utilities;

import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Base {

    public static WebDriver driver;

    protected Actions actions;


    @Before
    public void setup() {
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        actions = new Actions(driver);

    }

    @After
    public void teardown() throws InterruptedException {
       bekleKapat(1);



                // BENİM ŞAHSİ OLUŞTURDUĞUM METHODLAR :
    }
    public static void bekleKapat(int beklenecekSaniye) throws InterruptedException {
        Thread.sleep(beklenecekSaniye*1000);
        driver.quit();
    }
    public static void bulanaKadarBekle(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public static void bekle(int beklenecekSaniye) throws InterruptedException {
        Thread.sleep(beklenecekSaniye*1000);
    }


}
