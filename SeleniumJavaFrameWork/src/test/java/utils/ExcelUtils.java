package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFSheet sheet = null;
	static String ProjectPath;
	static XSSFWorkbook workBook;

	public ExcelUtils(String excelPath, String sheetName){

		ProjectPath= System.getProperty("user.dir");

		try {
			workBook = new XSSFWorkbook(excelPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = workBook.getSheet(sheetName);

	}

//	public static void main(String[] args) {
//		getRowCount();
//		getCellDataString(0,0);
//		getCellDataNumber(1,1);
//	}
	public static int getRowCount(){

		int rowCount =sheet.getPhysicalNumberOfRows();
		System.out.println("The number of Rows"+rowCount);

		return rowCount;


	}
	
	public static int getColCount(){

		int colCount =sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("The number of Columns"+colCount);

		return colCount;

	}


	public static  String getCellDataString(int rowNum, int colNum){
		String cellData= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println("Cell Value =>"+cellData);

		return cellData;
	}

	public static  void getCellDataNumber(int rowNum, int colNum){
		double cellData= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		//System.out.println("Cell Value =>"+cellData);

	}

}
