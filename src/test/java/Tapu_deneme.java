import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.sql.Time;
import java.util.Date;

public class Tapu_deneme extends Base {


    @Test
    public void test1() {

        driver.get("https://www.turkiye.gov.tr/tapu-bilgileri-sorgulama?hizmet=Ekrani");
        driver.findElement(By.xpath("//*[@class='loginLink']")).click();

        WebElement tc = driver.findElement(By.id("tridField"));
        tc.sendKeys("323323223");

        WebElement sifre = driver.findElement(By.id("egpField"));
        sifre.sendKeys("56465" + Keys.ENTER);


        WebElement text = driver.findElement(By.xpath("//*[@class='reminderContainer']"));
        String textString = text.getText();
        System.out.println("textString = " + textString);
        Object mevcutTapuSayısı = 0;

        for (int i = 0; i < textString.length(); i++) {

            if (Character.isDigit(textString.charAt(i))) {
                mevcutTapuSayısı = textString.charAt(i);
                break;
            }
        }

        System.out.println("mevcutTapuSayısı = " + mevcutTapuSayısı);
        
    }
}
