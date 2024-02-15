package Day09.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

public class HW06_ActionsHomework extends Base {
    /*
Go to URL: https://rangeslider.js.org/
Shift 100 units to the right and 100 units to the left on the horizontal axis.


URL'ye gidin: https:rangeslider.js.org
Yatay eksende 100 birim sağa ve 100 birim sola kaydırın.
     */

    @Test
    public void test() {

        driver.get("https://rangeslider.js.org/");

        Actions actions1=new Actions(driver);

        actions1.scrollByAmount(100,100).perform();


    }

}
