package Day09.Tasks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW02_WindowHandleHomework extends Base {
    /*
Go to URL: https://the-internet.herokuapp.com/windows
Verify the text: “Opening a new window”
Verify the title of the page is “The Internet”
Click on the “Click Here” button
Verify the new window title is “New Window”
Go back to the previous window and then verify the title: “The Internet”

URL'ye gidin: https:the-internet.herokuapp.comwindows Metni doğrulayın: "Yeni bir pencere açılıyor"
 Sayfanın başlığının "İnternet" olduğunu doğrulayın
 "Buraya Tıklayın" düğmesine tıklayın
 Yeni pencere başlığının "Yeni" olduğunu doğrulayın
 Pencere” Önceki pencereye dönün ve ardından başlığı doğrulayın: “İnternet”

  */
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        String windowHandle=driver.getWindowHandle();
        WebElement open = driver.findElement(By.xpath("//div[@class='example']"));
        Assert.assertTrue(open.isDisplayed());
        String baslık = driver.getTitle();
        System.out.println("baslık = " + baslık);
        Assert.assertTrue(baslık.contains("The Internet"));
        WebElement clickHere = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHere.click();
        bulanaKadarBekle();
        WebElement newWindow = driver.findElement(By.xpath("//*[@class='example'][h3]"));
        Assert.assertTrue(newWindow.isDisplayed());

        driver.switchTo().window(windowHandle);
        String yeniBaslık=driver.getTitle();
        System.out.println("yeniBaslık = " + yeniBaslık);
        Assert.assertTrue(yeniBaslık.contains("The Internet"));

        bekleKapat(2);
    }
}
