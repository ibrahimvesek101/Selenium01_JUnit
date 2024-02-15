package Day09.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class HW01_WindowHandleHomework extends Base {

    /*
Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/
Print the existing windowHandles ids by clicking all the links on the page.
Click on the links that open a new page.
Close other pages other than the home page.
Set the driver back to the main page.

URL'ye gidin: https://www.toolsqa.com/selenium-webdriverwindow-handle-in-selenium
Sayfadaki tüm bağlantılara tıklayarak mevcut windowHandles kimliklerini yazdırın.
Yeni bir sayfa açan bağlantılara tıklayın.
Ana sayfa dışındaki diğer sayfaları kapatın.
Sürücüyü ana sayfaya geri ayarlayın.

     */
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.toolsqa.com/selenium-webdriverwindow-handle-in-selenium");
        System.out.println(driver.getWindowHandle());
        String homeUrl = driver.getCurrentUrl();
        String homeHandle = driver.getWindowHandle();
        bekle(2);
        WebElement windowHandle = driver.findElement(By.xpath("(//*[@class='profile-type'])[3]"));
        windowHandle.click();
        String linkedinUrl = driver.getCurrentUrl();
        driver.switchTo().newWindow(WindowType.TAB).get(linkedinUrl);
        String linkedinHandle = driver.getWindowHandle();

        bekle(2);
        driver.switchTo().window(homeHandle);
        driver.get(homeUrl);
        bekle(2);
        driver.switchTo().window(linkedinHandle);
        driver.close();
        bekle(2);
        driver.switchTo().window(homeHandle);

        bekleKapat(5);
    }


}
