package ReadingDataFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class AllDataProviderFromExcelToArray {

	@DataProvider(name = "appdatafromexcel")
	public static Object[][] testData_Excel() throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(new File("./ReadFromExcelData/Data.xlsx")));
		
		int rows = wb.getSheet("application_data").getPhysicalNumberOfRows();
		
		int columns = wb.getSheet("application_data").getRow(0).getPhysicalNumberOfCells();
		
		Object [][]arr = new Object[rows][columns];
		
		for(int i = 0 ; i < rows ; i++) {
			
			for(int j = 0 ; j < columns ; j++) {
				
				arr[i][j] = wb.getSheet("application_data").getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		wb.close();
		
		return arr;
	}
	
}
