package POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelReadandWrite {

public static String fileName = "E:\\git\\Selenium_3_Class\\TestData\\Datatest.xlsx";
public static String SheetName = "Sheet3";
public static int rowNum = 0;
public static int colName = 0;
public static String Value ="Hi";

@Test 
public static void Test1() throws InvalidFormatException, IOException {
	setCellVal(fileName, SheetName, rowNum, colName, Value);
	System.out.println("Value is set");
	
	String value = getCellVal(fileName, SheetName, rowNum, colName, Value);
	System.out.println(value);

}

	
	public static void setCellVal(String fileName,String SheetName,int rowNum,int colName,String Value) throws InvalidFormatException, IOException {
		FileInputStream fs = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fs);
		wb.getSheet(SheetName).createRow(rowNum).createCell(colName).setCellValue(Value);
		FileOutputStream fos = new FileOutputStream(fileName);
		wb.write(fos);
	}
	
	public static String getCellVal(String fileName,String SheetName,int rowNum,int colName,String Value) throws InvalidFormatException, IOException {
		FileInputStream fs = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fs);
		String cellValue =wb.getSheet(SheetName).getRow(rowNum).getCell(colName).getStringCellValue();
		return cellValue;
	
}
}