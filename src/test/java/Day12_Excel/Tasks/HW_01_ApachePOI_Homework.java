package Day12_Excel.Tasks;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HW_01_ApachePOI_Homework {

    @Test
    public void test() throws IOException {
/*
Add the excel file on the resources folder.
Open the file.
Open the workbook using file input stream.
Open the first worksheet.
Go to first row.
Go to first cell on that first row and print.
Go to second cell on that first row and print.
Go to 2nd row first cell and assert if the data equal to Russia.
Go to 3rd row 2nd cell-chain the row and cell.
Find the number of used row.
Print country, area key value pairs as map object.


Excel dosyasını kaynaklar klasörüne ekleyin.
Dosyayı aç.
Dosya giriş akışını kullanarak çalışma kitabını açın.
İlk çalışma sayfasını açın.
İlk sıraya git.
İlk satırdaki ilk hücreye gidin ve yazdırın.
İlk satırdaki ikinci hücreye gidin ve yazdırın.
2. sıradaki ilk hücreye gidin ve verilerin Rusya'ya eşit olup olmadığını onaylayın.
3. sıra 2. hücre zincirine gidin, sıra ve hücre.
Kullanılan satır sayısını bulun.
Ülke, alan anahtar değeri çiftlerini harita nesnesi olarak yazdırın.
 */

        String path = System.getProperty("user.dir") + "/src/test/resources/excelfile.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);

        Sheet sheet = wb.getSheetAt(0);

        Row row1 = sheet.getRow(0);

        Row row2 = sheet.getRow(1);

        Cell row1Cell1 = row1.getCell(0);

        Cell row1Cell2 = row1.getCell(1);


        //     İlk satırdaki ilk hücreye gidin ve yazdırın.
        System.out.println("hücre= " + row1Cell1.toString());

        //      İlk satırdaki ikinci hücreye gidin ve yazdırın.
        System.out.println("row1Cell2 = " + row1Cell2);

        //      2. sıradaki ilk hücreye gidin ve verilerin Rusya'ya eşit olup olmadığını onaylayın.

        Cell row2Cell1 = row2.getCell(0);
        String hücre = row2Cell1.toString();

        if (hücre.equals("Rusya")) {
            System.out.println("2.satır 1.hücre Rusya ya eşit.");
        } else {
            System.out.println("2.satır 1.hücre Rusya ya eşit değil.");
        }

        //      Kullanılan satır sayısını bulun.

        System.out.println("Kullanılan satır sayısı: " + (sheet.getLastRowNum() + 1));

        //      Ülke, alan anahtar değeri çiftlerini harita nesnesi olarak yazdırın.


        int satirSayisi = sheet.getLastRowNum();
        int sutunSayisi = sheet.getRow(0).getLastCellNum();
        System.out.println("sutunSayisi = " + sutunSayisi);

        String[][] arr = new String[satirSayisi+1][sutunSayisi+1];

        for (int i = 0; i <= satirSayisi; i++) {

            for (int j = 0; j < sutunSayisi; j++) {

                arr[i][j] = sheet.getRow(i).getCell(j).toString();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        wb.close();
        fis.close();
    }
}
