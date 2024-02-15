package Day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManager {

    public static void main(String[] args) {

        //Webdrivermanager class i kullanilarak istenilen browser in driver binary leri otomatik olarak indirilir.
        WebDriverManager.chromedriver().setup();

        //Driver objesi olusturulur
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
    }

}
