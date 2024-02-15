package Day08.Tasks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW_01_UntitledHomework extends Base {

    /*
    Go to URL: http://demo.automationtesting.in/Alerts.html
Click "Alert with OK" and click 'click the button to display an alert box:’
Accept Alert(I am an alert box!) and print alert on console.
Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’
Cancel Alert  (Press a Button !)
Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’
And then sendKeys «BootcampCamp» (Please enter your name)
Finally print on console this message "Hello BootcampCamp How are you today" assertion these message.



URL'ye gidin: http:demo.automationtesting.inAlerts.html "Tamam ile Uyarı"ya tıklayın
 ve "bir uyarı kutusu görüntülemek için düğmeyi tıklayın:"
Uyarıyı Kabul Et(Ben bir uyarı kutusuyum!) ve uyarıyı konsolda yazdırın.
 "Tamam ve İptal ile Uyarı"yı tıklayın ve "bir onay kutusu görüntülemek için düğmeyi tıklayın"
 Uyarıyı İptal Et (Bir Düğmeye Basın!) BootcampCamp» (Lütfen adınızı giriniz)
 Son olarak konsola bu mesajı yazdırın "Merhaba BootcampCamp Bugün Nasılsınız" bu mesajı onaylayın.
     */

    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.automationtesting.in/Alerts.html");
        //    driver.findElement(By.xpath("(//*[@class='analystic'])[1]")).click();
        //    bekle(1);
        //    driver.findElement(By.xpath("(//*[@class='btn btn-danger'])[1]")).click();
        //    System.out.println(driver.switchTo().alert().getText());


        //      driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
        //      driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[1]")).click();
        //      driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("(//*[@class='analystic'])[3]")).click();
        driver.findElement(By.xpath("(//*[@class='btn btn-info'])[1]")).click();
        driver.switchTo().alert().sendKeys("ibrahim vesek");
        driver.switchTo().alert().accept();
        WebElement text = driver.findElement(By.xpath("//*[@id='demo1']"));
        System.out.println(text.getText());

        Assert.assertTrue(text.isDisplayed());
        bekleKapat(2);
    }
}
