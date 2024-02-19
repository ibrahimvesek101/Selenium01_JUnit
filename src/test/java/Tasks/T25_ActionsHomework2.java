package Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class T25_ActionsHomework2 extends Base {

    /*
    Go to URL: https://rangeslider.js.org/
    Shift 100 units to the right and 100 units to the left on the horizontal axis.
     */
    @Test
    public void dragSliderRihtAndLeft ()
    {
        driver.get("https://rangeslider.js.org/");
        WebElement slider = driver.findElement(By.xpath("//div[@class='rangeslider__handle']"));

        WebElement output = driver.findElement(By.id("js-output"));

        Actions act = new Actions (driver);

        act.dragAndDropBy(slider, 100, 0).perform();
        System.out.println("What Is The Output After Dragging Right? " + output.getText()); //490

        act.dragAndDropBy(slider, -100, 0).perform();
        System.out.println("What Is The Output After Dragging Left? " + output.getText()); //300


    }

}
