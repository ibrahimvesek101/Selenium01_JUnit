package Day03.Tasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T02_Assertion_Homework {
    public static void main(String[] args) {

        /*
        Go to Amazon homepage.
        Do the following tasks by creating 2 different test methods.
        1- Test if the URL contains Amazon.
        2- Test if the title does not contain Facebook.
         */
    }


    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("amazon"));
        driver.quit();

    }


    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String title = driver.getTitle();
       Assert.assertFalse(title.contains("Facebook"));
    driver.quit();
    }

}
