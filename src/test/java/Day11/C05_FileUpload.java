package Day11;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C05_FileUpload extends Base {

    @Test
    public void fileUpload() throws Exception {
        /*

        Go to URL: https://the-internet.herokuapp.com/upload
        Find the path of the file that you want to upload.
        Click on Upload button.
        Verify the upload message.

         */

        driver.get("https://the-internet.herokuapp.com/upload");
        String path = System.getProperty("user.dir") + System.getProperty("file.separator") +
                "fileExists.txt";

        WebElement cooseFile = driver.findElement(By.id("file-upload"));
        cooseFile.sendKeys(path);

        WebElement submit = driver.findElement(By.id("file-submit"));
        submit.click();

        WebElement infoMessage = driver.findElement(By.xpath("//h3[.='File Uploaded!']"));
        Assert.assertTrue(infoMessage.isDisplayed());

    }
}
