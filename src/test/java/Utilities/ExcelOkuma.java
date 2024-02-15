package Utilities;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelOkuma {

    public static String excelDataOku(String sayfaIsim,int satirNo, int sutunNo) throws IOException {
        String okunanData="";

        String filePath = System.getProperty("user.dir") + "/src/test/resources/excelfile.xlsx";
        FileInputStream fis=new FileInputStream(filePath);
        Workbook wb= WorkbookFactory.create(fis);
        okunanData=wb.getSheet(sayfaIsim).getRow(satirNo-1).getCell(sutunNo-1).toString();
        return okunanData;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(excelDataOku("Sayfa1", 3, 3));

    }
}
