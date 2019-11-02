package dataprovider2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class TestUtil {

	static FileInputStream file;
    static Workbook book;
//	static Sheet sheet;
//	XSSFWorkbook book;
	
	public static Object[][] getTestData(String sheetName){ 
		FileInputStream file=null;
		
		try {
			 file = new FileInputStream("C:\\Users\\Public\\Documents\\Open Office\\Login2.sxc");
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
	
			e.printStackTrace();
		}
		
		try {
			xssf
			 Workbook book = XSSFWorkbookFactory.create(file);
//			 book = WorkbookFactory.create(file);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 
		
		XSSFSheet sheet = (XSSFSheet) book.getSheet(sheetName);
		
		Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++){
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++){
				
				data[i][j]= sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		return data;
		
	}
}
