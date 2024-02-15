package Day13.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW_01_WebTablesHomework extends Base {

    @Test
    public void test() throws InterruptedException {
/*
Go to URL: http://demo.guru99.com/test/web-table-element.php
To find third row of table
To get 3rd row's 2nd column data
Get all the values of a Dynamic Table


URL'ye gidin: http:demo.guru99.comtestweb-table-element.php
Tablonun üçüncü satırını bulmak için 3. satırın 2. sütun verilerini almak için Dinamik Tablonun tüm değerlerini alın
 */

        driver.get("http://demo.guru99.com/test/web-table-element.php");
        WebElement table = driver.findElement(By.xpath("//*[@class='dataTable']//tbody"));
        WebElement row3cell2 = table.findElement(By.xpath("//tr[3]//td[2]"));
        String row3cell2Text = row3cell2.getText();

        System.out.println("row3cell2Text = " + row3cell2Text);

        bekleKapat(5);

    }
}
