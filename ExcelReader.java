package ReadingDataFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	// Create a method which will accept only sheet name and this will read complete
	// data and return 2D Object array

	static XSSFWorkbook wb;

	public static Object[][] getDataFromExcel(String sheetName) {

		Object[][] arr = null;

		try {

			wb = new XSSFWorkbook(new FileInputStream(new File("./ReadfromExcelData/Data.xlsx")));

			int rows = wb.getSheet(sheetName).getPhysicalNumberOfRows();

			int column = wb.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();

			arr = new Object[rows - 1][column];

			for (int i = 1; i < rows; i++) {

				for (int j = 0; j < column; j++) {

					//arr[i - 1][j] = wb.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
					
					arr[i-1][j] = getData(sheetName, i , j);
				}
			}

			wb.close();
		}

		catch (FileNotFoundException e) {

			System.out.println("File not found " + e.getMessage());
		}

		catch (IOException e) {

			System.out.println("Unable to read file " + e.getMessage());
		}

		return arr;
	}

	public static String getData(String sheetName, int row, int column) {

		// Link , date etc
		
		String data = "";

		CellType type = wb.getSheet(sheetName).getRow(row).getCell(column).getCellType();

		if (type == CellType.STRING) {

			data = wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		}

		else if (type == CellType.NUMERIC) {

			double value = wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();

			data = String.valueOf(value);

		}

		else if (type == CellType.BOOLEAN) {

			boolean value = wb.getSheet(sheetName).getRow(row).getCell(column).getBooleanCellValue();

			data = String.valueOf(value);
		}

		else if (type == CellType.BLANK) {

			data = "";
		}

		return data;
	}

}
