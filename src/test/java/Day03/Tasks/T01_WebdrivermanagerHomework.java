package Day03.Tasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_WebdrivermanagerHomework {
       static WebDriver driver=new ChromeDriver();
    public static void main(String[] args) {

      /*

• Set Path.
• Create chrome driver.
• Maximize the window.
• Open google home page https://www.google.com/
• Verify that you are Google in the title.

            */


    }
    @Test
    public void testTitle() {
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Assert.assertEquals("Title Eşleşmedi","Google",driver.getTitle());
    }
}
