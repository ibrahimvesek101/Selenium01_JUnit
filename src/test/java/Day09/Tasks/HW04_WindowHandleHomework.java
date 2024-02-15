package Day09.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class HW04_WindowHandleHomework extends Base {
    /*

Go to URL: https://demoqa.com/browser-windows
Click on the windows - "WindowButton"
Click on all the child windows.
Print the text present on all the child windows in the console.
Print the heading of the parent window in the console.


URL'ye gidin: https:demoqa.combrowser-windows
Pencerelere tıklayın - "WindowButton"
Tüm alt pencerelere tıklayın.
Konsoldaki tüm alt pencerelerde bulunan metni yazdırın.
Ana pencerenin başlığını konsolda yazdırın.

     */

    @Test
    public void test() {
        driver.get("https://demoqa.com/browser-windows");


    }
}