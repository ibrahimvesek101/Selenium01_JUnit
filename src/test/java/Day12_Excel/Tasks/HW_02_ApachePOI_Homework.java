package Day12_Excel.Tasks;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;

public class HW_02_ApachePOI_Homework {

    @Test
    public void test() throws IOException {
        /*
Store the path of the file as string and open the file.
Open the workbook.
Open the first worksheet.
Go to the first row.
Create a cell on the 3rd column (2nd index) on the first row.
Write “POPULATION” on that cell.
Create a cell on the 2nd row 3rd cell(index2), and write data.
Create a cell on the 3rd row 3rd cell(index2), and write data.
Create a cell on the 4th row 3rd cell(index2), and write data.
Write and save the workbook.
Close the file.
Close the workbook.


Dosyanın yolunu dize olarak saklayın ve dosyayı açın.
Çalışma kitabını açın.
İlk çalışma sayfasını açın.
İlk satıra git.
İlk satırda 3. sütunda (2. dizin) bir hücre oluşturun.
Bu hücreye “Nüfus” yazın.
2. sıra 3. hücreye(index2) bir hücre oluşturun ve veriyi yazın.
3. sıra 3. hücrede (index2) bir hücre oluşturun ve verileri yazın.
4. sıra 3. hücreye(index2) bir hücre oluşturun ve veriyi yazın.
Çalışma kitabını yazın ve kaydedin.
Dosyayı kapatın.
Çalışma kitabını kapatın.
         */

        String path = System.getProperty("user.dir") + "/src/test/resources/excelfile.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheetAt(0);

        Row row1=sheet.getRow(0);
        Cell sa1su3= row1.createCell(2);
        sa1su3.setCellValue("Nüfus");

        Row row2=sheet.getRow(1);
        Cell sa2su3=row2.createCell(2);
        sa2su3.setCellValue("satır2sutun3");

        Row row3=sheet.getRow(2);
        Cell sa3su3=row3.createCell(2);
        sa3su3.setCellValue("satır3sutun3");

        Row row4=sheet.getRow(3);
        Cell sa4su3=row4.createCell(2);
        sa4su3.setCellValue("satır4sutun3");


        FileOutputStream fos= new FileOutputStream(path);
        wb.write(fos);

        fis.close();
        fos.close();
        wb.close();



        /* yazmanın başka bir yöntemi: tek sıra:

         String path = System.getProperty("user.dir") + "/src/test/resources/excelfile.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet1 = wb.getSheetAt(0);

        sheet1.getRow(4).getCell(4).setCellValue("vesek");    //tek sırada yazılabilir.

        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);

        wb.close();
        fis.close();
        fos.close();

         */
    }
}