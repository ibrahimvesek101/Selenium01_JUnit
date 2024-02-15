package Day07.Tasks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DorpdownHomework03 extends Base {
    /*
    Launch the browser.
Open "https://demoqa.com/select-menu".
Select the Standard Multi-Select using the element id.
Verifying that the element is multi-select.
Select 'Opel' using the index and deselect the same using index.
Select 'Saab' using value and deselect the same using value.
Deselect all the options.
Close the browser.

Tarayıcıyı başlatın.
"https:demoqa.comselect-menu" öğesini açın.
 Öğe kimliğini kullanarak Standart Çoklu Seçimi seçin.
 Öğenin çoklu seçim olduğu doğrulanıyor.
 Dizini kullanarak 'Opel'i seçin ve dizini kullanarak aynı seçimi kaldırın.
 Değer kullanarak 'Saab'ı seçin ve aynı kullanım değeri seçimini kaldırın.
 Tüm seçeneklerin seçimini kaldırın.
 Tarayıcıyı kapatın.
     */

    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        //  WebElement multiselect = driver.findElement(By.xpath("(//*[@class=' css-1wa3eu0-placeholder'])[3]"));
        WebElement multiselect = driver.findElement(By.id("cars"));
        Select select = new Select(multiselect);

        Assert.assertTrue(select.isMultiple());

        //     select.selectByIndex(2);
        //     bekle(1);
        //     select.deselectByIndex(2);
        //     bekleKapat(2);

        //      select.selectByValue("saab");
        //      bekle(1);
        //      select.deselectByValue("saab");
        //      bekleKapat(2);


        select.selectByIndex(0);
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);
        bekle(1);
        select.deselectAll();
        bekleKapat(2);


    }

}
