import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class vesek_deneme extends Base {


    @Test
    public void test1() {
        driver.get("https://www.google.com/");
        bulanaKadarBekle();
        driver.findElement(By.id("APjFqb")).sendKeys("vesek ibrahim"+Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class='hdtb-mitem']/a)[1]")).click();
    }
      @Test
    public void test2() {
        driver.get("https://www.google.com/");
        bulanaKadarBekle();
        driver.findElement(By.id("APjFqb")).sendKeys("vesek ibrahim"+Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class='hdtb-mitem']/a)[1]")).click();
    }
      @Test
    public void test3() {
        driver.get("https://www.google.com/");
        bulanaKadarBekle();
        driver.findElement(By.id("APjFqb")).sendKeys("vesek ibrahim"+Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class='hdtb-mitem']/a)[1]")).click();
    }
      @Test
    public void test4() {
        driver.get("https://www.google.com/");
        bulanaKadarBekle();
        driver.findElement(By.id("APjFqb")).sendKeys("vesek ibrahim"+Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class='hdtb-mitem']/a)[1]")).click();
    }
     @Test
    public void test5() {
        driver.get("https://www.google.com/");
        bulanaKadarBekle();
        driver.findElement(By.id("APjFqb")).sendKeys("vesek ibrahim"+Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class='hdtb-mitem']/a)[1]")).click();
    }



}
