package Day13.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW_02_WebTablesHomework extends Base {

    @Test
    public void test() {
/*
Go to URL: https://the-internet.herokuapp.com/tables
Print the entire table
Print All Rows
Print Last row data only
Print column 5 data in the table body
Write a method that accepts 3 parameters
parameter 1 = table
parameter 2 = row number
parameter 3 = column number
printData(table,3,4); => prints
printData(table, 3,4,) => prints data in 3rd row 4th Column of table specified

 */

        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement table= driver.findElement(By.id("table1"));

        //Print the entire table
        List<WebElement> headers = table.findElements(By.tagName("th"));
        for (WebElement header : headers) {
            System.out.print(header.getText() + " ");
        }
        System.out.println();

        //Print All Rows
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.print(col.getText() + " - ");
            }
            System.out.println();
        }

        //Print Last row data only
        WebElement lastRow= driver.findElement(By.xpath("(//tbody/tr[last()])[1]"));
        System.out.println("lastRow = " + lastRow.getText());

        //Print column 5 data in the table body
        WebElement fifthColumn= driver.findElement(By.xpath("(//tbody/tr/td[5])[4]"));
        System.out.println("fifthColumn = " + fifthColumn.getText());

        //prints data in 3rd row 4th Column of table specified
        System.out.println("Datas = " + methodTable(table, 3, 4));

    }

    // Write a method that accepts 3 parameters
    //parameter 1 = table, parameter 2 = row number, parameter 3 = column number
    public String  methodTable(WebElement table, int rowNo, int columnNo){

        By locator = By.xpath(".//tr[" + rowNo + "]//td[" + columnNo + "]");
        WebElement cell = table.findElement(locator);

        return cell.getText();

    }
}
