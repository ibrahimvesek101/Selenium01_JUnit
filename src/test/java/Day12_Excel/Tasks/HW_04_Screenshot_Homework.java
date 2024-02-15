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

public class HW_04_Screenshot_Homework extends Base {

    @Test
    public void test() throws IOException {

        /*
Go to amazon.com.
Take Page ScreenShot.
Spesific WebElement ScreenShot

         */

        driver.get("http://www.amazon.com");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        //Iki farkli copyFile methodundan istediginizi kullanabilirsiniz

        Date zaman=new Time(System.nanoTime());
        FileUtils.copyFile(source, new File("/Users/ibrahim/IdeaProjects/JunitSelenium/src/test/java/Day12_Excel/Tasks/EkranGörüntüleri/HW_04_Ek.Gör."+ zaman+".jpg"));

        //FileHandler.copy(source, new File(".\\test-output\\photo.png"));

        WebElement resim= driver.findElement(By.id("desktop-grid-2"));
        File source2 = resim.getScreenshotAs(OutputType.FILE);

        //Iki farkli copyFile methodundan istediginizi kullanabilirsiniz

        Date zaman2=new Time(System.nanoTime());
        FileUtils.copyFile(source2, new File("/Users/ibrahim/IdeaProjects/JunitSelenium/src/test/java/Day12_Excel/Tasks/EkranGörüntüleri/HW_04_Ek.Gör."+ zaman2+".jpg"));

    }

}
