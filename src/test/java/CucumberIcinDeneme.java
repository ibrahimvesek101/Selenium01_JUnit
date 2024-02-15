import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CucumberIcinDeneme extends Base {


    @Test
    public void test1() {
        driver.get("https://www.google.com/");
        bulanaKadarBekle();
        driver.findElement(By.id("APjFqb")).sendKeys("vesek ibrahim"+Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class='hdtb-mitem']/a)[1]")).click();
    }






}
