package Day08.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW_02_iFrameHomework1 extends Base {
    /*
    https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
Web sitesini maximize yapınız.
İkinci emojiye tıklayınız.
Tüm ikinci emoji öğelerine tıklayınız.
Parent iframe geri dönünüz.
Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button’a basınız
     */
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        driver.switchTo().frame("emoojis");

        WebElement secondEmojiTab = driver.findElement(By.xpath("//a[contains(@href,'nature')]"));
        secondEmojiTab.click();

        List<WebElement> emojiList = driver.findElements(By.xpath("//div[@id='nature']//img"));

        emojiList.forEach(WebElement::click);

        driver.switchTo().defaultContent();


        //Form

        driver.findElement(By.id("text")).sendKeys("İbrahim");
        driver.findElement(By.id("smiles")).sendKeys("Vesek");
        driver.findElement(By.id("nature")).sendKeys("Vesek");
        driver.findElement(By.id("food")).sendKeys("Vesek");
        driver.findElement(By.id("activities")).sendKeys("Vesek");
        driver.findElement(By.id("places")).sendKeys("Vesek");
        driver.findElement(By.id("objects")).sendKeys("Vesek");
        driver.findElement(By.id("symbols")).sendKeys("Vesek");
        driver.findElement(By.id("flags")).sendKeys("Vesek");
        driver.findElement(By.id("hide")).sendKeys(":)))))");
        driver.findElement(By.id("active")).sendKeys("Balıkesir");
        driver.findElement(By.id("send")).click();

        bekleKapat(3);
    }
}
