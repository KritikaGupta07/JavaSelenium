package ReadingDataFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {
	
	@Test
	public void test1() throws IOException {
		
		File src = new File("./ReadFromExcelData/Data.xlsx");
		
		//FileInputStream for reading excel
		//FileOutputStream for writing excel
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		int totalSheets = wb.getNumberOfSheets();
		
		System.out.println("Total Sheets :- " + totalSheets);
		
		XSSFSheet sh1 = wb.getSheet("application_data");
		
		XSSFRow r1 = sh1.getRow(0);
		
		XSSFCell c1 = r1.getCell(0);
		
		String value = c1.getStringCellValue();
		
		System.out.println("Data Cell from Excel  : " + value);
		
		wb.close();
	}

}
