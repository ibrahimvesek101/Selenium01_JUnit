package Day12_Excel;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C05_Screenshots extends Base {

    @Test
    public void screenshot() throws Exception {

        driver.get("https://www.linkedin.com");

        WebElement username= driver.findElement(By.xpath("//icon[@data-test-id]"));

        File source=username.getScreenshotAs(OutputType.FILE);

        String date= new SimpleDateFormat("yyyyMMddss").format(new Date());

        String path="./test-output/screenshot"+date+".png";

        File destination=new File(path);

        FileHandler.copy(source, destination);



    }
}
