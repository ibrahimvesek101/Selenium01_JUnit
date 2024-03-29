package Day12_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import Utilities.Base;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class C04_Screenshots extends Base {

    @Test
    public void screenshot() throws Exception {

        // ekran goruntusu alacak objemizi olusturuyoruz

        // daha sonra ekran goruntusu alma methodunu cagiriyoruz alinan ekran goruntusunu sakliyoruz

        // Son olarak alinan goruntuyu dosyaya yaziyoruz (.png, .jpg)

        driver.get("https://www.linkedin.com");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        //Iki farkli copyFile methodundan istediginizi kullanabilirsiniz
        FileUtils.copyFile(source, new File("./test-output/photo1.jpg"));

        //FileHandler.copy(source, new File(".\\test-output\\photo.png"));
    }
}
