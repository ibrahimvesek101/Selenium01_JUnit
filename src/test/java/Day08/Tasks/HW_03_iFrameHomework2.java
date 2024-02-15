package Day08.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW_03_iFrameHomework2 extends Base {
    /*
Go to URL: http://demo.guru99.com/test/guru99home/
Find the number of iframes on the page.
Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
Exit the iframe and return to the main page.

URL'ye gidin: http:demo.guru99.comtestguru99home Sayfadaki iframe sayısını bulun.
Dördüncü iframe bağlantısı (JMeter Made Easy) (https:www.guru99.comlive selenium project.html) buraya tıklayın.
iframe'den çıkın ve ana sayfaya dönün.
     */

    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("/html/body/a")).click();
        driver.switchTo().defaultContent();
        bekleKapat(3);
    }
}
