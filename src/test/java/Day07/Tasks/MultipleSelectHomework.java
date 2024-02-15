package Day07.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectHomework extends Base {
    /*
    Go to URL: https://demoqa.com/select-menu
Select options in Standard multiple select

     */
@Test
    public void testMultipleSelect(){
    driver.get("https://demoqa.com/select-menu");
    //  WebElement multiselect = driver.findElement(By.xpath("(//*[@class=' css-1wa3eu0-placeholder'])[3]"));
    WebElement multiselect = driver.findElement(By.id("cars"));
    Select select = new Select(multiselect);
    select.selectByIndex(3);
}
}
