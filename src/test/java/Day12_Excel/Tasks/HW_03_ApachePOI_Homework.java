package Day12_Excel.Tasks;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;

public class HW_03_ApachePOI_Homework {

    @Test
    public void test() throws IOException {
        /*
Create an object of File class to open xlsx file.
Create an object of FileInputStream class to read excel file.
Creating workbook instance that refers to .xlsx file.
Creating a Sheet object.
Get all rows in the sheet.
Create a row object to retrieve row at index 3.
Create a cell object to enter value in it using cell Index.
Write the data in excel using output stream.


xlsx dosyasını açmak için File sınıfından bir nesne oluşturun.
Excel dosyasını okumak için FileInputStream sınıfından bir nesne oluşturun.
xlsx dosyasına başvuran çalışma kitabı örneği oluşturma.
Sayfa nesnesi oluşturma.



Sayfadaki tüm satırları alın.
Dizin 3'teki satırı almak için bir satır nesnesi oluşturun.
Hücre Dizini'ni kullanarak değer girmek için bir hücre nesnesi oluşturun.
Çıkış akışını kullanarak verileri excel'e yazın.

         */

        String path = System.getProperty("user.dir") + "/src/test/resources/excelfile.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet1 = wb.getSheetAt(0);
        int satırSayısı=sheet1.getLastRowNum();
        System.out.println("satırSayısı = " + satırSayısı);

        System.out.println(sheet1.getRow(3).getCell(0));


        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);


        wb.close();
        fis.close();
        fos.close();
    }
}
