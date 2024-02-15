package Day04_Locator.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Homework_5 extends Base {
    //Navigate to https://testpages.herokuapp.com/styled/index.html
    //Click on Calculate under Micro Apps.
    //Type any number in the first input.
    //Type any number in the second input.
    //Click on Calculate.
    //Get the result.
    //Print the result.


    @Test
    public void test01() throws InterruptedException {

        //Navigate to https://testpages.herokuapp.com/styled/index.html
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        //Click on Calculate under Micro Apps.
        driver.findElement(By.id("calculatetest")).click();

        //Type any number in the first input.
        driver.findElement(By.id("number1")).sendKeys("570");

        //Type any number in the second input.

        driver.findElement(By.id("number2")).sendKeys("1");

        //Click on Calculate.
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        //Get the result.
        String result=driver.findElement(By.id("answer")).getText();

        //Print the result
        System.out.println("result = " + result);

        driver.quit();

    }
}
