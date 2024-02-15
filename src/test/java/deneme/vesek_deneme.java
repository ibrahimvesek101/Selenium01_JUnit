package deneme;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import javax.swing.*;

public class vesek_deneme extends Base {


    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.google.com/");
        bulanaKadarBekle();
        driver.findElement(By.id("APjFqb")).sendKeys("vesek ibrahim"+Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class=\"FMKtTb UqcIvb\"])[1]")).click();
        driver.findElement(By.xpath("(//*[@class=\"rg_i Q4LuWd\"])[1]")).click();
        driver.findElement(By.xpath("(//h1[@class=\"GW0XC indIKd cS4Vcb-pGL6qe-fwJd0c\"])[1]"));
    }
      @Test
    public void test2() {
        driver.get("https://www.google.com/");
        bulanaKadarBekle();
        driver.findElement(By.id("APjFqb")).sendKeys("vesek ibrahim"+Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class=\"FMKtTb UqcIvb\"])[1]")).click();
    }
      @Test
    public void test3() {
        driver.get("https://www.google.com/");
        bulanaKadarBekle();
        driver.findElement(By.id("APjFqb")).sendKeys("vesek ibrahim"+Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class=\"FMKtTb UqcIvb\"])[1]")).click();
    }
      @Test
    public void test4() {
        driver.get("https://www.google.com/");
        bulanaKadarBekle();
        driver.findElement(By.id("APjFqb")).sendKeys("vesek ibrahim"+Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class=\"FMKtTb UqcIvb\"])[1]")).click();
    }
     @Test
    public void test5() {
        driver.get("https://www.google.com/");
        bulanaKadarBekle();
        driver.findElement(By.id("APjFqb")).sendKeys("vesek ibrahim"+Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class=\"FMKtTb UqcIvb\"])[1]")).click();
    }



}
