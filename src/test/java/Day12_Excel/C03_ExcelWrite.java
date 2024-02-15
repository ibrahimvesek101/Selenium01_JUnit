package Day12_Excel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03_ExcelWrite {

    @Test
    public void writeExcel() throws IOException {

        //Excel dosyasını açmak için kullandığımız code lar..

        String path = System.getProperty("user.dir") + "/src/test/resources/excelfile.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook wb = WorkbookFactory.create(fis);

        Sheet newSheet = wb.createSheet("TestAutomation2");

        Row row1=newSheet.createRow(0);

        Cell row1cell1 = row1.createCell(0);

        row1cell1.setCellValue("İbrahim");

       Cell row1cell2= row1.createCell(1);
        row1cell2.setCellValue("Vesek");

        FileOutputStream fos= new FileOutputStream(path);

        wb.write(fos);// write methodu sayesinde yapmis oldugumuz degisiklikler FileOutputStream ile dosyaya yazilir

        fis.close();
        fos.close();
        wb.close();


    }
}