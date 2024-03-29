package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {

	static FileInputStream file;
	static Workbook book;
	static Sheet sheet;
	
	public static Object[][] getTestData(String sheetName){ 
		FileInputStream file=null;
		
		try {
			 file = new FileInputStream("C:\\Users\\swapnil\\workspace\\new2\\SeleniumInterview\\src\\dataprovider\\FreeCrmTestData.xlsx");
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
	
			e.printStackTrace();
		}
		
		try {
			 book = WorkbookFactory.create(file);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 sheet = book.getSheet(sheetName);
		
		Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++){
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++){
				
				data[i][j]= sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		return data;
		
	}
}
