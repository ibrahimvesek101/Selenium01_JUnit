package Day12_Excel.Tasks;

import Utilities.Base;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;

public class HW_05_Screenshot_Homework extends Base {

    @Test
    public void test() throws IOException {

        /*
Go to n11.com.
Take Full Page Screenshot.
Take Page ScreenShot.
Spesific WebElement ScreenShot

         */

        driver.get("http://www.n11.com");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        //Iki farkli copyFile methodundan istediginizi kullanabilirsiniz

        Date zaman=new Time(System.nanoTime());
        FileUtils.copyFile(source, new File("/Users/ibrahim/IdeaProjects/JunitSelenium/src/test/java/Day12_Excel/Tasks/EkranGörüntüleri/HW_05_Ek.Gör."+ zaman+".jpg"));

        //FileHandler.copy(source, new File(".\\test-output\\photo.png"));


        // elementin ek.görüntüsü..

        WebElement resim= driver.findElement(By.xpath("(//*[@class='lazy cardImage'])[1]"));
        File source2 = resim.getScreenshotAs(OutputType.FILE);


        Date zaman2=new Time(System.nanoTime());
        FileUtils.copyFile(source2, new File("/Users/ibrahim/IdeaProjects/JunitSelenium/src/test/java/Day12_Excel/Tasks/EkranGörüntüleri/HW_05_Ek.Gör."+ zaman2+".jpg"));

    }
}
