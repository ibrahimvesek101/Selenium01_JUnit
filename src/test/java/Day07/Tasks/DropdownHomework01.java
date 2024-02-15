package Day07.Tasks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class DropdownHomework01 extends Base {
    /*

    Go to URL: https://the-internet.herokuapp.com/dropdown
Create method selectByIndexTest and Select Option 1 using index .
Create method selectByValueTest Select Option 2 by value.
Create method selectByVisibleTextTest Select Option 1 value by visible text.
Create method printAllTest Print all dropdown value.
Verify the dropdown has Option 2 text.
Create method printFirstSelectedOptionTest Print first selected option.
Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.


     URL'ye gidin: https:the-internet.herokuapp.comdropdown
     SelectByIndexTest yöntemi oluşturun ve index kullanarak Seçenek 1'i seçin.
     Yöntemi oluştur selectByValueTest Seçenek 2'yi değere göre seçin.
     Yöntem selectByVisibleTextTest oluşturun Görünür metinle Seçenek 1 değerini seçin.
     printAllTest yöntemini oluştur Tüm açılır değeri yazdır.
     Açılır listede Seçenek 2 metni olduğunu doğrulayın.
     Yöntem oluşturun printFirstSelectedOptionTest İlk seçilen seçeneği yazdırın.
     Açılır listenin boyutunu bulun, açılır listede 3 öğe yoksa "Beklenen Eşit Gerçek Değil" yazdırın.
     */


    @Test
    public void SelectByIndexTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement secenek = driver.findElement(By.id("dropdown"));
        Select select = new Select(secenek);
        select.selectByIndex(1);
        bekleKapat(2);
    }

    @Test
    public void selectByValueTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement secenek = driver.findElement(By.id("dropdown"));
        Select select = new Select(secenek);
        select.selectByValue("2");
        bekleKapat(2);

    }

    @Test
    public void selectByVisibleTextTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement secenek = driver.findElement(By.id("dropdown"));
        Select select = new Select(secenek);
        select.selectByVisibleText("Option 1");
        bekleKapat(2);

    }

    @Test
    public void printAllTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement secenek = driver.findElement(By.id("dropdown"));

        System.out.print(secenek.getText());

        Assert.assertTrue(secenek.getText().contains("Option 2"));


        bekleKapat(2);
    }

    @Test
    public void printFirstSelectedOptionTest() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement selectOption = driver.findElement(By.id("dropdown"));
        Select select = new Select(selectOption);

        List<WebElement> options = select.getOptions();

        System.out.println("options.size() = " + options.size());


        if(options.size()==3){
            System.out.println("Expected is Equal Actual");
        }else System.out.println("Expected is not Equal Actual");
        bekleKapat(2);
    }
}