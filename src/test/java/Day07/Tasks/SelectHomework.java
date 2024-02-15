package Day07.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Utilities.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SelectHomework extends Base {
    /*
    Go to URL: https://demoqa.com/select-menu
Get all the options of the dropdown
Options size
Print all test
Verify the dropdown has option "Black"
Print FirstSelectedOptionTest
Select option "Yellow

URL'ye gidin: https:demoqa.comselect-menu
Açılır menüdeki tüm seçenekleri alın
Seçenekler boyutu
Tüm testi yazdır
Açılır listede "Siyah" seçeneğinin olduğunu doğrulayın
FirstSelectedOptionTest Yazdır
"Sarı" seçeneğini seçin
     */


    @Test
    public void testSelect() throws InterruptedException {

        driver.get("https://demoqa.com/select-menu");

        WebElement selection = driver.findElement(By.id("oldSelectMenu"));

        Select select = new Select(selection);

        //    Get all the options of the dropdown

        List<WebElement> allOption = select.getOptions();
        int size = allOption.size();
        System.out.println("size = " + size);

        for (WebElement option : allOption) {
            System.out.println(option.getText());
        }

        //    Verify the dropdown has option "Black"
        select.selectByVisibleText("Black");
        String text = select.getFirstSelectedOption().getText();
        Assert.assertTrue(text.equals("Black"));


        // Green seçtik ve 1.sırada seçileninin Green olduğunu yazırarak gördük:(kendi merakım)
 //       select.selectByVisibleText("Green");
 //       String green=select.getFirstSelectedOption().getText();
 //       System.out.println("green = " + green);


        //    Print FirstSelectedOptionTest
        System.out.println("select.getFirstSelectedOption() = " + select.getFirstSelectedOption().getText());

        //    Select option "Yellow"
        select.selectByVisibleText("Yellow");


        bekleKapat(1);


    }
}