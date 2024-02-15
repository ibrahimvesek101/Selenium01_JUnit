package deneme;

import Utilities.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class sosyal_takip  {
    public static WebDriver driver;
    @Test
    public void test01_Aile() throws IOException {
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.turkiye.gov.tr/ashb-sosyal-yardim-bilgileri-sorgulama");
        driver.findElement(By.xpath("//*[@class='loginLink']")).click();

        WebElement tc = driver.findElement(By.id("tridField"));
        tc.sendKeys("40553145018");

        WebElement sifre = driver.findElement(By.id("egpField"));
        sifre.sendKeys("vesekzeren2936" + Keys.ENTER);

        WebElement text = driver.findElement(By.xpath("//*[@class='resultTable']/tbody/tr[1]/td[5]"));
        String aileText = text.getText();
        System.out.println("textString = " + aileText);


        if (aileText.contains("-")) {
            System.out.println("\n(Aile) ÖDEME BEKLENİYOR");
        } else
            System.out.println("\n(Aile) ÖDEMENİZ HAZIRDIR.....");

        excelleYaz("Aile", "sosyal", 2, aileText);
    }

    @Test
    public void test02_Elektrik() throws IOException {

        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.turkiye.gov.tr/ashb-sosyal-yardim-bilgileri-sorgulama");
        driver.findElement(By.xpath("//*[@class='loginLink']")).click();

        WebElement tc = driver.findElement(By.id("tridField"));
        tc.sendKeys("40553145018");

        WebElement sifre = driver.findElement(By.id("egpField"));
        sifre.sendKeys("vesekzeren2936" + Keys.ENTER);

        WebElement text = driver.findElement(By.xpath("//*[@class='resultTable']/tbody/tr[2]/td[5]"));
        String elektrikText = text.getText();
        System.out.println("textString = " + elektrikText);
        if (elektrikText.contains("-")) {
            System.out.println("\n(Elektrik) ÖDEME BEKLENİYOR");
        } else
            System.out.println("\n(Elektrik) ÖDEMENİZ HAZIRDIR.....");

        excelleYaz("Elektrik", "sosyal", 3, elektrikText);

    }

    public static void excelleYaz(String bolum, String sayfa, int satir, String data) throws IOException {

        String path = "/Users/ibrahim/Desktop/IT/sorgu_sonuclari.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook wb = WorkbookFactory.create(fis);

        Sheet sheet = wb.getSheet(sayfa);    //yeni sayfa oluşturabiliriz her seferinde veya sosyal adında bir sheet tanımlayıp her seferinde "sosyal" e kaydedebiliriz..

        Row row = sheet.createRow(satir - 1);

        Cell rowCell = row.createCell(0);

        rowCell.setCellValue(bolum + "__" + getDate() + "__" + getTime());

        Cell row1Cell2 = row.createCell(1);
        row1Cell2.setCellValue(data);

        FileOutputStream fos = new FileOutputStream(path);

        wb.write(fos);// write methodu sayesinde yapmis oldugumuz degisiklikler FileOutputStream ile dosyaya yazilir
        fis.close();
        fos.close();
        wb.close();
    };

    public static String getDate() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dateFormat.format(now);
        return date;
    }

    public static String getTime() {
        Date now = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        String time = timeFormat.format(now);
        return time;
    }
}
