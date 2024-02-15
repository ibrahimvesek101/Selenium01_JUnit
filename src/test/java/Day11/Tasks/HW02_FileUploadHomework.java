package Day11.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;

public class HW02_FileUploadHomework extends Base {

    /*

    Go to URL: https://www.monsterindia.com/seeker/registration
    Upload file.

     */


    @Test
    public void UploadFileTest() throws InterruptedException {

        driver.get("https://www.monsterindia.com/seeker/registration");

        String path = System.getProperty("user.dir") + System.getProperty("file.separator") +
                "selam.docx";

        WebElement uploadFile = driver.findElement(By.xpath("//input[@type='file']"));
        uploadFile.sendKeys(path);

        WebElement okayButton = driver.findElement(By.xpath("//div[@class='primaryBtn commonBtn']"));
        okayButton.click();

    }
}
