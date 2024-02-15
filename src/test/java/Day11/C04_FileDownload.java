package Day11;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownload extends Base {



    @Test
    public void fileDownload() throws InterruptedException {
      /*
        https://the-internet.herokuapp.com/download
download testing.pdf

       */

        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.linkText("testing.pdf")).click();

        bekle(2);

        String path =System.getProperty("user.home")+
                System.getProperty("file.separator")+
                "Downloads"+
                System.getProperty("file.separator")+
                "teting.pdf";

        boolean isExists = Files.exists(Paths.get(path));
        Assert.assertTrue(isExists);

    }
}
