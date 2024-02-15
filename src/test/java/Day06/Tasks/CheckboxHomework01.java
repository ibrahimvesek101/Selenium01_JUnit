package Day06.Tasks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHomework01 extends Base {

    /*
    Go to https://the-internet.herokuapp.com/checkboxes
    Locate the elements of checkboxes.
    Then click on checkbox 1 if box is not selected.
    Then click on checkbox 2 if box is not selected.
    Then verify that checkbox 1 is checked.


     */

    @Test
    public void test01() throws InterruptedException {

//   Go to https://the-internet.herokuapp.com/checkboxes
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");


//   Locate the elements of checkboxes.
        WebElement checkbox1 = driver.findElement(By.xpath("(//*[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//*[@type='checkbox'])[2]"));

//   Then click on checkbox 1 if box is not selected.
        if (!checkbox1.isSelected()){
            checkbox1.click();
        }

//   Then click on checkbox 2 if box is not selected.
        if (!checkbox2.isSelected()){
            checkbox2.click();
        }

//   Then verify that checkbox 1 is checked.
        Assert.assertTrue(checkbox1.isSelected());
    }
}
