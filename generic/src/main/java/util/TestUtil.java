package util;

import com.sun.media.sound.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestUtil {
    static Workbook book;
    static Sheet sheet;
    public static String TESTDATA_SHEET_PATH = ("/Users/mdhasan/Intellij/selenium/automationfall/RuslanGroup-HasanBai/generic/src/main/java/testdataxlsx/AccessTestData.xls");
    public static Object[][] getTestData(String sheetName) throws IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        FileInputStream file = null;
        try {
            file = new FileInputStream(TESTDATA_SHEET_PATH);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        }catch (InvalidFormatException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        sheet=book.getSheet(sheetName);
        Object[][] data;
        data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i=0; i< sheet.getLastRowNum();i++){
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++){
                data[i][k]=sheet.getRow(i + 1).getCell(k).toString();
            }
        }
        return data;
    }
}
