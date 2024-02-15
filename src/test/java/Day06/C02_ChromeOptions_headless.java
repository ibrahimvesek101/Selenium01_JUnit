package Day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02_ChromeOptions_headless {

//    start-maximized: Chrome'u büyütme modunda açar.
//    incognito: Chrome'u gizli modda açar.
//    headless: Chrome'u başsız modda açar.
//    disable-extensions: Chrome tarayıcısında mevcut uzantıları devre dışı bırakır.
//    disable-popup-blocking: Chrome tarayıcısında görüntülenen açılır pencereleri devre dışı bırakır.
//    make-default-browser: Chrome'u varsayılan tarayıcı yapar.
//    version: Chrome tarayıcı sürümünü yazdırır.
//    disable-infobars: Chrome'un "Chrome otomatik yazılım tarafından kontrol ediliyor" bildirimini görüntülemesini engeller.


    @Test
    public void headless() {

        WebDriverManager.chromedriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com/");

        System.out.println("Title = " + driver.getTitle());

        driver.quit();

    }
}