package Day09.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.awt.*;

public class HW03_WindowHandleHomework extends Base {
    /*
Go to URL: https://testproject.io/
Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page.
https://blog.testproject.io/

TestProject Blog sayfası için yeni bir Pencere açmak için URL: https:testproject.io
 Selenium'un 4 newWindow() yöntemine gidin.
 https:blog.testproject.io

     */

    @Test
    public void test() throws InterruptedException {

        driver.get("https://testproject.io/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://blog.testproject.io/");



    }
}