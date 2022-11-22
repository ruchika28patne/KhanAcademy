package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class  Parametrization {
     public static String getExcelData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
    	FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse\\java-2022-06\\eclipse\\August\\KhanAcademy\\src\\test");
    	 
    	 
    	 String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
    	 
    	 return value;
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
