package Day09.Tasks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HW05_ActionsHomework extends Base {
    /*

Go to URL: http://demo.guru99.com/test/drag_drop.html
Drag and drop the BANK button to the Account section in DEBIT SIDE
Drag and drop the SALES button to the Account section in CREDIT SIDE
Drag and drop the 5000 button to the Amount section in DEBIT SIDE
Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
Verify the visibility of Perfect text.

URL'ye gidin: http:demo.guru99.comtestdrag_drop.html
BORÇ TARAFINDAN BANKA düğmesini sürükleyip bırakın,
SATIŞ düğmesini KREDİ TARAFINDAN Hesap bölümüne sürükleyip bırakın.
BORÇ TARAFI İkinci 5000 düğmesini KREDİ TARAFINDAN MİKTAR bölümüne sürükleyip bırakın
Mükemmel metnin görünürlüğünü doğrulayın.

     */

    @Test
    public void test() {
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        Actions actions = new Actions(driver);

        WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        WebElement besBin = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
        WebElement ikinciBesBin = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));

        WebElement debitSideAccount = driver.findElement(By.xpath("(//*[@class='placeholder'])[1]"));
        WebElement debitSideAmount = driver.findElement(By.xpath("(//*[@class='placeholder'])[2]"));
        WebElement creditSideAccount = driver.findElement(By.xpath("(//*[@class='placeholder'])[3]"));
        WebElement creditSideAmount = driver.findElement(By.xpath("(//*[@class='placeholder'])[4]"));

        actions.dragAndDrop(bank, debitSideAccount).perform();
        actions.dragAndDrop(besBin, debitSideAmount).perform();
        actions.dragAndDrop(sales, creditSideAccount).perform();
        actions.dragAndDrop(ikinciBesBin, creditSideAmount).perform();

        WebElement perfect = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[5]/a"));
        System.out.println("perfect.getText() = " + perfect.getText());
        Assert.assertTrue(perfect.isDisplayed());

    }
}